package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIPSetsResponse extends js.Object {
  /**
    * The IDs of the IPSet resources.
    */
  var IpSetIds: typings.awsSdk.guarddutyMod.IpSetIds = js.native
  /**
    * The pagination parameter to be used on the next list operation to retrieve more items.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListIPSetsResponse {
  @scala.inline
  def apply(IpSetIds: IpSetIds, NextToken: String = null): ListIPSetsResponse = {
    val __obj = js.Dynamic.literal(IpSetIds = IpSetIds.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIPSetsResponse]
  }
}

