package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.TargetedAnimation")
@js.native
class TargetedAnimation () extends js.Object {
  /**
    * Animation to perform
    */
  var animation: Animation = js.native
  /**
    * Target to animate
    */
  var target: js.Any = js.native
  /**
    * Serialize the object
    * @returns the JSON object representing the current entity
    */
  def serialize(): js.Any = js.native
}

