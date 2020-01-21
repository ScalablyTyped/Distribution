package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVpcEndpointConnectionNotificationsResult extends js.Object {
  /**
    * One or more notifications.
    */
  var ConnectionNotificationSet: js.UndefOr[typings.awsSdk.ec2Mod.ConnectionNotificationSet] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeVpcEndpointConnectionNotificationsResult {
  @scala.inline
  def apply(ConnectionNotificationSet: ConnectionNotificationSet = null, NextToken: String = null): DescribeVpcEndpointConnectionNotificationsResult = {
    val __obj = js.Dynamic.literal()
    if (ConnectionNotificationSet != null) __obj.updateDynamic("ConnectionNotificationSet")(ConnectionNotificationSet.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVpcEndpointConnectionNotificationsResult]
  }
}

