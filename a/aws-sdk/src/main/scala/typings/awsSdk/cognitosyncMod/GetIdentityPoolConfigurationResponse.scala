package typings.awsSdk.cognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIdentityPoolConfigurationResponse extends StObject {
  
  /**
    * Options to apply to this identity pool for Amazon Cognito streams.
    */
  var CognitoStreams: js.UndefOr[typings.awsSdk.cognitosyncMod.CognitoStreams] = js.undefined
  
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito.
    */
  var IdentityPoolId: js.UndefOr[typings.awsSdk.cognitosyncMod.IdentityPoolId] = js.undefined
  
  /**
    * Options to apply to this identity pool for push synchronization.
    */
  var PushSync: js.UndefOr[typings.awsSdk.cognitosyncMod.PushSync] = js.undefined
}
object GetIdentityPoolConfigurationResponse {
  
  inline def apply(): GetIdentityPoolConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIdentityPoolConfigurationResponse]
  }
  
  extension [Self <: GetIdentityPoolConfigurationResponse](x: Self) {
    
    inline def setCognitoStreams(value: CognitoStreams): Self = StObject.set(x, "CognitoStreams", value.asInstanceOf[js.Any])
    
    inline def setCognitoStreamsUndefined: Self = StObject.set(x, "CognitoStreams", js.undefined)
    
    inline def setIdentityPoolId(value: IdentityPoolId): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    inline def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
    
    inline def setPushSync(value: PushSync): Self = StObject.set(x, "PushSync", value.asInstanceOf[js.Any])
    
    inline def setPushSyncUndefined: Self = StObject.set(x, "PushSync", js.undefined)
  }
}
