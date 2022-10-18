package typings.cesium

import typings.cesium.mod.requestAnimationFrameCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCoreRequestAnimationFrameMod {
  
  @JSImport("cesium/Source/Core/requestAnimationFrame", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(callback: requestAnimationFrameCallback): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(callback.asInstanceOf[js.Any]).asInstanceOf[Double]
}
