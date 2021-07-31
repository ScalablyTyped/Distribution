package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemovePermissionRequest extends StObject {
  
  /**
    * The name of the event bus to revoke permissions for. If you omit this, the default event bus is used.
    */
  var EventBusName: js.UndefOr[NonPartnerEventBusName] = js.undefined
  
  /**
    * Specifies whether to remove all permissions.
    */
  var RemoveAllPermissions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The statement ID corresponding to the account that is no longer allowed to put events to the default event bus.
    */
  var StatementId: js.UndefOr[typings.awsSdk.eventbridgeMod.StatementId] = js.undefined
}
object RemovePermissionRequest {
  
  @scala.inline
  def apply(): RemovePermissionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemovePermissionRequest]
  }
  
  @scala.inline
  implicit class RemovePermissionRequestMutableBuilder[Self <: RemovePermissionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventBusName(value: NonPartnerEventBusName): Self = StObject.set(x, "EventBusName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventBusNameUndefined: Self = StObject.set(x, "EventBusName", js.undefined)
    
    @scala.inline
    def setRemoveAllPermissions(value: Boolean): Self = StObject.set(x, "RemoveAllPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveAllPermissionsUndefined: Self = StObject.set(x, "RemoveAllPermissions", js.undefined)
    
    @scala.inline
    def setStatementId(value: StatementId): Self = StObject.set(x, "StatementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementIdUndefined: Self = StObject.set(x, "StatementId", js.undefined)
  }
}
