package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CognitoOptions extends StObject {
  
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
  implicit class CognitoOptionsMutableBuilder[Self <: CognitoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    @scala.inline
    def setIdentityPoolId(value: IdentityPoolId): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    @scala.inline
    def setUserPoolId(value: UserPoolId): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolIdUndefined: Self = StObject.set(x, "UserPoolId", js.undefined)
  }
}
