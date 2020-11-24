package typings.bitcoinjsLib.psbtMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Same as above but with async sign method
  */
@js.native
trait HDSignerAsync extends HDSignerBase {
  
  def derivePath(path: String): HDSignerAsync = js.native
  
  def sign(hash: Buffer): js.Promise[Buffer] = js.native
}
object HDSignerAsync {
  
  @scala.inline
  def apply(
    derivePath: String => HDSignerAsync,
    fingerprint: Buffer,
    publicKey: Buffer,
    sign: Buffer => js.Promise[Buffer]
  ): HDSignerAsync = {
    val __obj = js.Dynamic.literal(derivePath = js.Any.fromFunction1(derivePath), fingerprint = fingerprint.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], sign = js.Any.fromFunction1(sign))
    __obj.asInstanceOf[HDSignerAsync]
  }
  
  @scala.inline
  implicit class HDSignerAsyncOps[Self <: HDSignerAsync] (val x: Self) extends AnyVal {
    
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
    def setDerivePath(value: String => HDSignerAsync): Self = this.set("derivePath", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSign(value: Buffer => js.Promise[Buffer]): Self = this.set("sign", js.Any.fromFunction1(value))
  }
}
