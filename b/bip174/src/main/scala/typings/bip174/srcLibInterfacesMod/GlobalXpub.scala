package typings.bip174.srcLibInterfacesMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalXpub extends js.Object {
  var extendedPubkey: Buffer
  var masterFingerprint: Buffer
  var path: String
}

object GlobalXpub {
  @scala.inline
  def apply(extendedPubkey: Buffer, masterFingerprint: Buffer, path: String): GlobalXpub = {
    val __obj = js.Dynamic.literal(extendedPubkey = extendedPubkey, masterFingerprint = masterFingerprint, path = path)
  
    __obj.asInstanceOf[GlobalXpub]
  }
}

