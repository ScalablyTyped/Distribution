package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsIamAccessKeyDetails extends StObject {
  
  /**
    * The identifier of the access key.
    */
  var AccessKeyId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The Amazon Web Services account ID of the account for the key.
    */
  var AccountId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates when the IAM access key was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreatedAt: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ID of the principal associated with an access key.
    */
  var PrincipalId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the principal.
    */
  var PrincipalName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The type of principal associated with an access key.
    */
  var PrincipalType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Information about the session that the key was used for.
    */
  var SessionContext: js.UndefOr[AwsIamAccessKeySessionContext] = js.undefined
  
  /**
    * The status of the IAM access key related to a finding.
    */
  var Status: js.UndefOr[AwsIamAccessKeyStatus] = js.undefined
  
  /**
    * The user associated with the IAM access key related to a finding. The UserName parameter has been replaced with the PrincipalName parameter because access keys can also be assigned to principals that are not IAM users.
    */
  var UserName: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsIamAccessKeyDetails {
  
  inline def apply(): AwsIamAccessKeyDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamAccessKeyDetails]
  }
  
  extension [Self <: AwsIamAccessKeyDetails](x: Self) {
    
    inline def setAccessKeyId(value: NonEmptyString): Self = StObject.set(x, "AccessKeyId", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyIdUndefined: Self = StObject.set(x, "AccessKeyId", js.undefined)
    
    inline def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setCreatedAt(value: NonEmptyString): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setPrincipalId(value: NonEmptyString): Self = StObject.set(x, "PrincipalId", value.asInstanceOf[js.Any])
    
    inline def setPrincipalIdUndefined: Self = StObject.set(x, "PrincipalId", js.undefined)
    
    inline def setPrincipalName(value: NonEmptyString): Self = StObject.set(x, "PrincipalName", value.asInstanceOf[js.Any])
    
    inline def setPrincipalNameUndefined: Self = StObject.set(x, "PrincipalName", js.undefined)
    
    inline def setPrincipalType(value: NonEmptyString): Self = StObject.set(x, "PrincipalType", value.asInstanceOf[js.Any])
    
    inline def setPrincipalTypeUndefined: Self = StObject.set(x, "PrincipalType", js.undefined)
    
    inline def setSessionContext(value: AwsIamAccessKeySessionContext): Self = StObject.set(x, "SessionContext", value.asInstanceOf[js.Any])
    
    inline def setSessionContextUndefined: Self = StObject.set(x, "SessionContext", js.undefined)
    
    inline def setStatus(value: AwsIamAccessKeyStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUserName(value: NonEmptyString): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}
