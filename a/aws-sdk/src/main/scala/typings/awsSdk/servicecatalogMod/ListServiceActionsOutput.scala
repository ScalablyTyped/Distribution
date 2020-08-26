package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListServiceActionsOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  /**
    * An object containing information about the service actions associated with the provisioning artifact.
    */
  var ServiceActionSummaries: js.UndefOr[typings.awsSdk.servicecatalogMod.ServiceActionSummaries] = js.native
}

object ListServiceActionsOutput {
  @scala.inline
  def apply(): ListServiceActionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServiceActionsOutput]
  }
  @scala.inline
  implicit class ListServiceActionsOutputOps[Self <: ListServiceActionsOutput] (val x: Self) extends AnyVal {
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
    def setNextPageToken(value: PageToken): Self = this.set("NextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("NextPageToken", js.undefined)
    @scala.inline
    def setServiceActionSummariesVarargs(value: ServiceActionSummary*): Self = this.set("ServiceActionSummaries", js.Array(value :_*))
    @scala.inline
    def setServiceActionSummaries(value: ServiceActionSummaries): Self = this.set("ServiceActionSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceActionSummaries: Self = this.set("ServiceActionSummaries", js.undefined)
  }
  
}

