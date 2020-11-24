package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateInstanceRequest extends js.Object {
  
  /**
    * The idempotency token.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.connectMod.ClientToken] = js.native
  
  /**
    * The identifier for the directory.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.connectMod.DirectoryId] = js.native
  
  /**
    * The type of identity management for your Amazon Connect users.
    */
  var IdentityManagementType: DirectoryType = js.native
  
  /**
    * Whether your contact center handles incoming contacts.
    */
  var InboundCallsEnabled: typings.awsSdk.connectMod.InboundCallsEnabled = js.native
  
  /**
    * The name for your instance.
    */
  var InstanceAlias: js.UndefOr[DirectoryAlias] = js.native
  
  /**
    * Whether your contact center allows outbound calls.
    */
  var OutboundCallsEnabled: typings.awsSdk.connectMod.OutboundCallsEnabled = js.native
}
object CreateInstanceRequest {
  
  @scala.inline
  def apply(
    IdentityManagementType: DirectoryType,
    InboundCallsEnabled: InboundCallsEnabled,
    OutboundCallsEnabled: OutboundCallsEnabled
  ): CreateInstanceRequest = {
    val __obj = js.Dynamic.literal(IdentityManagementType = IdentityManagementType.asInstanceOf[js.Any], InboundCallsEnabled = InboundCallsEnabled.asInstanceOf[js.Any], OutboundCallsEnabled = OutboundCallsEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInstanceRequest]
  }
  
  @scala.inline
  implicit class CreateInstanceRequestOps[Self <: CreateInstanceRequest] (val x: Self) extends AnyVal {
    
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
    def setIdentityManagementType(value: DirectoryType): Self = this.set("IdentityManagementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInboundCallsEnabled(value: InboundCallsEnabled): Self = this.set("InboundCallsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutboundCallsEnabled(value: OutboundCallsEnabled): Self = this.set("OutboundCallsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = this.set("DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectoryId: Self = this.set("DirectoryId", js.undefined)
    
    @scala.inline
    def setInstanceAlias(value: DirectoryAlias): Self = this.set("InstanceAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceAlias: Self = this.set("InstanceAlias", js.undefined)
  }
}
