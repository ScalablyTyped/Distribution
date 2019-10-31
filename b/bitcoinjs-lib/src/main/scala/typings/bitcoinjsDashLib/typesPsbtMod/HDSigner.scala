package typings.bitcoinjsDashLib.typesPsbtMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HDSigner extends HDSignerBase {
  /**
    * The path string must match /^m(\/\d+'?)+$/
    * ex. m/44'/0'/0'/1/23 levels with ' must be hard derivations
    */
  def derivePath(path: String): HDSigner
  /**
    * Input hash (the "message digest") for the signature algorithm
    * Return a 64 byte signature (32 byte r and 32 byte s in that order)
    */
  def sign(hash: Buffer): Buffer
}

object HDSigner {
  @scala.inline
  def apply(derivePath: String => HDSigner, fingerprint: Buffer, publicKey: Buffer, sign: Buffer => Buffer): HDSigner = {
    val __obj = js.Dynamic.literal(derivePath = js.Any.fromFunction1(derivePath), fingerprint = fingerprint, publicKey = publicKey, sign = js.Any.fromFunction1(sign))
  
    __obj.asInstanceOf[HDSigner]
  }
}

