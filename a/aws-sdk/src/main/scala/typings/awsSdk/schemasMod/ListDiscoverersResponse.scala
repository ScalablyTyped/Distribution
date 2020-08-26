package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDiscoverersResponse extends js.Object {
  /**
    * An array of DiscovererSummary information.
    */
  var Discoverers: js.UndefOr[listOfDiscovererSummary] = js.native
  /**
    * The token that specifies the next page of results to return. To request the first page, leave NextToken empty. The token will expire in 24 hours, and cannot be shared with other accounts.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListDiscoverersResponse {
  @scala.inline
  def apply(): ListDiscoverersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDiscoverersResponse]
  }
  @scala.inline
  implicit class ListDiscoverersResponseOps[Self <: ListDiscoverersResponse] (val x: Self) extends AnyVal {
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
    def setDiscoverersVarargs(value: DiscovererSummary*): Self = this.set("Discoverers", js.Array(value :_*))
    @scala.inline
    def setDiscoverers(value: listOfDiscovererSummary): Self = this.set("Discoverers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiscoverers: Self = this.set("Discoverers", js.undefined)
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

