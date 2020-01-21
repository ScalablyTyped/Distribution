package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeNetworkInterfacesResult extends js.Object {
  /**
    * Information about one or more network interfaces.
    */
  var NetworkInterfaces: js.UndefOr[NetworkInterfaceList] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeNetworkInterfacesResult {
  @scala.inline
  def apply(NetworkInterfaces: NetworkInterfaceList = null, NextToken: String = null): DescribeNetworkInterfacesResult = {
    val __obj = js.Dynamic.literal()
    if (NetworkInterfaces != null) __obj.updateDynamic("NetworkInterfaces")(NetworkInterfaces.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNetworkInterfacesResult]
  }
}

