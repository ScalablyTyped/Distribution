package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLicenseSpecificationsForResourceRequest extends js.Object {
  /**
    * Maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[BoxInteger] = js.native
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Amazon Resource Name (ARN) of a resource that has an associated license configuration.
    */
  var ResourceArn: String = js.native
}

object ListLicenseSpecificationsForResourceRequest {
  @scala.inline
  def apply(ResourceArn: String): ListLicenseSpecificationsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLicenseSpecificationsForResourceRequest]
  }
  @scala.inline
  implicit class ListLicenseSpecificationsForResourceRequestOps[Self <: ListLicenseSpecificationsForResourceRequest] (val x: Self) extends AnyVal {
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
    def setResourceArn(value: String): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: BoxInteger): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

