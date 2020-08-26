package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAssociatedIpv6PoolCidrsResult extends js.Object {
  /**
    * Information about the IPv6 CIDR block associations.
    */
  var Ipv6CidrAssociations: js.UndefOr[Ipv6CidrAssociationSet] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object GetAssociatedIpv6PoolCidrsResult {
  @scala.inline
  def apply(): GetAssociatedIpv6PoolCidrsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAssociatedIpv6PoolCidrsResult]
  }
  @scala.inline
  implicit class GetAssociatedIpv6PoolCidrsResultOps[Self <: GetAssociatedIpv6PoolCidrsResult] (val x: Self) extends AnyVal {
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
    def setIpv6CidrAssociationsVarargs(value: Ipv6CidrAssociation*): Self = this.set("Ipv6CidrAssociations", js.Array(value :_*))
    @scala.inline
    def setIpv6CidrAssociations(value: Ipv6CidrAssociationSet): Self = this.set("Ipv6CidrAssociations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpv6CidrAssociations: Self = this.set("Ipv6CidrAssociations", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

