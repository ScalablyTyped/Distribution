package typings.cucumberGherkinUtils

import typings.cucumberGherkinUtils.distSrcGherkinDocumentHandlersMod.GherkinDocumentHandlers
import typings.cucumberGherkinUtils.distSrcGherkinDocumentWalkerMod.IFilters
import typings.cucumberGherkinUtils.distSrcGherkinDocumentWalkerMod.IHandlers
import typings.cucumberGherkinUtils.distSrcGherkinDocumentWalkerMod.default
import typings.cucumberGherkinUtils.distSrcPrettyMod.Syntax
import typings.cucumberMessages.mod.GherkinDocument
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@cucumber/gherkin-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@cucumber/gherkin-utils", "GherkinDocumentWalker")
  @js.native
  open class GherkinDocumentWalker () extends default {
    def this(filters: IFilters) = this()
    def this(filters: Unit, handlers: IHandlers) = this()
    def this(filters: IFilters, handlers: IHandlers) = this()
  }
  
  @JSImport("@cucumber/gherkin-utils", "Query")
  @js.native
  open class Query ()
    extends typings.cucumberGherkinUtils.distSrcQueryMod.default
  
  inline def pretty(gherkinDocument: GherkinDocument): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pretty")(gherkinDocument.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def pretty(gherkinDocument: GherkinDocument, syntax: Syntax): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pretty")(gherkinDocument.asInstanceOf[js.Any], syntax.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@cucumber/gherkin-utils", "rejectAllFilters")
  @js.native
  val rejectAllFilters: IFilters = js.native
  
  inline def walkGherkinDocument[Acc](
    gherkinDocument: GherkinDocument,
    initialValue: Acc,
    handlers: Partial[GherkinDocumentHandlers[Acc]]
  ): Acc = (^.asInstanceOf[js.Dynamic].applyDynamic("walkGherkinDocument")(gherkinDocument.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], handlers.asInstanceOf[js.Any])).asInstanceOf[Acc]
}
