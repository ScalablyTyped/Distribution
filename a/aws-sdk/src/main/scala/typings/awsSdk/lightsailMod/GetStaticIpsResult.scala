package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStaticIpsResult extends js.Object {
  /**
    * The token to advance to the next page of resutls from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetStaticIps request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * An array of key-value pairs containing information about your get static IPs request.
    */
  var staticIps: js.UndefOr[StaticIpList] = js.native
}

object GetStaticIpsResult {
  @scala.inline
  def apply(nextPageToken: String = null, staticIps: StaticIpList = null): GetStaticIpsResult = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (staticIps != null) __obj.updateDynamic("staticIps")(staticIps.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStaticIpsResult]
  }
}

