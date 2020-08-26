package typings.bip174.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PsbtOutputUpdate extends js.Object {
  var bip32Derivation: js.UndefOr[js.Array[Bip32Derivation]] = js.native
  var redeemScript: js.UndefOr[RedeemScript] = js.native
  var witnessScript: js.UndefOr[WitnessScript] = js.native
}

object PsbtOutputUpdate {
  @scala.inline
  def apply(): PsbtOutputUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PsbtOutputUpdate]
  }
  @scala.inline
  implicit class PsbtOutputUpdateOps[Self <: PsbtOutputUpdate] (val x: Self) extends AnyVal {
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
    def setBip32DerivationVarargs(value: Bip32Derivation*): Self = this.set("bip32Derivation", js.Array(value :_*))
    @scala.inline
    def setBip32Derivation(value: js.Array[Bip32Derivation]): Self = this.set("bip32Derivation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBip32Derivation: Self = this.set("bip32Derivation", js.undefined)
    @scala.inline
    def setRedeemScript(value: RedeemScript): Self = this.set("redeemScript", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedeemScript: Self = this.set("redeemScript", js.undefined)
    @scala.inline
    def setWitnessScript(value: WitnessScript): Self = this.set("witnessScript", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWitnessScript: Self = this.set("witnessScript", js.undefined)
  }
  
}

