package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfilerEvent extends js.Object {
  /**
    * Event class name
    */
  var name: String
  /**
    * Event timestamp
    */
  var timestamp: String
}

object ProfilerEvent {
  @scala.inline
  def apply(name: String, timestamp: String): ProfilerEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilerEvent]
  }
}

