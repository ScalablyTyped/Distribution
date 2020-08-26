package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceUtilization extends js.Object {
  /**
    * Utilization of current Amazon EC2 Instance 
    */
  var EC2ResourceUtilization: js.UndefOr[typings.awsSdk.costexplorerMod.EC2ResourceUtilization] = js.native
}

object ResourceUtilization {
  @scala.inline
  def apply(): ResourceUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceUtilization]
  }
  @scala.inline
  implicit class ResourceUtilizationOps[Self <: ResourceUtilization] (val x: Self) extends AnyVal {
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
    def setEC2ResourceUtilization(value: EC2ResourceUtilization): Self = this.set("EC2ResourceUtilization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEC2ResourceUtilization: Self = this.set("EC2ResourceUtilization", js.undefined)
  }
  
}

