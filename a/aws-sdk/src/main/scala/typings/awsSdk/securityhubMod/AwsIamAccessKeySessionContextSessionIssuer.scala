package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsIamAccessKeySessionContextSessionIssuer extends StObject {
  
  /**
    * The identifier of the Amazon Web Services account that created the session.
    */
  var AccountId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ARN of the session.
    */
  var Arn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The principal ID of the principal (user, role, or group) that created the session.
    */
  var PrincipalId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The type of principal (user, role, or group) that created the session.
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the principal that created the session.
    */
  var UserName: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsIamAccessKeySessionContextSessionIssuer {
  
  inline def apply(): AwsIamAccessKeySessionContextSessionIssuer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamAccessKeySessionContextSessionIssuer]
  }
  
  extension [Self <: AwsIamAccessKeySessionContextSessionIssuer](x: Self) {
    
    inline def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setArn(value: NonEmptyString): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setPrincipalId(value: NonEmptyString): Self = StObject.set(x, "PrincipalId", value.asInstanceOf[js.Any])
    
    inline def setPrincipalIdUndefined: Self = StObject.set(x, "PrincipalId", js.undefined)
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setUserName(value: NonEmptyString): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}
