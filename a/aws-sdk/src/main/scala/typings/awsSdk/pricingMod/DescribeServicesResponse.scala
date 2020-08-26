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
  def apply(): DescribeServicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeServicesResponse]
  }
  @scala.inline
  implicit class DescribeServicesResponseOps[Self <: DescribeServicesResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setServicesVarargs(value: Service*): Self = this.set("Services", js.Array(value :_*))
    @scala.inline
    def setServices(value: ServiceList): Self = this.set("Services", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServices: Self = this.set("Services", js.undefined)
  }
  
}

