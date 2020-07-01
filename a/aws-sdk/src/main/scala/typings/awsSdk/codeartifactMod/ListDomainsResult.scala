package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDomainsResult extends js.Object {
  /**
    *  The returned list of  DomainSummary  objects. 
    */
  var domains: js.UndefOr[DomainSummaryList] = js.native
  /**
    *  The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListDomainsResult {
  @scala.inline
  def apply(domains: DomainSummaryList = null, nextToken: PaginationToken = null): ListDomainsResult = {
    val __obj = js.Dynamic.literal()
    if (domains != null) __obj.updateDynamic("domains")(domains.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDomainsResult]
  }
}

