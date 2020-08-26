package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaleIpPermission extends js.Object {
  /**
    * The start of the port range for the TCP and UDP protocols, or an ICMP type number. A value of -1 indicates all ICMP types. 
    */
  var FromPort: js.UndefOr[Integer] = js.native
  /**
    * The IP protocol name (for tcp, udp, and icmp) or number (see Protocol Numbers).
    */
  var IpProtocol: js.UndefOr[String] = js.native
  /**
    * The IP ranges. Not applicable for stale security group rules.
    */
  var IpRanges: js.UndefOr[typings.awsSdk.ec2Mod.IpRanges] = js.native
  /**
    * The prefix list IDs. Not applicable for stale security group rules.
    */
  var PrefixListIds: js.UndefOr[PrefixListIdSet] = js.native
  /**
    * The end of the port range for the TCP and UDP protocols, or an ICMP type number. A value of -1 indicates all ICMP types. 
    */
  var ToPort: js.UndefOr[Integer] = js.native
  /**
    * The security group pairs. Returns the ID of the referenced security group and VPC, and the ID and status of the VPC peering connection.
    */
  var UserIdGroupPairs: js.UndefOr[UserIdGroupPairSet] = js.native
}

object StaleIpPermission {
  @scala.inline
  def apply(): StaleIpPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaleIpPermission]
  }
  @scala.inline
  implicit class StaleIpPermissionOps[Self <: StaleIpPermission] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFromPort(value: Integer): Self = this.set("FromPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromPort: Self = this.set("FromPort", js.undefined)
    @scala.inline
    def setIpProtocol(value: String): Self = this.set("IpProtocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpProtocol: Self = this.set("IpProtocol", js.undefined)
    @scala.inline
    def setIpRangesVarargs(value: String*): Self = this.set("IpRanges", js.Array(value :_*))
    @scala.inline
    def setIpRanges(value: IpRanges): Self = this.set("IpRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpRanges: Self = this.set("IpRanges", js.undefined)
    @scala.inline
    def setPrefixListIdsVarargs(value: String*): Self = this.set("PrefixListIds", js.Array(value :_*))
    @scala.inline
    def setPrefixListIds(value: PrefixListIdSet): Self = this.set("PrefixListIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixListIds: Self = this.set("PrefixListIds", js.undefined)
    @scala.inline
    def setToPort(value: Integer): Self = this.set("ToPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToPort: Self = this.set("ToPort", js.undefined)
    @scala.inline
    def setUserIdGroupPairsVarargs(value: UserIdGroupPair*): Self = this.set("UserIdGroupPairs", js.Array(value :_*))
    @scala.inline
    def setUserIdGroupPairs(value: UserIdGroupPairSet): Self = this.set("UserIdGroupPairs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserIdGroupPairs: Self = this.set("UserIdGroupPairs", js.undefined)
  }
  
}

