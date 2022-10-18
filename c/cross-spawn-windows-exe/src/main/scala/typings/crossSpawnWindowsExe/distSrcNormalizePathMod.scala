package typings.crossSpawnWindowsExe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcNormalizePathMod {
  
  @JSImport("cross-spawn-windows-exe/dist/src/normalize-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertUNIXPathToWindows(wslPath: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertUNIXPathToWindows")(wslPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def normalizePath(pathToNormalize: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePath")(pathToNormalize.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
