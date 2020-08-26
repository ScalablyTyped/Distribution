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
  def apply(): DescribeEventCategoriesMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventCategoriesMessage]
  }
  @scala.inline
  implicit class DescribeEventCategoriesMessageOps[Self <: DescribeEventCategoriesMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSourceType(value: String): Self = this.set("SourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceType: Self = this.set("SourceType", js.undefined)
  }
  
}

