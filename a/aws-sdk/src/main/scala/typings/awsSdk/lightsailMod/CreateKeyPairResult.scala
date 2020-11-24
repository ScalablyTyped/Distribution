package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateKeyPairResult extends js.Object {
  
  /**
    * An array of key-value pairs containing information about the new key pair you just created.
    */
  var keyPair: js.UndefOr[KeyPair] = js.native
  
  /**
    * An array of objects that describe the result of the action, such as the status of the request, the timestamp of the request, and the resources affected by the request.
    */
  var operation: js.UndefOr[Operation] = js.native
  
  /**
    * A base64-encoded RSA private key.
    */
  var privateKeyBase64: js.UndefOr[Base64] = js.native
  
  /**
    * A base64-encoded public key of the ssh-rsa type.
    */
  var publicKeyBase64: js.UndefOr[Base64] = js.native
}
object CreateKeyPairResult {
  
  @scala.inline
  def apply(): CreateKeyPairResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateKeyPairResult]
  }
  
  @scala.inline
  implicit class CreateKeyPairResultOps[Self <: CreateKeyPairResult] (val x: Self) extends AnyVal {
    
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
    def setKeyPair(value: KeyPair): Self = this.set("keyPair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyPair: Self = this.set("keyPair", js.undefined)
    
    @scala.inline
    def setOperation(value: Operation): Self = this.set("operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
    
    @scala.inline
    def setPrivateKeyBase64(value: Base64): Self = this.set("privateKeyBase64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateKeyBase64: Self = this.set("privateKeyBase64", js.undefined)
    
    @scala.inline
    def setPublicKeyBase64(value: Base64): Self = this.set("publicKeyBase64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicKeyBase64: Self = this.set("publicKeyBase64", js.undefined)
  }
}
