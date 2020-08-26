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
  def apply(AttributeName: String, ServiceCode: String): GetAttributeValuesRequest = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], ServiceCode = ServiceCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAttributeValuesRequest]
  }
  @scala.inline
  implicit class GetAttributeValuesRequestOps[Self <: GetAttributeValuesRequest] (val x: Self) extends AnyVal {
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
    def setAttributeName(value: String): Self = this.set("AttributeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceCode(value: String): Self = this.set("ServiceCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: BoxedInteger): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

