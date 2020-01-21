package typings.awsSdk.pricingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeServicesResponse extends js.Object {
  /**
    * The format version of the response. For example, aws_v1.
    */
  var FormatVersion: js.UndefOr[String] = js.native
  /**
    * The pagination token for the next set of retreivable results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The service metadata for the service or services in the response.
    */
  var Services: js.UndefOr[ServiceList] = js.native
}

object DescribeServicesResponse {
  @scala.inline
  def apply(FormatVersion: String = null, NextToken: String = null, Services: ServiceList = null): DescribeServicesResponse = {
    val __obj = js.Dynamic.literal()
    if (FormatVersion != null) __obj.updateDynamic("FormatVersion")(FormatVersion.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Services != null) __obj.updateDynamic("Services")(Services.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeServicesResponse]
  }
}

