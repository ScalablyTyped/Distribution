package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetSecurityTokenServicePreferencesRequest extends StObject {
  
  /**
    * The version of the global endpoint token. Version 1 tokens are valid only in AWS Regions that are available by default. These tokens do not work in manually enabled Regions, such as Asia Pacific (Hong Kong). Version 2 tokens are valid in all Regions. However, version 2 tokens are longer and might affect systems where you temporarily store tokens. For information, see Activating and Deactivating STS in an AWS Region in the IAM User Guide.
    */
  var GlobalEndpointTokenVersion: globalEndpointTokenVersion
}
object SetSecurityTokenServicePreferencesRequest {
  
  @scala.inline
  def apply(GlobalEndpointTokenVersion: globalEndpointTokenVersion): SetSecurityTokenServicePreferencesRequest = {
    val __obj = js.Dynamic.literal(GlobalEndpointTokenVersion = GlobalEndpointTokenVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetSecurityTokenServicePreferencesRequest]
  }
  
  @scala.inline
  implicit class SetSecurityTokenServicePreferencesRequestMutableBuilder[Self <: SetSecurityTokenServicePreferencesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalEndpointTokenVersion(value: globalEndpointTokenVersion): Self = StObject.set(x, "GlobalEndpointTokenVersion", value.asInstanceOf[js.Any])
  }
}
