package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateInstanceRequest extends StObject {
  
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
  implicit class CreateInstanceRequestMutableBuilder[Self <: CreateInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
    
    @scala.inline
    def setIdentityManagementType(value: DirectoryType): Self = StObject.set(x, "IdentityManagementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInboundCallsEnabled(value: InboundCallsEnabled): Self = StObject.set(x, "InboundCallsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceAlias(value: DirectoryAlias): Self = StObject.set(x, "InstanceAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceAliasUndefined: Self = StObject.set(x, "InstanceAlias", js.undefined)
    
    @scala.inline
    def setOutboundCallsEnabled(value: OutboundCallsEnabled): Self = StObject.set(x, "OutboundCallsEnabled", value.asInstanceOf[js.Any])
  }
}
