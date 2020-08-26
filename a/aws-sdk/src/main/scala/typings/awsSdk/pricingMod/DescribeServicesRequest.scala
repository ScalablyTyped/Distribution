package typings.awsSdk.pricingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeServicesRequest extends js.Object {
  /**
    * The format version that you want the response to be in. Valid values are: aws_v1 
    */
  var FormatVersion: js.UndefOr[String] = js.native
  /**
    * The maximum number of results that you want returned in the response.
    */
  var MaxResults: js.UndefOr[BoxedInteger] = js.native
  /**
    * The pagination token that indicates the next set of results that you want to retrieve.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The code for the service whose information you want to retrieve, such as AmazonEC2. You can use the ServiceCode to filter the results in a GetProducts call. To retrieve a list of all services, leave this blank.
    */
  var ServiceCode: js.UndefOr[String] = js.native
}

object DescribeServicesRequest {
  @scala.inline
  def apply(): DescribeServicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeServicesRequest]
  }
  @scala.inline
  implicit class DescribeServicesRequestOps[Self <: DescribeServicesRequest] (val x: Self) extends AnyVal {
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
    def setFormatVersion(value: String): Self = this.set("FormatVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatVersion: Self = this.set("FormatVersion", js.undefined)
    @scala.inline
    def setMaxResults(value: BoxedInteger): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setServiceCode(value: String): Self = this.set("ServiceCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceCode: Self = this.set("ServiceCode", js.undefined)
  }
  
}

