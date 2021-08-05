package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOpenIDConnectProviderResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the new IAM OpenID Connect provider that is created. For more information, see OpenIDConnectProviderListEntry. 
    */
  var OpenIDConnectProviderArn: js.UndefOr[arnType] = js.undefined
}
object CreateOpenIDConnectProviderResponse {
  
  inline def apply(): CreateOpenIDConnectProviderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOpenIDConnectProviderResponse]
  }
  
  extension [Self <: CreateOpenIDConnectProviderResponse](x: Self) {
    
    inline def setOpenIDConnectProviderArn(value: arnType): Self = StObject.set(x, "OpenIDConnectProviderArn", value.asInstanceOf[js.Any])
    
    inline def setOpenIDConnectProviderArnUndefined: Self = StObject.set(x, "OpenIDConnectProviderArn", js.undefined)
  }
}
