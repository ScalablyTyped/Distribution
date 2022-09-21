package typings.chromeLauncher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcChromeFinderMod {
  
  @JSImport("chrome-launcher/dist/src/chrome-finder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def darwin(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("darwin")().asInstanceOf[js.Array[String]]
  
  inline def linux(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("linux")().asInstanceOf[js.Array[String]]
  
  inline def win32(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("win32")().asInstanceOf[js.Array[String]]
  
  inline def wsl(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("wsl")().asInstanceOf[js.Array[String]]
}
