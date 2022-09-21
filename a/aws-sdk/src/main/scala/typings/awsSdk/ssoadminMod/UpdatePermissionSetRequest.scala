package typings.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePermissionSetRequest extends StObject {
  
  /**
    * The description of the PermissionSet.
    */
  var Description: js.UndefOr[PermissionSetDescription] = js.undefined
  
  /**
    * The ARN of the IAM Identity Center instance under which the operation will be executed. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var InstanceArn: typings.awsSdk.ssoadminMod.InstanceArn
  
  /**
    * The ARN of the permission set.
    */
  var PermissionSetArn: typings.awsSdk.ssoadminMod.PermissionSetArn
  
  /**
    * Used to redirect users within the application during the federation authentication process.
    */
  var RelayState: js.UndefOr[typings.awsSdk.ssoadminMod.RelayState] = js.undefined
  
  /**
    * The length of time that the application user sessions are valid for in the ISO-8601 standard.
    */
  var SessionDuration: js.UndefOr[Duration] = js.undefined
}
object UpdatePermissionSetRequest {
  
  inline def apply(InstanceArn: InstanceArn, PermissionSetArn: PermissionSetArn): UpdatePermissionSetRequest = {
    val __obj = js.Dynamic.literal(InstanceArn = InstanceArn.asInstanceOf[js.Any], PermissionSetArn = PermissionSetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePermissionSetRequest]
  }
  
  extension [Self <: UpdatePermissionSetRequest](x: Self) {
    
    inline def setDescription(value: PermissionSetDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setInstanceArn(value: InstanceArn): Self = StObject.set(x, "InstanceArn", value.asInstanceOf[js.Any])
    
    inline def setPermissionSetArn(value: PermissionSetArn): Self = StObject.set(x, "PermissionSetArn", value.asInstanceOf[js.Any])
    
    inline def setRelayState(value: RelayState): Self = StObject.set(x, "RelayState", value.asInstanceOf[js.Any])
    
    inline def setRelayStateUndefined: Self = StObject.set(x, "RelayState", js.undefined)
    
    inline def setSessionDuration(value: Duration): Self = StObject.set(x, "SessionDuration", value.asInstanceOf[js.Any])
    
    inline def setSessionDurationUndefined: Self = StObject.set(x, "SessionDuration", js.undefined)
  }
}
