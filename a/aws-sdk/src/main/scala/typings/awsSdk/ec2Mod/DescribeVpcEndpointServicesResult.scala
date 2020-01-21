package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVpcEndpointServicesResult extends js.Object {
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the service.
    */
  var ServiceDetails: js.UndefOr[ServiceDetailSet] = js.native
  /**
    * A list of supported services.
    */
  var ServiceNames: js.UndefOr[ValueStringList] = js.native
}

object DescribeVpcEndpointServicesResult {
  @scala.inline
  def apply(
    NextToken: String = null,
    ServiceDetails: ServiceDetailSet = null,
    ServiceNames: ValueStringList = null
  ): DescribeVpcEndpointServicesResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ServiceDetails != null) __obj.updateDynamic("ServiceDetails")(ServiceDetails.asInstanceOf[js.Any])
    if (ServiceNames != null) __obj.updateDynamic("ServiceNames")(ServiceNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVpcEndpointServicesResult]
  }
}

