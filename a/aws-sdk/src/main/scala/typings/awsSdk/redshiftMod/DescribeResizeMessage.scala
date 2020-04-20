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
}

