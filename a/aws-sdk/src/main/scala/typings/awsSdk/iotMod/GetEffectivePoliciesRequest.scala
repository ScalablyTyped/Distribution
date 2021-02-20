package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEffectivePoliciesRequest extends StObject {
  
  /**
    * The Cognito identity pool ID.
    */
  var cognitoIdentityPoolId: js.UndefOr[CognitoIdentityPoolId] = js.native
  
  /**
    * The principal. Valid principals are CertificateArn (arn:aws:iot:region:accountId:cert/certificateId), thingGroupArn (arn:aws:iot:region:accountId:thinggroup/groupName) and CognitoId (region:id).
    */
  var principal: js.UndefOr[Principal] = js.native
  
  /**
    * The thing name.
    */
  var thingName: js.UndefOr[ThingName] = js.native
}
object GetEffectivePoliciesRequest {
  
  @scala.inline
  def apply(): GetEffectivePoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEffectivePoliciesRequest]
  }
  
  @scala.inline
  implicit class GetEffectivePoliciesRequestMutableBuilder[Self <: GetEffectivePoliciesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCognitoIdentityPoolId(value: CognitoIdentityPoolId): Self = StObject.set(x, "cognitoIdentityPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCognitoIdentityPoolIdUndefined: Self = StObject.set(x, "cognitoIdentityPoolId", js.undefined)
    
    @scala.inline
    def setPrincipal(value: Principal): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalUndefined: Self = StObject.set(x, "principal", js.undefined)
    
    @scala.inline
    def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingNameUndefined: Self = StObject.set(x, "thingName", js.undefined)
  }
}
