package typings.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountAssignment extends StObject {
  
  /**
    * The identifier of the AWS account.
    */
  var AccountId: js.UndefOr[typings.awsSdk.ssoadminMod.AccountId] = js.undefined
  
  /**
    * The ARN of the permission set. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var PermissionSetArn: js.UndefOr[typings.awsSdk.ssoadminMod.PermissionSetArn] = js.undefined
  
  /**
    * An identifier for an object in AWS SSO, such as a user or group. PrincipalIds are GUIDs (For example, f81d4fae-7dec-11d0-a765-00a0c91e6bf6). For more information about PrincipalIds in AWS SSO, see the AWS SSO Identity Store API Reference.
    */
  var PrincipalId: js.UndefOr[typings.awsSdk.ssoadminMod.PrincipalId] = js.undefined
  
  /**
    * The entity type for which the assignment will be created.
    */
  var PrincipalType: js.UndefOr[typings.awsSdk.ssoadminMod.PrincipalType] = js.undefined
}
object AccountAssignment {
  
  inline def apply(): AccountAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountAssignment]
  }
  
  extension [Self <: AccountAssignment](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setPermissionSetArn(value: PermissionSetArn): Self = StObject.set(x, "PermissionSetArn", value.asInstanceOf[js.Any])
    
    inline def setPermissionSetArnUndefined: Self = StObject.set(x, "PermissionSetArn", js.undefined)
    
    inline def setPrincipalId(value: PrincipalId): Self = StObject.set(x, "PrincipalId", value.asInstanceOf[js.Any])
    
    inline def setPrincipalIdUndefined: Self = StObject.set(x, "PrincipalId", js.undefined)
    
    inline def setPrincipalType(value: PrincipalType): Self = StObject.set(x, "PrincipalType", value.asInstanceOf[js.Any])
    
    inline def setPrincipalTypeUndefined: Self = StObject.set(x, "PrincipalType", js.undefined)
  }
}
