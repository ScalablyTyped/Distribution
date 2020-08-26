package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTransitGatewayResult extends js.Object {
  /**
    * Information about the transit gateway.
    */
  var TransitGateway: js.UndefOr[typings.awsSdk.ec2Mod.TransitGateway] = js.native
}

object CreateTransitGatewayResult {
  @scala.inline
  def apply(): CreateTransitGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTransitGatewayResult]
  }
  @scala.inline
  implicit class CreateTransitGatewayResultOps[Self <: CreateTransitGatewayResult] (val x: Self) extends AnyVal {
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
    def setTransitGateway(value: TransitGateway): Self = this.set("TransitGateway", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitGateway: Self = this.set("TransitGateway", js.undefined)
  }
  
}

