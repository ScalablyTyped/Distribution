package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTransitGatewayRegistrationsResponse extends js.Object {
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The transit gateway registrations.
    */
  var TransitGatewayRegistrations: js.UndefOr[TransitGatewayRegistrationList] = js.native
}

object GetTransitGatewayRegistrationsResponse {
  @scala.inline
  def apply(): GetTransitGatewayRegistrationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTransitGatewayRegistrationsResponse]
  }
  @scala.inline
  implicit class GetTransitGatewayRegistrationsResponseOps[Self <: GetTransitGatewayRegistrationsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setTransitGatewayRegistrationsVarargs(value: TransitGatewayRegistration*): Self = this.set("TransitGatewayRegistrations", js.Array(value :_*))
    @scala.inline
    def setTransitGatewayRegistrations(value: TransitGatewayRegistrationList): Self = this.set("TransitGatewayRegistrations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitGatewayRegistrations: Self = this.set("TransitGatewayRegistrations", js.undefined)
  }
  
}

