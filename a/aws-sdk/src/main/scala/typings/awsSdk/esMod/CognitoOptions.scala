package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CognitoOptions extends StObject {
  
  /**
    * Specifies the option to enable Cognito for Kibana authentication.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the Cognito identity pool ID for Kibana authentication.
    */
  var IdentityPoolId: js.UndefOr[typings.awsSdk.esMod.IdentityPoolId] = js.undefined
  
  /**
    * Specifies the role ARN that provides Elasticsearch permissions for accessing Cognito resources.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.esMod.RoleArn] = js.undefined
  
  /**
    * Specifies the Cognito user pool ID for Kibana authentication.
    */
  var UserPoolId: js.UndefOr[typings.awsSdk.esMod.UserPoolId] = js.undefined
}
object CognitoOptions {
  
  inline def apply(): CognitoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CognitoOptions]
  }
  
  extension [Self <: CognitoOptions](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setIdentityPoolId(value: IdentityPoolId): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    inline def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setUserPoolId(value: UserPoolId): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    inline def setUserPoolIdUndefined: Self = StObject.set(x, "UserPoolId", js.undefined)
  }
}
