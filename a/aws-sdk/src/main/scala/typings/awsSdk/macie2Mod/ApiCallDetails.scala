package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiCallDetails extends js.Object {
  /**
    * Reserved for future use.
    */
  var api: js.UndefOr[string] = js.native
  /**
    * Reserved for future use.
    */
  var apiServiceName: js.UndefOr[string] = js.native
  /**
    * Reserved for future use.
    */
  var firstSeen: js.UndefOr[timestampIso8601] = js.native
  /**
    * Reserved for future use.
    */
  var lastSeen: js.UndefOr[timestampIso8601] = js.native
}

object ApiCallDetails {
  @scala.inline
  def apply(
    api: string = null,
    apiServiceName: string = null,
    firstSeen: timestampIso8601 = null,
    lastSeen: timestampIso8601 = null
  ): ApiCallDetails = {
    val __obj = js.Dynamic.literal()
    if (api != null) __obj.updateDynamic("api")(api.asInstanceOf[js.Any])
    if (apiServiceName != null) __obj.updateDynamic("apiServiceName")(apiServiceName.asInstanceOf[js.Any])
    if (firstSeen != null) __obj.updateDynamic("firstSeen")(firstSeen.asInstanceOf[js.Any])
    if (lastSeen != null) __obj.updateDynamic("lastSeen")(lastSeen.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiCallDetails]
  }
}

