package typings.cosmiconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distGetDirectoryMod {
  
  @JSImport("cosmiconfig/dist/getDirectory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDirectory(filepath: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDirectory")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getDirectorySync(filepath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDirectorySync")(filepath.asInstanceOf[js.Any]).asInstanceOf[String]
}
