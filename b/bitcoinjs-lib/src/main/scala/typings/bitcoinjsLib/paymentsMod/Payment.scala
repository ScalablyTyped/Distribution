package typings.bitcoinjsLib.paymentsMod

import typings.bitcoinjsLib.networksMod.Network
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Payment extends js.Object {
  var address: js.UndefOr[String] = js.native
  var data: js.UndefOr[js.Array[Buffer]] = js.native
  var hash: js.UndefOr[Buffer] = js.native
  var input: js.UndefOr[Buffer] = js.native
  var m: js.UndefOr[Double] = js.native
  var n: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var network: js.UndefOr[Network] = js.native
  var output: js.UndefOr[Buffer] = js.native
  var pubkey: js.UndefOr[Buffer] = js.native
  var pubkeys: js.UndefOr[js.Array[Buffer]] = js.native
  var redeem: js.UndefOr[Payment] = js.native
  var signature: js.UndefOr[Buffer] = js.native
  var signatures: js.UndefOr[js.Array[Buffer]] = js.native
  var witness: js.UndefOr[js.Array[Buffer]] = js.native
}

object Payment {
  @scala.inline
  def apply(): Payment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Payment]
  }
  @scala.inline
  implicit class PaymentOps[Self <: Payment] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setDataVarargs(value: Buffer*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[Buffer]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setHash(value: Buffer): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    @scala.inline
    def setInput(value: Buffer): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setM(value: Double): Self = this.set("m", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM: Self = this.set("m", js.undefined)
    @scala.inline
    def setN(value: Double): Self = this.set("n", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteN: Self = this.set("n", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNetwork(value: Network): Self = this.set("network", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    @scala.inline
    def setOutput(value: Buffer): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    @scala.inline
    def setPubkey(value: Buffer): Self = this.set("pubkey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePubkey: Self = this.set("pubkey", js.undefined)
    @scala.inline
    def setPubkeysVarargs(value: Buffer*): Self = this.set("pubkeys", js.Array(value :_*))
    @scala.inline
    def setPubkeys(value: js.Array[Buffer]): Self = this.set("pubkeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePubkeys: Self = this.set("pubkeys", js.undefined)
    @scala.inline
    def setRedeem(value: Payment): Self = this.set("redeem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedeem: Self = this.set("redeem", js.undefined)
    @scala.inline
    def setSignature(value: Buffer): Self = this.set("signature", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
    @scala.inline
    def setSignaturesVarargs(value: Buffer*): Self = this.set("signatures", js.Array(value :_*))
    @scala.inline
    def setSignatures(value: js.Array[Buffer]): Self = this.set("signatures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignatures: Self = this.set("signatures", js.undefined)
    @scala.inline
    def setWitnessVarargs(value: Buffer*): Self = this.set("witness", js.Array(value :_*))
    @scala.inline
    def setWitness(value: js.Array[Buffer]): Self = this.set("witness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWitness: Self = this.set("witness", js.undefined)
  }
  
}

