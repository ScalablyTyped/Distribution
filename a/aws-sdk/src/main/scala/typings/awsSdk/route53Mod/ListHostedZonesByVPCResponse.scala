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
  def apply(HostedZoneSummaries: HostedZoneSummaries, MaxItems: PageMaxItems): ListHostedZonesByVPCResponse = {
    val __obj = js.Dynamic.literal(HostedZoneSummaries = HostedZoneSummaries.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHostedZonesByVPCResponse]
  }
  @scala.inline
  implicit class ListHostedZonesByVPCResponseOps[Self <: ListHostedZonesByVPCResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHostedZoneSummariesVarargs(value: HostedZoneSummary*): Self = this.set("HostedZoneSummaries", js.Array(value :_*))
    @scala.inline
    def setHostedZoneSummaries(value: HostedZoneSummaries): Self = this.set("HostedZoneSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxItems(value: PageMaxItems): Self = this.set("MaxItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

