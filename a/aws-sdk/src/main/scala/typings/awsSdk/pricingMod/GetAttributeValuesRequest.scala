package typings.awsSdk.pricingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAttributeValuesRequest extends js.Object {
  /**
    * The name of the attribute that you want to retrieve the values for, such as volumeType.
    */
  var AttributeName: String = js.native
  /**
    * The maximum number of results to return in response.
    */
  var MaxResults: js.UndefOr[BoxedInteger] = js.native
  /**
    * The pagination token that indicates the next set of results that you want to retrieve.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The service code for the service whose attributes you want to retrieve. For example, if you want the retrieve an EC2 attribute, use AmazonEC2.
    */
  var ServiceCode: String = js.native
}

object GetAttributeValuesRequest {
  @scala.inline
  def apply(
    AttributeName: String,
    ServiceCode: String,
    MaxResults: Int | Double = null,
    NextToken: String = null
  ): GetAttributeValuesRequest = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], ServiceCode = ServiceCode.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAttributeValuesRequest]
  }
}

