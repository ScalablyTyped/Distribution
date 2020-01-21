package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainInfos extends js.Object {
  /**
    * A list of DomainInfo structures.
    */
  var domainInfos: DomainInfoList = js.native
  /**
    * If a NextPageToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextPageToken. Keep all other arguments unchanged. The configured maximumPageSize determines how many results can be returned in a single call.
    */
  var nextPageToken: js.UndefOr[PageToken] = js.native
}

object DomainInfos {
  @scala.inline
  def apply(domainInfos: DomainInfoList, nextPageToken: PageToken = null): DomainInfos = {
    val __obj = js.Dynamic.literal(domainInfos = domainInfos.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainInfos]
  }
}

