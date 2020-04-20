package typings.chocolatechipjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  /**
    * DO NOT TOUCH! This stores information about registered events.
    */
  var events: AnonDelete
}

object AnonData {
  @scala.inline
  def apply(events: AnonDelete): AnonData = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}

