package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CognitoOptions extends js.Object {
  
  /**
    * Specifies the option to enable Cognito for Kibana authentication.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies the Cognito identity pool ID for Kibana authentication.
    */
  var IdentityPoolId: js.UndefOr[typings.awsSdk.esMod.IdentityPoolId] = js.native
  
  /**
    * Specifies the role ARN that provides Elasticsearch permissions for accessing Cognito resources.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.esMod.RoleArn] = js.native
  
  /**
    * Specifies the Cognito user pool ID for Kibana authentication.
    */
  var UserPoolId: js.UndefOr[typings.awsSdk.esMod.UserPoolId] = js.native
}
object CognitoOptions {
  
  @scala.inline
  def apply(): CognitoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CognitoOptions]
  }
  
  @scala.inline
  implicit class CognitoOptionsOps[Self <: CognitoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    
    @scala.inline
    def setIdentityPoolId(value: IdentityPoolId): Self = this.set("IdentityPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentityPoolId: Self = this.set("IdentityPoolId", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
    
    @scala.inline
    def setUserPoolId(value: UserPoolId): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserPoolId: Self = this.set("UserPoolId", js.undefined)
  }
}
