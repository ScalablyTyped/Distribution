package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GradientBlockColorStep extends js.Object {
  
  var _color: js.Any = js.native
  
  var _step: js.Any = js.native
  
  /**
    * Gets the color associated with this step
    */
  def color: Color3 = js.native
  /**
    * Sets the color associated with this step
    */
  def color_=(`val`: Color3): Unit = js.native
  
  /**
    * Gets value indicating which step this color is associated with (between 0 and 1)
    */
  def step: Double = js.native
  /**
    * Sets a value indicating which step this color is associated with (between 0 and 1)
    */
  def step_=(`val`: Double): Unit = js.native
}
