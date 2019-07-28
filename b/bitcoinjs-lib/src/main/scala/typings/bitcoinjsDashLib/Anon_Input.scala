package typings.bitcoinjsDashLib

import typings.bitcoinjsDashLib.bitcoinjsDashLibMod.Network
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Input extends js.Object {
  var input: js.UndefOr[Buffer] = js.undefined
  var m: js.UndefOr[Double] = js.undefined
  var n: js.UndefOr[Double] = js.undefined
  var network: js.UndefOr[Network] = js.undefined
  var output: js.UndefOr[Buffer] = js.undefined
  var pubkeys: js.UndefOr[js.Array[Buffer]] = js.undefined
  var signatures: js.UndefOr[js.Array[Buffer]] = js.undefined
}

object Anon_Input {
  @scala.inline
  def apply(
    input: Buffer = null,
    m: Int | Double = null,
    n: Int | Double = null,
    network: Network = null,
    output: Buffer = null,
    pubkeys: js.Array[Buffer] = null,
    signatures: js.Array[Buffer] = null
  ): Anon_Input = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input)
    if (m != null) __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    if (n != null) __obj.updateDynamic("n")(n.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network)
    if (output != null) __obj.updateDynamic("output")(output)
    if (pubkeys != null) __obj.updateDynamic("pubkeys")(pubkeys)
    if (signatures != null) __obj.updateDynamic("signatures")(signatures)
    __obj.asInstanceOf[Anon_Input]
  }
}

