package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTransitGatewayMulticastDomainAssociationsResult extends js.Object {
  /**
    * Information about the multicast domain associations.
    */
  var MulticastDomainAssociations: js.UndefOr[TransitGatewayMulticastDomainAssociationList] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object GetTransitGatewayMulticastDomainAssociationsResult {
  @scala.inline
  def apply(): GetTransitGatewayMulticastDomainAssociationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTransitGatewayMulticastDomainAssociationsResult]
  }
  @scala.inline
  implicit class GetTransitGatewayMulticastDomainAssociationsResultOps[Self <: GetTransitGatewayMulticastDomainAssociationsResult] (val x: Self) extends AnyVal {
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
    def setMulticastDomainAssociationsVarargs(value: TransitGatewayMulticastDomainAssociation*): Self = this.set("MulticastDomainAssociations", js.Array(value :_*))
    @scala.inline
    def setMulticastDomainAssociations(value: TransitGatewayMulticastDomainAssociationList): Self = this.set("MulticastDomainAssociations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMulticastDomainAssociations: Self = this.set("MulticastDomainAssociations", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

