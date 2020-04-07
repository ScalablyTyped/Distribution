package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GamePadFactory extends js.Object {
  /**
    * Returns whether or not the current gamepad can be created for this type of controller.
    * @param gamepadInfo Defines the gamepad info as received from the controller APIs.
    * @returns true if it can be created, otherwise false
    */
  def canCreate(gamepadInfo: js.Any): Boolean
  /**
    * Creates a new instance of the Gamepad.
    * @param gamepadInfo Defines the gamepad info as received from the controller APIs.
    * @returns the new gamepad instance
    */
  def create(gamepadInfo: js.Any): Gamepad
}

object GamePadFactory {
  @scala.inline
  def apply(canCreate: js.Any => Boolean, create: js.Any => Gamepad): GamePadFactory = {
    val __obj = js.Dynamic.literal(canCreate = js.Any.fromFunction1(canCreate), create = js.Any.fromFunction1(create))
  
    __obj.asInstanceOf[GamePadFactory]
  }
}

