package typings.bip32.bip32Mod

import typings.bip32.anon.Private
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Network extends js.Object {
  var bech32: js.UndefOr[String] = js.native
  var bip32: Private = js.native
  var messagePrefix: js.UndefOr[String] = js.native
  var pubKeyHash: js.UndefOr[Double] = js.native
  var scriptHash: js.UndefOr[Double] = js.native
  var wif: Double = js.native
}

object Network {
  @scala.inline
  def apply(bip32: Private, wif: Double): Network = {
    val __obj = js.Dynamic.literal(bip32 = bip32.asInstanceOf[js.Any], wif = wif.asInstanceOf[js.Any])
    __obj.asInstanceOf[Network]
  }
  @scala.inline
  implicit class NetworkOps[Self <: Network] (val x: Self) extends AnyVal {
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
    def setBip32(value: Private): Self = this.set("bip32", value.asInstanceOf[js.Any])
    @scala.inline
    def setWif(value: Double): Self = this.set("wif", value.asInstanceOf[js.Any])
    @scala.inline
    def setBech32(value: String): Self = this.set("bech32", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBech32: Self = this.set("bech32", js.undefined)
    @scala.inline
    def setMessagePrefix(value: String): Self = this.set("messagePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessagePrefix: Self = this.set("messagePrefix", js.undefined)
    @scala.inline
    def setPubKeyHash(value: Double): Self = this.set("pubKeyHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePubKeyHash: Self = this.set("pubKeyHash", js.undefined)
    @scala.inline
    def setScriptHash(value: Double): Self = this.set("scriptHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScriptHash: Self = this.set("scriptHash", js.undefined)
  }
  
}

