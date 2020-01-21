package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventCategoriesMessage extends js.Object {
  /**
    * Filters applied to the action.
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    *  The type of AWS DMS resource that generates events.  Valid values: replication-instance | replication-task
    */
  var SourceType: js.UndefOr[String] = js.native
}

object DescribeEventCategoriesMessage {
  @scala.inline
  def apply(Filters: FilterList = null, SourceType: String = null): DescribeEventCategoriesMessage = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEventCategoriesMessage]
  }
}

