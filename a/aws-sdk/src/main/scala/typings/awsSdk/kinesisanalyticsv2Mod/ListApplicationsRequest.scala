package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListApplicationsRequest extends js.Object {
  /**
    * The maximum number of applications to list.
    */
  var Limit: js.UndefOr[ListApplicationsInputLimit] = js.native
  /**
    * If a previous command returned a pagination token, pass it into this value to retrieve the next set of results. For more information about pagination, see Using the AWS Command Line Interface's Pagination Options.
    */
  var NextToken: js.UndefOr[ApplicationName] = js.native
}

object ListApplicationsRequest {
  @scala.inline
  def apply(): ListApplicationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationsRequest]
  }
  @scala.inline
  implicit class ListApplicationsRequestOps[Self <: ListApplicationsRequest] (val x: Self) extends AnyVal {
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
    def setLimit(value: ListApplicationsInputLimit): Self = this.set("Limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    @scala.inline
    def setNextToken(value: ApplicationName): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

