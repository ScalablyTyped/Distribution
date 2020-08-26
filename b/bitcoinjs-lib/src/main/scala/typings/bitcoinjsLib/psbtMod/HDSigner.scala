package typings.bitcoinjsLib.psbtMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HDSigner extends HDSignerBase {
  /**
    * The path string must match /^m(\/\d+'?)+$/
    * ex. m/44'/0'/0'/1/23 levels with ' must be hard derivations
    */
  def derivePath(path: String): HDSigner = js.native
  /**
    * Input hash (the "message digest") for the signature algorithm
    * Return a 64 byte signature (32 byte r and 32 byte s in that order)
    */
  def sign(hash: Buffer): Buffer = js.native
}

object HDSigner {
  @scala.inline
  def apply(derivePath: String => HDSigner, fingerprint: Buffer, publicKey: Buffer, sign: Buffer => Buffer): HDSigner = {
    val __obj = js.Dynamic.literal(derivePath = js.Any.fromFunction1(derivePath), fingerprint = fingerprint.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], sign = js.Any.fromFunction1(sign))
    __obj.asInstanceOf[HDSigner]
  }
  @scala.inline
  implicit class HDSignerOps[Self <: HDSigner] (val x: Self) extends AnyVal {
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
    def setDerivePath(value: String => HDSigner): Self = this.set("derivePath", js.Any.fromFunction1(value))
    @scala.inline
    def setSign(value: Buffer => Buffer): Self = this.set("sign", js.Any.fromFunction1(value))
  }
  
}

