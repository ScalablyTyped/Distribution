package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventCategoriesMessage extends js.Object {
  /**
    * This parameter isn't currently supported.
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The type of source that is generating the events. Valid values: db-instance | db-parameter-group | db-security-group | db-snapshot
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

