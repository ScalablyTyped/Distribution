package typings.deluge.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  var state: js.Array[js.Tuple2[String, Double]] = js.native
  var tracker_host: js.Array[js.Tuple2[String, Double]] = js.native
}

object State {
  @scala.inline
  def apply(state: js.Array[js.Tuple2[String, Double]], tracker_host: js.Array[js.Tuple2[String, Double]]): State = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], tracker_host = tracker_host.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
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
    def setStateVarargs(value: (js.Tuple2[String, Double])*): Self = this.set("state", js.Array(value :_*))
    @scala.inline
    def setState(value: js.Array[js.Tuple2[String, Double]]): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setTracker_hostVarargs(value: (js.Tuple2[String, Double])*): Self = this.set("tracker_host", js.Array(value :_*))
    @scala.inline
    def setTracker_host(value: js.Array[js.Tuple2[String, Double]]): Self = this.set("tracker_host", value.asInstanceOf[js.Any])
  }
  
}

