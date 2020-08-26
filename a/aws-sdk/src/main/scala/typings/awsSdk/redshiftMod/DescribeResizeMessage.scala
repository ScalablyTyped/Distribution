package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeResizeMessage extends js.Object {
  /**
    * The unique identifier of a cluster whose resize progress you are requesting. This parameter is case-sensitive. By default, resize operations for all clusters defined for an AWS account are returned.
    */
  var ClusterIdentifier: String = js.native
}

object DescribeResizeMessage {
  @scala.inline
  def apply(ClusterIdentifier: String): DescribeResizeMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeResizeMessage]
  }
  @scala.inline
  implicit class DescribeResizeMessageOps[Self <: DescribeResizeMessage] (val x: Self) extends AnyVal {
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
    def setClusterIdentifier(value: String): Self = this.set("ClusterIdentifier", value.asInstanceOf[js.Any])
  }
  
}

