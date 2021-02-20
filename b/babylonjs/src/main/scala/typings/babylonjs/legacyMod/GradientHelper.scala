package typings.babylonjs.legacyMod

import typings.babylonjs.gradientsMod.IValueGradient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "GradientHelper")
@js.native
class GradientHelper ()
  extends typings.babylonjs.indexMod.GradientHelper
/* static members */
object GradientHelper {
  
  /**
    * Gets the current gradient from an array of IValueGradient
    * @param ratio defines the current ratio to get
    * @param gradients defines the array of IValueGradient
    * @param updateFunc defines the callback function used to get the final value from the selected gradients
    */
  @JSImport("babylonjs/Legacy/legacy", "GradientHelper.GetCurrentGradient")
  @js.native
  def GetCurrentGradient(
    ratio: Double,
    gradients: js.Array[IValueGradient],
    updateFunc: js.Function3[/* current */ IValueGradient, /* next */ IValueGradient, /* scale */ Double, Unit]
  ): Unit = js.native
}
