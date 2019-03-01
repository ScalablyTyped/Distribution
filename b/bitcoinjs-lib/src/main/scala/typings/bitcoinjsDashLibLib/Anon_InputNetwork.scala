package typings
package bitcoinjsDashLibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InputNetwork extends js.Object {
  var input: js.UndefOr[nodeLib.Buffer] = js.undefined
  var network: js.UndefOr[bitcoinjsDashLibLib.bitcoinjsDashLibMod.Network] = js.undefined
  var output: js.UndefOr[nodeLib.Buffer] = js.undefined
  var pubkey: js.UndefOr[nodeLib.Buffer] = js.undefined
  var signature: js.UndefOr[nodeLib.Buffer] = js.undefined
}

object Anon_InputNetwork {
  @scala.inline
  def apply(
    input: nodeLib.Buffer = null,
    network: bitcoinjsDashLibLib.bitcoinjsDashLibMod.Network = null,
    output: nodeLib.Buffer = null,
    pubkey: nodeLib.Buffer = null,
    signature: nodeLib.Buffer = null
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

