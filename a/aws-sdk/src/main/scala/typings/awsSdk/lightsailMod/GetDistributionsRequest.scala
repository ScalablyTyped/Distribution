package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDistributionsRequest extends js.Object {
  /**
    * The name of the distribution for which to return information. Use the GetDistributions action to get a list of distribution names that you can specify. When omitted, the response includes all of your distributions in the AWS Region where the request is made.
    */
  var distributionName: js.UndefOr[ResourceName] = js.native
  /**
    * The token to advance to the next page of results from your request. To get a page token, perform an initial GetDistributions request. If your results are paginated, the response will return a next page token that you can specify as the page token in a subsequent request.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object GetDistributionsRequest {
  @scala.inline
  def apply(): GetDistributionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDistributionsRequest]
  }
  @scala.inline
  implicit class GetDistributionsRequestOps[Self <: GetDistributionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDistributionName(value: ResourceName): Self = this.set("distributionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistributionName: Self = this.set("distributionName", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
  }
  
}

