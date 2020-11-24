package typings.bitcoinjsLib.psbtMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HDSignerBase extends js.Object {
  
  /**
    * The first 4 bytes of the sha256-ripemd160 of the publicKey
    */
  var fingerprint: Buffer = js.native
  
  /**
    * DER format compressed publicKey buffer
    */
  var publicKey: Buffer = js.native
}
object HDSignerBase {
  
  @scala.inline
  def apply(fingerprint: Buffer, publicKey: Buffer): HDSignerBase = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HDSignerBase]
  }
  
  @scala.inline
  implicit class HDSignerBaseOps[Self <: HDSignerBase] (val x: Self) extends AnyVal {
    
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
    def setFingerprint(value: Buffer): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKey(value: Buffer): Self = this.set("publicKey", value.asInstanceOf[js.Any])
  }
}
