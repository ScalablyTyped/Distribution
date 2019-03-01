package typings
package bitcoinjsDashLibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InputM extends js.Object {
  var input: js.UndefOr[nodeLib.Buffer] = js.undefined
  var m: js.UndefOr[scala.Double] = js.undefined
  var n: js.UndefOr[scala.Double] = js.undefined
  var network: js.UndefOr[bitcoinjsDashLibLib.bitcoinjsDashLibMod.Network] = js.undefined
  var output: js.UndefOr[nodeLib.Buffer] = js.undefined
  var pubkeys: js.UndefOr[js.Array[nodeLib.Buffer]] = js.undefined
  var signatures: js.UndefOr[js.Array[nodeLib.Buffer]] = js.undefined
}

object Anon_InputM {
  @scala.inline
  def apply(
    input: nodeLib.Buffer = null,
    m: scala.Int | scala.Double = null,
    n: scala.Int | scala.Double = null,
    network: bitcoinjsDashLibLib.bitcoinjsDashLibMod.Network = null,
    output: nodeLib.Buffer = null,
    pubkeys: js.Array[nodeLib.Buffer] = null,
    signatures: js.Array[nodeLib.Buffer] = null
  ): Anon_InputM = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input)
    if (m != null) __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    if (n != null) __obj.updateDynamic("n")(n.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network)
    if (output != null) __obj.updateDynamic("output")(output)
    if (pubkeys != null) __obj.updateDynamic("pubkeys")(pubkeys)
    if (signatures != null) __obj.updateDynamic("signatures")(signatures)
    __obj.asInstanceOf[Anon_InputM]
  }
}

