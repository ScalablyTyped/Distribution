package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssumedRole extends js.Object {
  
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
object AssumedRole {
  
  @scala.inline
  def apply(): AssumedRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssumedRole]
  }
  
  @scala.inline
  implicit class AssumedRoleOps[Self <: AssumedRole] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessKeyId(value: string): Self = this.set("accessKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessKeyId: Self = this.set("accessKeyId", js.undefined)
    
    @scala.inline
    def setAccountId(value: string): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setArn(value: string): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setPrincipalId(value: string): Self = this.set("principalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipalId: Self = this.set("principalId", js.undefined)
    
    @scala.inline
    def setSessionContext(value: SessionContext): Self = this.set("sessionContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionContext: Self = this.set("sessionContext", js.undefined)
  }
}
