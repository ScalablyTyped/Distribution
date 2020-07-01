package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHostedZonesByVPCResponse extends js.Object {
  /**
    * A list that contains one HostedZoneSummary element for each hosted zone that the specified Amazon VPC is associated with. Each HostedZoneSummary element contains the hosted zone name and ID, and information about who owns the hosted zone.
    */
  var HostedZoneSummaries: typings.awsSdk.route53Mod.HostedZoneSummaries = js.native
  /**
    * The value that you specified for MaxItems in the most recent ListHostedZonesByVPC request.
    */
  var MaxItems: PageMaxItems = js.native
  /**
    * The value that you specified for NextToken in the most recent ListHostedZonesByVPC request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListHostedZonesByVPCResponse {
  @scala.inline
  def apply(
    HostedZoneSummaries: HostedZoneSummaries,
    MaxItems: PageMaxItems,
    NextToken: PaginationToken = null
  ): ListHostedZonesByVPCResponse = {
    val __obj = js.Dynamic.literal(HostedZoneSummaries = HostedZoneSummaries.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHostedZonesByVPCResponse]
  }
}

