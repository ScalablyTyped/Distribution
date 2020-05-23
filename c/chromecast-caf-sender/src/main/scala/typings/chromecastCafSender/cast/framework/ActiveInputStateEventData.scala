package typings.chromecastCafSender.cast.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveInputStateEventData extends EventData {
  var activeInputState: ActiveInputState
}

object ActiveInputStateEventData {
  @scala.inline
  def apply(activeInputState: ActiveInputState, `type`: String): ActiveInputStateEventData = {
    val __obj = js.Dynamic.literal(activeInputState = activeInputState.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveInputStateEventData]
  }
}

