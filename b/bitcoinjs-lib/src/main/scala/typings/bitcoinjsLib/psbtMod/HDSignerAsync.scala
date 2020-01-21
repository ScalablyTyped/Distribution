package typings.bitcoinjsLib.psbtMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Same as above but with async sign method
  */
trait HDSignerAsync extends HDSignerBase {
  def derivePath(path: String): HDSignerAsync
  def sign(hash: Buffer): js.Promise[Buffer]
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
}

