package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsIamAccessKeySessionContextSessionIssuer extends StObject {
  
  /**
    * The identifier of the AWS account that created the session.
    */
  var AccountId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The ARN of the session.
    */
  var Arn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The principal ID of the principal (user, role, or group) that created the session.
    */
  var PrincipalId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The type of principal (user, role, or group) that created the session.
    */
  var Type: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the principal that created the session.
    */
  var UserName: js.UndefOr[NonEmptyString] = js.native
}
object AwsIamAccessKeySessionContextSessionIssuer {
  
  @scala.inline
  def apply(): AwsIamAccessKeySessionContextSessionIssuer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamAccessKeySessionContextSessionIssuer]
  }
  
  @scala.inline
  implicit class AwsIamAccessKeySessionContextSessionIssuerMutableBuilder[Self <: AwsIamAccessKeySessionContextSessionIssuer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    @scala.inline
    def setArn(value: NonEmptyString): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setPrincipalId(value: NonEmptyString): Self = StObject.set(x, "PrincipalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalIdUndefined: Self = StObject.set(x, "PrincipalId", js.undefined)
    
    @scala.inline
    def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setUserName(value: NonEmptyString): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}
