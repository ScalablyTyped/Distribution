package typings.bitcoinjsDashLib

import typings.bitcoinjsDashLib.bitcoinjsDashLibMod.Network
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataNetwork extends js.Object {
  var data: js.UndefOr[js.Array[Buffer]] = js.undefined
  var network: js.UndefOr[Network] = js.undefined
  var output: js.UndefOr[Buffer] = js.undefined
}

object Anon_DataNetwork {
  @scala.inline
  def apply(data: js.Array[Buffer] = null, network: Network = null, output: Buffer = null): Anon_DataNetwork = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (network != null) __obj.updateDynamic("network")(network)
    if (output != null) __obj.updateDynamic("output")(output)
    __obj.asInstanceOf[Anon_DataNetwork]
  }
}

