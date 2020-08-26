package typings.awsSdk.pricingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAttributeValuesResponse extends js.Object {
  /**
    * The list of values for an attribute. For example, Throughput Optimized HDD and Provisioned IOPS are two available values for the AmazonEC2 volumeType.
    */
  var AttributeValues: js.UndefOr[AttributeValueList] = js.native
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object GetAttributeValuesResponse {
  @scala.inline
  def apply(): GetAttributeValuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAttributeValuesResponse]
  }
  @scala.inline
  implicit class GetAttributeValuesResponseOps[Self <: GetAttributeValuesResponse] (val x: Self) extends AnyVal {
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
    def setAttributeValuesVarargs(value: AttributeValue*): Self = this.set("AttributeValues", js.Array(value :_*))
    @scala.inline
    def setAttributeValues(value: AttributeValueList): Self = this.set("AttributeValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeValues: Self = this.set("AttributeValues", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

