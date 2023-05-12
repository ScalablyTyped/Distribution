package typings.cucumberCucumber

import typings.cucumberCucumber.libTypesMod.ILineAndUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSupportCodeLibraryBuilderGetDefinitionLineAndUriMod {
  
  @JSImport("@cucumber/cucumber/lib/support_code_library_builder/get_definition_line_and_uri", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDefinitionLineAndUri(cwd: String): ILineAndUri = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefinitionLineAndUri")(cwd.asInstanceOf[js.Any]).asInstanceOf[ILineAndUri]
  inline def getDefinitionLineAndUri(cwd: String, isExcluded: js.Function1[/* fileName */ String, Boolean]): ILineAndUri = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefinitionLineAndUri")(cwd.asInstanceOf[js.Any], isExcluded.asInstanceOf[js.Any])).asInstanceOf[ILineAndUri]
}
