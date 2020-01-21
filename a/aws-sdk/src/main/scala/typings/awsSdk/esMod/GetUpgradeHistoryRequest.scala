package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUpgradeHistoryRequest extends js.Object {
  var DomainName: typings.awsSdk.esMod.DomainName = js.native
  var MaxResults: js.UndefOr[typings.awsSdk.esMod.MaxResults] = js.native
  var NextToken: js.UndefOr[typings.awsSdk.esMod.NextToken] = js.native
}

object GetUpgradeHistoryRequest {
  @scala.inline
  def apply(DomainName: DomainName, MaxResults: Int | scala.Double = null, NextToken: NextToken = null): GetUpgradeHistoryRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUpgradeHistoryRequest]
  }
}

