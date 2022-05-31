package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IValueGradient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.GradientHelper")
@js.native
class GradientHelper ()
  extends StObject
     with typings.babylonjs.BABYLON.GradientHelper
/* static members */
object GradientHelper {
  
  @JSGlobal("BABYLON.GradientHelper")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets the current gradient from an array of IValueGradient
    * @param ratio defines the current ratio to get
    * @param gradients defines the array of IValueGradient
    * @param updateFunc defines the callback function used to get the final value from the selected gradients
    */
  inline def GetCurrentGradient(
    ratio: Double,
    gradients: js.Array[IValueGradient],
    updateFunc: js.Function3[/* current */ IValueGradient, /* next */ IValueGradient, /* scale */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("GetCurrentGradient")(ratio.asInstanceOf[js.Any], gradients.asInstanceOf[js.Any], updateFunc.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
