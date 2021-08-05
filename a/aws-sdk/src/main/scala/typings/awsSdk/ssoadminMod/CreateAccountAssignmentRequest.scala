package typings.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAccountAssignmentRequest extends StObject {
  
  /**
    * The ARN of the SSO instance under which the operation will be executed. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var InstanceArn: typings.awsSdk.ssoadminMod.InstanceArn
  
  /**
    * The ARN of the permission set that the admin wants to grant the principal access to.
    */
  var PermissionSetArn: typings.awsSdk.ssoadminMod.PermissionSetArn
  
  /**
    * An identifier for an object in AWS SSO, such as a user or group. PrincipalIds are GUIDs (For example, f81d4fae-7dec-11d0-a765-00a0c91e6bf6). For more information about PrincipalIds in AWS SSO, see the AWS SSO Identity Store API Reference.
    */
  var PrincipalId: typings.awsSdk.ssoadminMod.PrincipalId
  
  /**
    * The entity type for which the assignment will be created.
    */
  var PrincipalType: typings.awsSdk.ssoadminMod.PrincipalType
  
  /**
    * TargetID is an AWS account identifier, typically a 10-12 digit string (For example, 123456789012).
    */
  var TargetId: typings.awsSdk.ssoadminMod.TargetId
  
  /**
    * The entity type for which the assignment will be created.
    */
  var TargetType: typings.awsSdk.ssoadminMod.TargetType
}
object CreateAccountAssignmentRequest {
  
  inline def apply(
    InstanceArn: InstanceArn,
    PermissionSetArn: PermissionSetArn,
    PrincipalId: PrincipalId,
    PrincipalType: PrincipalType,
    TargetId: TargetId,
    TargetType: TargetType
  ): CreateAccountAssignmentRequest = {
    val __obj = js.Dynamic.literal(InstanceArn = InstanceArn.asInstanceOf[js.Any], PermissionSetArn = PermissionSetArn.asInstanceOf[js.Any], PrincipalId = PrincipalId.asInstanceOf[js.Any], PrincipalType = PrincipalType.asInstanceOf[js.Any], TargetId = TargetId.asInstanceOf[js.Any], TargetType = TargetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccountAssignmentRequest]
  }
  
  extension [Self <: CreateAccountAssignmentRequest](x: Self) {
    
    inline def setInstanceArn(value: InstanceArn): Self = StObject.set(x, "InstanceArn", value.asInstanceOf[js.Any])
    
    inline def setPermissionSetArn(value: PermissionSetArn): Self = StObject.set(x, "PermissionSetArn", value.asInstanceOf[js.Any])
    
    inline def setPrincipalId(value: PrincipalId): Self = StObject.set(x, "PrincipalId", value.asInstanceOf[js.Any])
    
    inline def setPrincipalType(value: PrincipalType): Self = StObject.set(x, "PrincipalType", value.asInstanceOf[js.Any])
    
    inline def setTargetId(value: TargetId): Self = StObject.set(x, "TargetId", value.asInstanceOf[js.Any])
    
    inline def setTargetType(value: TargetType): Self = StObject.set(x, "TargetType", value.asInstanceOf[js.Any])
  }
}
