package typings
package bitcoinjsDashLibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: js.UndefOr[java.lang.String] = js.undefined
  var hash: js.UndefOr[nodeLib.Buffer] = js.undefined
  var input: js.UndefOr[nodeLib.Buffer] = js.undefined
  var network: js.UndefOr[bitcoinjsDashLibLib.bitcoinjsDashLibMod.Network] = js.undefined
  var output: js.UndefOr[nodeLib.Buffer] = js.undefined
  var pubkey: js.UndefOr[nodeLib.Buffer] = js.undefined
  var signature: js.UndefOr[nodeLib.Buffer] = js.undefined
}

object Anon_Address {
  @scala.inline
  def apply(
    address: java.lang.String = null,
    hash: nodeLib.Buffer = null,
    input: nodeLib.Buffer = null,
    network: bitcoinjsDashLibLib.bitcoinjsDashLibMod.Network = null,
    output: nodeLib.Buffer = null,
    pubkey: nodeLib.Buffer = null,
    signature: nodeLib.Buffer = null
  ): Anon_Address = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (input != null) __obj.updateDynamic("input")(input)
    if (network != null) __obj.updateDynamic("network")(network)
    if (output != null) __obj.updateDynamic("output")(output)
    if (pubkey != null) __obj.updateDynamic("pubkey")(pubkey)
    if (signature != null) __obj.updateDynamic("signature")(signature)
    __obj.asInstanceOf[Anon_Address]
  }
}

