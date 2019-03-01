package typings
package bitcoinjsDashLibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddressHashInput extends js.Object {
  var address: js.UndefOr[java.lang.String] = js.undefined
  var hash: js.UndefOr[nodeLib.Buffer] = js.undefined
  var input: js.UndefOr[nodeLib.Buffer] = js.undefined
  var network: js.UndefOr[bitcoinjsDashLibLib.bitcoinjsDashLibMod.Network] = js.undefined
  var output: js.UndefOr[nodeLib.Buffer] = js.undefined
  var redeem: js.UndefOr[bitcoinjsDashLibLib.bitcoinjsDashLibMod.paymentsNs.Redeem] = js.undefined
  var witness: js.UndefOr[js.Array[nodeLib.Buffer]] = js.undefined
}

object Anon_AddressHashInput {
  @scala.inline
  def apply(
    address: java.lang.String = null,
    hash: nodeLib.Buffer = null,
    input: nodeLib.Buffer = null,
    network: bitcoinjsDashLibLib.bitcoinjsDashLibMod.Network = null,
    output: nodeLib.Buffer = null,
    redeem: bitcoinjsDashLibLib.bitcoinjsDashLibMod.paymentsNs.Redeem = null,
    witness: js.Array[nodeLib.Buffer] = null
  ): Anon_AddressHashInput = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (input != null) __obj.updateDynamic("input")(input)
    if (network != null) __obj.updateDynamic("network")(network)
    if (output != null) __obj.updateDynamic("output")(output)
    if (redeem != null) __obj.updateDynamic("redeem")(redeem)
    if (witness != null) __obj.updateDynamic("witness")(witness)
    __obj.asInstanceOf[Anon_AddressHashInput]
  }
}

