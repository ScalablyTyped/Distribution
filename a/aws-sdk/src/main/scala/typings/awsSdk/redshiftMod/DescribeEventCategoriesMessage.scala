package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventCategoriesMessage extends js.Object {
  /**
    * The source type, such as cluster or parameter group, to which the described event categories apply. Valid values: cluster, cluster-snapshot, cluster-parameter-group, cluster-security-group, and scheduled-action.
    */
  var SourceType: js.UndefOr[String] = js.native
}

object DescribeEventCategoriesMessage {
  @scala.inline
  def apply(SourceType: String = null): DescribeEventCategoriesMessage = {
    val __obj = js.Dynamic.literal()
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEventCategoriesMessage]
  }
}

