package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportKeyPairRequest extends StObject {
  
  /**
    * The name of the key pair for which you want to import the public key.
    */
  var keyPairName: ResourceName = js.native
  
  /**
    * A base64-encoded public key of the ssh-rsa type.
    */
  var publicKeyBase64: Base64 = js.native
}
object ImportKeyPairRequest {
  
  @scala.inline
  def apply(keyPairName: ResourceName, publicKeyBase64: Base64): ImportKeyPairRequest = {
    val __obj = js.Dynamic.literal(keyPairName = keyPairName.asInstanceOf[js.Any], publicKeyBase64 = publicKeyBase64.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportKeyPairRequest]
  }
  
  @scala.inline
  implicit class ImportKeyPairRequestMutableBuilder[Self <: ImportKeyPairRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyPairName(value: ResourceName): Self = StObject.set(x, "keyPairName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyBase64(value: Base64): Self = StObject.set(x, "publicKeyBase64", value.asInstanceOf[js.Any])
  }
}
