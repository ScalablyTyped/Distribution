package typings.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPublicKeysRequest extends js.Object {
  /**
    * Optionally specifies, in UTC, the end of the time range to look up public keys for CloudTrail digest files. If not specified, the current time is used.
    */
  var EndTime: js.UndefOr[Date] = js.native
  /**
    * Reserved for future use.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Optionally specifies, in UTC, the start of the time range to look up public keys for CloudTrail digest files. If not specified, the current time is used, and the current public key is returned.
    */
  var StartTime: js.UndefOr[Date] = js.native
}

object ListPublicKeysRequest {
  @scala.inline
  def apply(EndTime: Date = null, NextToken: String = null, StartTime: Date = null): ListPublicKeysRequest = {
    val __obj = js.Dynamic.literal()
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPublicKeysRequest]
  }
}

