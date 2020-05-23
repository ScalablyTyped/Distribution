package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListThreatIntelSetsResponse extends js.Object {
  /**
    * The pagination parameter to be used on the next list operation to retrieve more items.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The IDs of the ThreatIntelSet resources.
    */
  var ThreatIntelSetIds: typings.awsSdk.guarddutyMod.ThreatIntelSetIds = js.native
}

object ListThreatIntelSetsResponse {
  @scala.inline
  def apply(ThreatIntelSetIds: ThreatIntelSetIds, NextToken: String = null): ListThreatIntelSetsResponse = {
    val __obj = js.Dynamic.literal(ThreatIntelSetIds = ThreatIntelSetIds.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListThreatIntelSetsResponse]
  }
}

