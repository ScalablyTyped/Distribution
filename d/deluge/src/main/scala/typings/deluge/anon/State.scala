package typings.deluge.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var state: js.Array[js.Tuple2[String, Double]]
  var tracker_host: js.Array[js.Tuple2[String, Double]]
}

object State {
  @scala.inline
  def apply(state: js.Array[js.Tuple2[String, Double]], tracker_host: js.Array[js.Tuple2[String, Double]]): State = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], tracker_host = tracker_host.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

