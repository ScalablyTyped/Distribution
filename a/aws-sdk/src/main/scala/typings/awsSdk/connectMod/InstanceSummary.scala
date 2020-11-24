package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceSummary extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the instance.
    */
  var Arn: js.UndefOr[ARN] = js.native
  
  /**
    * When the instance was created.
    */
  var CreatedTime: js.UndefOr[Timestamp_] = js.native
  
  /**
    * The identifier of the instance.
    */
  var Id: js.UndefOr[InstanceId] = js.native
  
  /**
    * The identity management type of the instance.
    */
  var IdentityManagementType: js.UndefOr[DirectoryType] = js.native
  
  /**
    * Whether inbound calls are enabled.
    */
  var InboundCallsEnabled: js.UndefOr[typings.awsSdk.connectMod.InboundCallsEnabled] = js.native
  
  /**
    * The alias of the instance.
    */
  var InstanceAlias: js.UndefOr[DirectoryAlias] = js.native
  
  /**
    * The state of the instance.
    */
  var InstanceStatus: js.UndefOr[typings.awsSdk.connectMod.InstanceStatus] = js.native
  
  /**
    * Whether outbound calls are enabled.
    */
  var OutboundCallsEnabled: js.UndefOr[typings.awsSdk.connectMod.OutboundCallsEnabled] = js.native
  
  /**
    * The service role of the instance.
    */
  var ServiceRole: js.UndefOr[ARN] = js.native
}
object InstanceSummary {
  
  @scala.inline
  def apply(): InstanceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceSummary]
  }
  
  @scala.inline
  implicit class InstanceSummaryOps[Self <: InstanceSummary] (val x: Self) extends AnyVal {
    
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
    def setArn(value: ARN): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: Timestamp_): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
    
    @scala.inline
    def setId(value: InstanceId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setIdentityManagementType(value: DirectoryType): Self = this.set("IdentityManagementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentityManagementType: Self = this.set("IdentityManagementType", js.undefined)
    
    @scala.inline
    def setInboundCallsEnabled(value: InboundCallsEnabled): Self = this.set("InboundCallsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInboundCallsEnabled: Self = this.set("InboundCallsEnabled", js.undefined)
    
    @scala.inline
    def setInstanceAlias(value: DirectoryAlias): Self = this.set("InstanceAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceAlias: Self = this.set("InstanceAlias", js.undefined)
    
    @scala.inline
    def setInstanceStatus(value: InstanceStatus): Self = this.set("InstanceStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceStatus: Self = this.set("InstanceStatus", js.undefined)
    
    @scala.inline
    def setOutboundCallsEnabled(value: OutboundCallsEnabled): Self = this.set("OutboundCallsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutboundCallsEnabled: Self = this.set("OutboundCallsEnabled", js.undefined)
    
    @scala.inline
    def setServiceRole(value: ARN): Self = this.set("ServiceRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceRole: Self = this.set("ServiceRole", js.undefined)
  }
}
