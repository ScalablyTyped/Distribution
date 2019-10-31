package typings.bip174.srcLibInterfacesMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bip32Derivation extends js.Object {
  var masterFingerprint: Buffer
  var path: String
  var pubkey: Buffer
}

object Bip32Derivation {
  @scala.inline
  def apply(masterFingerprint: Buffer, path: String, pubkey: Buffer): Bip32Derivation = {
    val __obj = js.Dynamic.literal(masterFingerprint = masterFingerprint, path = path, pubkey = pubkey)
  
    __obj.asInstanceOf[Bip32Derivation]
  }
}

