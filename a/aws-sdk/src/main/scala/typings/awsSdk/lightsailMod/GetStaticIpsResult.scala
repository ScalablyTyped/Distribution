package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStaticIpsResult extends js.Object {
  /**
    * A token used for advancing to the next page of results from your get static IPs request.
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

