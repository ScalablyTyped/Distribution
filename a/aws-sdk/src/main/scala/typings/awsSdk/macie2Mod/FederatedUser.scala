package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FederatedUser extends StObject {
  
  /**
    * The AWS access key ID that identifies the credentials.
    */
  var accessKeyId: js.UndefOr[string] = js.native
  
  /**
    * The unique identifier for the AWS account that owns the entity that was used to get the credentials.
    */
  var accountId: js.UndefOr[string] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the entity that was used to get the credentials.
    */
  var arn: js.UndefOr[string] = js.native
  
  /**
    * The unique identifier for the entity that was used to get the credentials.
    */
  var principalId: js.UndefOr[string] = js.native
  
  /**
    * The details of the session that was created for the credentials, including the entity that issued the session.
    */
  var sessionContext: js.UndefOr[SessionContext] = js.native
}
object FederatedUser {
  
  @scala.inline
  def apply(): FederatedUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FederatedUser]
  }
  
  @scala.inline
  implicit class FederatedUserMutableBuilder[Self <: FederatedUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessKeyId(value: string): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessKeyIdUndefined: Self = StObject.set(x, "accessKeyId", js.undefined)
    
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
    def setSessionContext(value: SessionContext): Self = StObject.set(x, "sessionContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionContextUndefined: Self = StObject.set(x, "sessionContext", js.undefined)
  }
}
