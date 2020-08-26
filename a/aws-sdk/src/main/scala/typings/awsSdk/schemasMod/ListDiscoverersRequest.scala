package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDiscoverersRequest extends js.Object {
  /**
    * Specifying this limits the results to only those discoverer IDs that start with the specified prefix.
    */
  var DiscovererIdPrefix: js.UndefOr[string] = js.native
  var Limit: js.UndefOr[integer] = js.native
  /**
    * The token that specifies the next page of results to return. To request the first page, leave NextToken empty. The token will expire in 24 hours, and cannot be shared with other accounts.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * Specifying this limits the results to only those ARNs that start with the specified prefix.
    */
  var SourceArnPrefix: js.UndefOr[string] = js.native
}

object ListDiscoverersRequest {
  @scala.inline
  def apply(): ListDiscoverersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDiscoverersRequest]
  }
  @scala.inline
  implicit class ListDiscoverersRequestOps[Self <: ListDiscoverersRequest] (val x: Self) extends AnyVal {
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
    def setDiscovererIdPrefix(value: string): Self = this.set("DiscovererIdPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiscovererIdPrefix: Self = this.set("DiscovererIdPrefix", js.undefined)
    @scala.inline
    def setLimit(value: integer): Self = this.set("Limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setSourceArnPrefix(value: string): Self = this.set("SourceArnPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceArnPrefix: Self = this.set("SourceArnPrefix", js.undefined)
  }
  
}

