package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEgressOnlyInternetGatewayResult extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * Information about the egress-only internet gateway.
    */
  var EgressOnlyInternetGateway: js.UndefOr[typings.awsSdk.ec2Mod.EgressOnlyInternetGateway] = js.native
}

object CreateEgressOnlyInternetGatewayResult {
  @scala.inline
  def apply(): CreateEgressOnlyInternetGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEgressOnlyInternetGatewayResult]
  }
  @scala.inline
  implicit class CreateEgressOnlyInternetGatewayResultOps[Self <: CreateEgressOnlyInternetGatewayResult] (val x: Self) extends AnyVal {
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
    def setClientToken(value: String): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    @scala.inline
    def setEgressOnlyInternetGateway(value: EgressOnlyInternetGateway): Self = this.set("EgressOnlyInternetGateway", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEgressOnlyInternetGateway: Self = this.set("EgressOnlyInternetGateway", js.undefined)
  }
  
}

