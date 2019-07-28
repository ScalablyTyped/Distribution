package typings.bitcoinjsDashLib

import typings.bitcoinjsDashLib.bitcoinjsDashLibMod.Network
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddressHashInputNetwork extends js.Object {
  var address: js.UndefOr[String] = js.undefined
  var hash: js.UndefOr[Buffer] = js.undefined
  var input: js.UndefOr[Buffer] = js.undefined
  var network: js.UndefOr[Network] = js.undefined
  var output: js.UndefOr[Buffer] = js.undefined
  var pubkey: js.UndefOr[Buffer] = js.undefined
  var signature: js.UndefOr[Buffer] = js.undefined
  var witness: js.UndefOr[js.Array[Buffer]] = js.undefined
}

object Anon_AddressHashInputNetwork {
  @scala.inline
  def apply(
    address: String = null,
    hash: Buffer = null,
    input: Buffer = null,
    network: Network = null,
    output: Buffer = null,
    pubkey: Buffer = null,
    signature: Buffer = null,
    witness: js.Array[Buffer] = null
  ): Anon_AddressHashInputNetwork = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (input != null) __obj.updateDynamic("input")(input)
    if (network != null) __obj.updateDynamic("network")(network)
    if (output != null) __obj.updateDynamic("output")(output)
    if (pubkey != null) __obj.updateDynamic("pubkey")(pubkey)
    if (signature != null) __obj.updateDynamic("signature")(signature)
    if (witness != null) __obj.updateDynamic("witness")(witness)
    __obj.asInstanceOf[Anon_AddressHashInputNetwork]
  }
}

