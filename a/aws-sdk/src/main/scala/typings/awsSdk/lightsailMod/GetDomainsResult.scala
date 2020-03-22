package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDomainsResult extends js.Object {
  /**
    * An array of key-value pairs containing information about each of the domain entries in the user's account.
    */
  var domains: js.UndefOr[DomainList] = js.native
  /**
    * The token to advance to the next page of resutls from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetDomains request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object GetDomainsResult {
  @scala.inline
  def apply(domains: DomainList = null, nextPageToken: String = null): GetDomainsResult = {
    val __obj = js.Dynamic.literal()
    if (domains != null) __obj.updateDynamic("domains")(domains.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainsResult]
  }
}

