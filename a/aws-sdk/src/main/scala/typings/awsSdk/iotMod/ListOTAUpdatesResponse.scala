package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOTAUpdatesResponse extends js.Object {
  /**
    * A token to use to get the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A list of OTA update jobs.
    */
  var otaUpdates: js.UndefOr[OTAUpdatesSummary] = js.native
}

object ListOTAUpdatesResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, otaUpdates: OTAUpdatesSummary = null): ListOTAUpdatesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (otaUpdates != null) __obj.updateDynamic("otaUpdates")(otaUpdates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOTAUpdatesResponse]
  }
}

