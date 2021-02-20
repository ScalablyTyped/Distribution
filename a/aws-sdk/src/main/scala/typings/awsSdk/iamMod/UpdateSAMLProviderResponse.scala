package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSAMLProviderResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the SAML provider that was updated.
    */
  var SAMLProviderArn: js.UndefOr[arnType] = js.native
}
object UpdateSAMLProviderResponse {
  
  @scala.inline
  def apply(): UpdateSAMLProviderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSAMLProviderResponse]
  }
  
  @scala.inline
  implicit class UpdateSAMLProviderResponseMutableBuilder[Self <: UpdateSAMLProviderResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSAMLProviderArn(value: arnType): Self = StObject.set(x, "SAMLProviderArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSAMLProviderArnUndefined: Self = StObject.set(x, "SAMLProviderArn", js.undefined)
  }
}
