package typings.bitcoinjsDashLib

import typings.bitcoinjsDashLib.bitcoinjsDashLibMod.Network
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InputNetwork extends js.Object {
  var input: js.UndefOr[Buffer] = js.undefined
  var network: js.UndefOr[Network] = js.undefined
  var output: js.UndefOr[Buffer] = js.undefined
  var pubkey: js.UndefOr[Buffer] = js.undefined
  var signature: js.UndefOr[Buffer] = js.undefined
}

object Anon_InputNetwork {
  @scala.inline
  def apply(
    input: Buffer = null,
    network: Network = null,
    output: Buffer = null,
    pubkey: Buffer = null,
    signature: Buffer = null
  ): Anon_InputNetwork = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input)
    if (network != null) __obj.updateDynamic("network")(network)
    if (output != null) __obj.updateDynamic("output")(output)
    if (pubkey != null) __obj.updateDynamic("pubkey")(pubkey)
    if (signature != null) __obj.updateDynamic("signature")(signature)
    __obj.asInstanceOf[Anon_InputNetwork]
  }
}

