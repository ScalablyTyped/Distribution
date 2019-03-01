package typings
package delugeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_State extends js.Object {
  var state: js.Array[js.Tuple2[java.lang.String, scala.Double]]
  var tracker_host: js.Array[js.Tuple2[java.lang.String, scala.Double]]
}

object Anon_State {
  @scala.inline
  def apply(
    state: js.Array[js.Tuple2[java.lang.String, scala.Double]],
    tracker_host: js.Array[js.Tuple2[java.lang.String, scala.Double]]
  ): Anon_State = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("tracker_host")(tracker_host)
    __obj.asInstanceOf[Anon_State]
  }
}

