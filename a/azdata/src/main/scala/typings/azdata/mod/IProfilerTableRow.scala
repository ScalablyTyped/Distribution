package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProfilerTableRow extends js.Object {
  /**
    * Name of the event; known issue this is not camel case, need to figure
    * out a better way to determine column id's from rendered column names
    */
  var EventClass: String
}

object IProfilerTableRow {
  @scala.inline
  def apply(EventClass: String): IProfilerTableRow = {
    val __obj = js.Dynamic.literal(EventClass = EventClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProfilerTableRow]
  }
}

