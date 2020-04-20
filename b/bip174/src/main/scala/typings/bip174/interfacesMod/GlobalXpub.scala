package typings.bip174.interfacesMod

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
    val __obj = js.Dynamic.literal(extendedPubkey = extendedPubkey.asInstanceOf[js.Any], masterFingerprint = masterFingerprint.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalXpub]
  }
}

