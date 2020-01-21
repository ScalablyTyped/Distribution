package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeNetworkInterfacePermissionsResult extends js.Object {
  /**
    * The network interface permissions.
    */
  var NetworkInterfacePermissions: js.UndefOr[NetworkInterfacePermissionList] = js.native
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeNetworkInterfacePermissionsResult {
  @scala.inline
  def apply(NetworkInterfacePermissions: NetworkInterfacePermissionList = null, NextToken: String = null): DescribeNetworkInterfacePermissionsResult = {
    val __obj = js.Dynamic.literal()
    if (NetworkInterfacePermissions != null) __obj.updateDynamic("NetworkInterfacePermissions")(NetworkInterfacePermissions.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNetworkInterfacePermissionsResult]
  }
}

