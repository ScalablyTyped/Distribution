package typings.bip174.interfacesMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartialSig extends js.Object {
  var pubkey: Buffer = js.native
  var signature: Buffer = js.native
}

object PartialSig {
  @scala.inline
  def apply(pubkey: Buffer, signature: Buffer): PartialSig = {
    val __obj = js.Dynamic.literal(pubkey = pubkey.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSig]
  }
  @scala.inline
  implicit class PartialSigOps[Self <: PartialSig] (val x: Self) extends AnyVal {
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
    def setPubkey(value: Buffer): Self = this.set("pubkey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignature(value: Buffer): Self = this.set("signature", value.asInstanceOf[js.Any])
  }
  
}

