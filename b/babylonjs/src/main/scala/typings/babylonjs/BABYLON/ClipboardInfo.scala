package typings.babylonjs.BABYLON

import typings.std.ClipboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClipboardInfo extends js.Object {
  /**
    * Defines the related dom event
    */
  var event: ClipboardEvent
  /**
    * Defines the type of event (BABYLON.ClipboardEventTypes)
    */
  var `type`: Double
}

object ClipboardInfo {
  @scala.inline
  def apply(event: ClipboardEvent, `type`: Double): ClipboardInfo = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipboardInfo]
  }
}

