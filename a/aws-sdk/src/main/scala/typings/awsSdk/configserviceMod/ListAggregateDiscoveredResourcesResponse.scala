package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAggregateDiscoveredResourcesResponse extends js.Object {
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.native
  /**
    * Returns a list of ResourceIdentifiers objects.
    */
  var ResourceIdentifiers: js.UndefOr[DiscoveredResourceIdentifierList] = js.native
}

object ListAggregateDiscoveredResourcesResponse {
  @scala.inline
  def apply(): ListAggregateDiscoveredResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAggregateDiscoveredResourcesResponse]
  }
  @scala.inline
  implicit class ListAggregateDiscoveredResourcesResponseOps[Self <: ListAggregateDiscoveredResourcesResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setResourceIdentifiersVarargs(value: AggregateResourceIdentifier*): Self = this.set("ResourceIdentifiers", js.Array(value :_*))
    @scala.inline
    def setResourceIdentifiers(value: DiscoveredResourceIdentifierList): Self = this.set("ResourceIdentifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceIdentifiers: Self = this.set("ResourceIdentifiers", js.undefined)
  }
  
}

