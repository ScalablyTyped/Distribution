package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FresnelParameters extends js.Object {
  var _isEnabled: js.Any = js.native
  /**
    * Define bias applied to computed fresnel term
    */
  var bias: Double = js.native
  /**
    * Define the color used on edges (grazing angle)
    */
  var leftColor: Color3 = js.native
  /**
    * Defined the power exponent applied to fresnel term
    */
  var power: Double = js.native
  /**
    * Define the color used on center
    */
  var rightColor: Color3 = js.native
  /**
    * Define if the fresnel effect is enable or not.
    */
  def isEnabled: Boolean = js.native
  def isEnabled(value: Boolean): js.Any = js.native
  /**
    * Serializes the current fresnel parameters to a JSON representation.
    * @return the JSON serialization
    */
  def serialize(): js.Any = js.native
}

