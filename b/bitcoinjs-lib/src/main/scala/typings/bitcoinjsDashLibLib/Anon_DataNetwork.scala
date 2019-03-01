package typings
package bitcoinjsDashLibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataNetwork extends js.Object {
  var data: js.UndefOr[js.Array[nodeLib.Buffer]] = js.undefined
  var network: js.UndefOr[bitcoinjsDashLibLib.bitcoinjsDashLibMod.Network] = js.undefined
  var output: js.UndefOr[nodeLib.Buffer] = js.undefined
}

object Anon_DataNetwork {
  @scala.inline
  def apply(
    data: js.Array[nodeLib.Buffer] = null,
    network: bitcoinjsDashLibLib.bitcoinjsDashLibMod.Network = null,
    output: nodeLib.Buffer = null
  ): Anon_DataNetwork = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (network != null) __obj.updateDynamic("network")(network)
    if (output != null) __obj.updateDynamic("output")(output)
    __obj.asInstanceOf[Anon_DataNetwork]
  }
}

