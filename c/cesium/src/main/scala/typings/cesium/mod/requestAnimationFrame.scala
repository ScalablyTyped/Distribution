package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestAnimationFrame {
  
  inline def apply(callback: Callback): Double = ^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("cesium", "requestAnimationFrame")
  @js.native
  val ^ : js.Any = js.native
  
  type Callback = js.Function1[/* timestamp */ Double, Unit]
}
