package typings.cucumberCucumber

import typings.cucumberCucumber.libApiTypesMod.ILoadSupportOptions
import typings.cucumberCucumber.libApiTypesMod.IRunEnvironment
import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.ISupportCodeLibrary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiLoadSupportMod {
  
  @JSImport("@cucumber/cucumber/lib/api/load_support", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadSupport(options: ILoadSupportOptions): js.Promise[ISupportCodeLibrary] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSupport")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ISupportCodeLibrary]]
  inline def loadSupport(options: ILoadSupportOptions, environment: IRunEnvironment): js.Promise[ISupportCodeLibrary] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSupport")(options.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISupportCodeLibrary]]
}
