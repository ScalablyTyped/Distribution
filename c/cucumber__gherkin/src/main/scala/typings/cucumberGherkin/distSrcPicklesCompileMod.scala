package typings.cucumberGherkin

import typings.cucumberMessages.distCjsSrcIdGeneratorMod.NewId
import typings.cucumberMessages.mod.Pickle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPicklesCompileMod {
  
  @JSImport("@cucumber/gherkin/dist/src/pickles/compile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    gherkinDocument: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IGherkinDocument */ Any,
    uri: String,
    newId: NewId
  ): js.Array[Pickle] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(gherkinDocument.asInstanceOf[js.Any], uri.asInstanceOf[js.Any], newId.asInstanceOf[js.Any])).asInstanceOf[js.Array[Pickle]]
}
