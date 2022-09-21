package typings.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutPermissionsBoundaryToPermissionSetRequest extends StObject {
  
  /**
    * The ARN of the IAM Identity Center instance under which the operation will be executed. 
    */
  var InstanceArn: typings.awsSdk.ssoadminMod.InstanceArn
  
  /**
    * The ARN of the PermissionSet.
    */
  var PermissionSetArn: typings.awsSdk.ssoadminMod.PermissionSetArn
  
  /**
    * The permissions boundary that you want to attach to a PermissionSet.
    */
  var PermissionsBoundary: typings.awsSdk.ssoadminMod.PermissionsBoundary
}
object PutPermissionsBoundaryToPermissionSetRequest {
  
  inline def apply(
    InstanceArn: InstanceArn,
    PermissionSetArn: PermissionSetArn,
    PermissionsBoundary: PermissionsBoundary
  ): PutPermissionsBoundaryToPermissionSetRequest = {
    val __obj = js.Dynamic.literal(InstanceArn = InstanceArn.asInstanceOf[js.Any], PermissionSetArn = PermissionSetArn.asInstanceOf[js.Any], PermissionsBoundary = PermissionsBoundary.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPermissionsBoundaryToPermissionSetRequest]
  }
  
  extension [Self <: PutPermissionsBoundaryToPermissionSetRequest](x: Self) {
    
    inline def setInstanceArn(value: InstanceArn): Self = StObject.set(x, "InstanceArn", value.asInstanceOf[js.Any])
    
    inline def setPermissionSetArn(value: PermissionSetArn): Self = StObject.set(x, "PermissionSetArn", value.asInstanceOf[js.Any])
    
    inline def setPermissionsBoundary(value: PermissionsBoundary): Self = StObject.set(x, "PermissionsBoundary", value.asInstanceOf[js.Any])
  }
}
