package typings.babylonjs.BABYLON

import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardInfo extends js.Object {
  /**
    * Defines the related dom event
    */
  var event: KeyboardEvent
  /**
    * Defines the type of event (KeyboardEventTypes)
    */
  var `type`: Double
}

object KeyboardInfo {
  @scala.inline
  def apply(event: KeyboardEvent, `type`: Double): KeyboardInfo = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardInfo]
  }
}

