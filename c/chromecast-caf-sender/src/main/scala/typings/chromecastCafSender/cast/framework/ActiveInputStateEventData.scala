package typings.chromecastCafSender.cast.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveInputStateEventData extends EventData {
  var activeInputState: ActiveInputState = js.native
}

object ActiveInputStateEventData {
  @scala.inline
  def apply(activeInputState: ActiveInputState, `type`: String): ActiveInputStateEventData = {
    val __obj = js.Dynamic.literal(activeInputState = activeInputState.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveInputStateEventData]
  }
  @scala.inline
  implicit class ActiveInputStateEventDataOps[Self <: ActiveInputStateEventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveInputState(value: ActiveInputState): Self = this.set("activeInputState", value.asInstanceOf[js.Any])
  }
  
}

