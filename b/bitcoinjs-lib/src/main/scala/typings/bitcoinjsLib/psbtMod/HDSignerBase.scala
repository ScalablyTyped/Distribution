package typings.bitcoinjsLib.psbtMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HDSignerBase extends js.Object {
  /**
    * The first 4 bytes of the sha256-ripemd160 of the publicKey
    */
  var fingerprint: Buffer
  /**
    * DER format compressed publicKey buffer
    */
  var publicKey: Buffer
}

object HDSignerBase {
  @scala.inline
  def apply(fingerprint: Buffer, publicKey: Buffer): HDSignerBase = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HDSignerBase]
  }
}

