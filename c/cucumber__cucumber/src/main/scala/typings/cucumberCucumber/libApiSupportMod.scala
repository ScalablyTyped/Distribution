package typings.cucumberCucumber

import typings.cucumberCucumber.anon.ImportPaths
import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.ISupportCodeLibrary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiSupportMod {
  
  @JSImport("@cucumber/cucumber/lib/api/support", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSupportCodeLibrary(param0: ImportPaths): js.Promise[ISupportCodeLibrary] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSupportCodeLibrary")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ISupportCodeLibrary]]
}
