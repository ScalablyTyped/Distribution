package typings.bitcoinjsDashLib.typesPaymentsMod

import typings.bitcoinjsDashLib.typesNetworksMod.Network
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Payment extends js.Object {
  var address: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Array[Buffer]] = js.undefined
  var hash: js.UndefOr[Buffer] = js.undefined
  var input: js.UndefOr[Buffer] = js.undefined
  var m: js.UndefOr[Double] = js.undefined
  var n: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var network: js.UndefOr[Network] = js.undefined
  var output: js.UndefOr[Buffer] = js.undefined
  var pubkey: js.UndefOr[Buffer] = js.undefined
  var pubkeys: js.UndefOr[js.Array[Buffer]] = js.undefined
  var redeem: js.UndefOr[Payment] = js.undefined
  var signature: js.UndefOr[Buffer] = js.undefined
  var signatures: js.UndefOr[js.Array[Buffer]] = js.undefined
  var witness: js.UndefOr[js.Array[Buffer]] = js.undefined
}

object Payment {
  @scala.inline
  def apply(
    address: String = null,
    data: js.Array[Buffer] = null,
    hash: Buffer = null,
    input: Buffer = null,
    m: Int | Double = null,
    n: Int | Double = null,
    name: String = null,
    network: Network = null,
    output: Buffer = null,
    pubkey: Buffer = null,
    pubkeys: js.Array[Buffer] = null,
    redeem: Payment = null,
    signature: Buffer = null,
    signatures: js.Array[Buffer] = null,
    witness: js.Array[Buffer] = null
  ): Payment = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (data != null) __obj.updateDynamic("data")(data)
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (input != null) __obj.updateDynamic("input")(input)
    if (m != null) __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    if (n != null) __obj.updateDynamic("n")(n.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (network != null) __obj.updateDynamic("network")(network)
    if (output != null) __obj.updateDynamic("output")(output)
    if (pubkey != null) __obj.updateDynamic("pubkey")(pubkey)
    if (pubkeys != null) __obj.updateDynamic("pubkeys")(pubkeys)
    if (redeem != null) __obj.updateDynamic("redeem")(redeem)
    if (signature != null) __obj.updateDynamic("signature")(signature)
    if (signatures != null) __obj.updateDynamic("signatures")(signatures)
    if (witness != null) __obj.updateDynamic("witness")(witness)
    __obj.asInstanceOf[Payment]
  }
}

