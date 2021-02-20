package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePublicKeyRequest extends StObject {
  
  /**
    * A CloudFront public key configuration.
    */
  var PublicKeyConfig: typings.awsSdk.cloudfrontMod.PublicKeyConfig = js.native
}
object CreatePublicKeyRequest {
  
  @scala.inline
  def apply(PublicKeyConfig: PublicKeyConfig): CreatePublicKeyRequest = {
    val __obj = js.Dynamic.literal(PublicKeyConfig = PublicKeyConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePublicKeyRequest]
  }
  
  @scala.inline
  implicit class CreatePublicKeyRequestMutableBuilder[Self <: CreatePublicKeyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPublicKeyConfig(value: PublicKeyConfig): Self = StObject.set(x, "PublicKeyConfig", value.asInstanceOf[js.Any])
  }
}
