package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEffectivePoliciesRequest extends StObject {
  
  /**
    * The Cognito identity pool ID.
    */
  var cognitoIdentityPoolId: js.UndefOr[CognitoIdentityPoolId] = js.undefined
  
  /**
    * The principal. Valid principals are CertificateArn (arn:aws:iot:region:accountId:cert/certificateId), thingGroupArn (arn:aws:iot:region:accountId:thinggroup/groupName) and CognitoId (region:id).
    */
  var principal: js.UndefOr[Principal] = js.undefined
  
  /**
    * The thing name.
    */
  var thingName: js.UndefOr[ThingName] = js.undefined
}
object GetEffectivePoliciesRequest {
  
  inline def apply(): GetEffectivePoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEffectivePoliciesRequest]
  }
  
  extension [Self <: GetEffectivePoliciesRequest](x: Self) {
    
    inline def setCognitoIdentityPoolId(value: CognitoIdentityPoolId): Self = StObject.set(x, "cognitoIdentityPoolId", value.asInstanceOf[js.Any])
    
    inline def setCognitoIdentityPoolIdUndefined: Self = StObject.set(x, "cognitoIdentityPoolId", js.undefined)
    
    inline def setPrincipal(value: Principal): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
    
    inline def setPrincipalUndefined: Self = StObject.set(x, "principal", js.undefined)
    
    inline def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
    
    inline def setThingNameUndefined: Self = StObject.set(x, "thingName", js.undefined)
  }
}
