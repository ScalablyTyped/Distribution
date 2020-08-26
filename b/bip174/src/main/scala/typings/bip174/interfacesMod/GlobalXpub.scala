package typings.bip174.interfacesMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalXpub extends js.Object {
  var extendedPubkey: Buffer = js.native
  var masterFingerprint: Buffer = js.native
  var path: String = js.native
}

object GlobalXpub {
  @scala.inline
  def apply(extendedPubkey: Buffer, masterFingerprint: Buffer, path: String): GlobalXpub = {
    val __obj = js.Dynamic.literal(extendedPubkey = extendedPubkey.asInstanceOf[js.Any], masterFingerprint = masterFingerprint.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalXpub]
  }
  @scala.inline
  implicit class GlobalXpubOps[Self <: GlobalXpub] (val x: Self) extends AnyVal {
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
    def setExtendedPubkey(value: Buffer): Self = this.set("extendedPubkey", value.asInstanceOf[js.Any])
    @scala.inline
    def setMasterFingerprint(value: Buffer): Self = this.set("masterFingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
  }
  
}

