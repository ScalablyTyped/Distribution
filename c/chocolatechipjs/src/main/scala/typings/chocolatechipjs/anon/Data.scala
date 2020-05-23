package typings.chocolatechipjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  /**
    * DO NOT TOUCH! This stores information about registered events.
    */
  var events: Delete
}

object Data {
  @scala.inline
  def apply(events: Delete): Data = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

