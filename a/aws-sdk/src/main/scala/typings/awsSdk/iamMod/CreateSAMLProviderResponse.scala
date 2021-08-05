package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSAMLProviderResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the new SAML provider resource in IAM.
    */
  var SAMLProviderArn: js.UndefOr[arnType] = js.undefined
}
object CreateSAMLProviderResponse {
  
  inline def apply(): CreateSAMLProviderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSAMLProviderResponse]
  }
  
  extension [Self <: CreateSAMLProviderResponse](x: Self) {
    
    inline def setSAMLProviderArn(value: arnType): Self = StObject.set(x, "SAMLProviderArn", value.asInstanceOf[js.Any])
    
    inline def setSAMLProviderArnUndefined: Self = StObject.set(x, "SAMLProviderArn", js.undefined)
  }
}
