package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDefaultVpcResult extends js.Object {
  /**
    * Information about the VPC.
    */
  var Vpc: js.UndefOr[typings.awsSdk.ec2Mod.Vpc] = js.native
}

object CreateDefaultVpcResult {
  @scala.inline
  def apply(): CreateDefaultVpcResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDefaultVpcResult]
  }
  @scala.inline
  implicit class CreateDefaultVpcResultOps[Self <: CreateDefaultVpcResult] (val x: Self) extends AnyVal {
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
    def setVpc(value: Vpc): Self = this.set("Vpc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpc: Self = this.set("Vpc", js.undefined)
  }
  
}

