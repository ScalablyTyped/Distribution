package typings.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDomainsResponse extends js.Object {
  /**
    * Information about the domains.
    */
  var Domains: js.UndefOr[DomainSummaryList] = js.native
  /**
    * The pagination token used to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.worklinkMod.NextToken] = js.native
}

object ListDomainsResponse {
  @scala.inline
  def apply(Domains: DomainSummaryList = null, NextToken: NextToken = null): ListDomainsResponse = {
    val __obj = js.Dynamic.literal()
    if (Domains != null) __obj.updateDynamic("Domains")(Domains.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDomainsResponse]
  }
}

