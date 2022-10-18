package typings.cucumberGherkin

import typings.cucumberGherkin.distSrcIgherkinoptionsMod.IGherkinOptions
import typings.cucumberMessages.distCjsSrcMessagesMod.SourceMediaType
import typings.cucumberMessages.mod.Envelope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGenerateMessagesMod {
  
  @JSImport("@cucumber/gherkin/dist/src/generateMessages", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(data: String, uri: String, mediaType: SourceMediaType, options: IGherkinOptions): js.Array[Envelope] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any], uri.asInstanceOf[js.Any], mediaType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Envelope]]
}
