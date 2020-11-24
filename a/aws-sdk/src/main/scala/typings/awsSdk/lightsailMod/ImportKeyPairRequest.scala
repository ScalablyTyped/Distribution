package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportKeyPairRequest extends js.Object {
  
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
  implicit class ImportKeyPairRequestOps[Self <: ImportKeyPairRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKeyPairName(value: ResourceName): Self = this.set("keyPairName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyBase64(value: Base64): Self = this.set("publicKeyBase64", value.asInstanceOf[js.Any])
  }
}
