package typings.chromeLauncher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object randomPortMod {
  
  @JSImport("chrome-launcher/dist/random-port", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRandomPort(): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomPort")().asInstanceOf[js.Promise[Double]]
}
