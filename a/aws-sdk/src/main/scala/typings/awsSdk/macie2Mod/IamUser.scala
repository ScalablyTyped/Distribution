package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IamUser extends StObject {
  
  /**
    * The unique identifier for the AWS account that's associated with the IAM user who performed the action.
    */
  var accountId: js.UndefOr[string] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the principal that performed the action. The last section of the ARN contains the name of the user who performed the action.
    */
  var arn: js.UndefOr[string] = js.undefined
  
  /**
    * The unique identifier for the IAM user who performed the action.
    */
  var principalId: js.UndefOr[string] = js.undefined
  
  /**
    * The user name of the IAM user who performed the action.
    */
  var userName: js.UndefOr[string] = js.undefined
}
object IamUser {
  
  @scala.inline
  def apply(): IamUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IamUser]
  }
  
  @scala.inline
  implicit class IamUserMutableBuilder[Self <: IamUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: string): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setPrincipalId(value: string): Self = StObject.set(x, "principalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalIdUndefined: Self = StObject.set(x, "principalId", js.undefined)
    
    @scala.inline
    def setUserName(value: string): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
  }
}
