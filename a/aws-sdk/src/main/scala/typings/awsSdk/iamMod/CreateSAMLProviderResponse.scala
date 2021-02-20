package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSAMLProviderResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the new SAML provider resource in IAM.
    */
  var SAMLProviderArn: js.UndefOr[arnType] = js.native
}
object CreateSAMLProviderResponse {
  
  @scala.inline
  def apply(): CreateSAMLProviderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSAMLProviderResponse]
  }
  
  @scala.inline
  implicit class CreateSAMLProviderResponseMutableBuilder[Self <: CreateSAMLProviderResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSAMLProviderArn(value: arnType): Self = StObject.set(x, "SAMLProviderArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSAMLProviderArnUndefined: Self = StObject.set(x, "SAMLProviderArn", js.undefined)
  }
}
