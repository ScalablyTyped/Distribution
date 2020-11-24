package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CapacityReservationGroup extends js.Object {
  
  /**
    * The ARN of the resource group.
    */
  var GroupArn: js.UndefOr[String] = js.native
  
  /**
    * The ID of the AWS account that owns the resource group.
    */
  var OwnerId: js.UndefOr[String] = js.native
}
object CapacityReservationGroup {
  
  @scala.inline
  def apply(): CapacityReservationGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapacityReservationGroup]
  }
  
  @scala.inline
  implicit class CapacityReservationGroupOps[Self <: CapacityReservationGroup] (val x: Self) extends AnyVal {
    
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
    def setGroupArn(value: String): Self = this.set("GroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupArn: Self = this.set("GroupArn", js.undefined)
    
    @scala.inline
    def setOwnerId(value: String): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerId: Self = this.set("OwnerId", js.undefined)
  }
}
