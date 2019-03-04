package typings
package bitcoinjsDashLibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddressHashInputOutput extends js.Object {
  var address: java.lang.String
  var hash: nodeLib.Buffer
  var input: nodeLib.Buffer
  var output: nodeLib.Buffer
  var redeem: bitcoinjsDashLibLib.bitcoinjsDashLibMod.paymentsNs.Redeem
  var witness: js.Array[nodeLib.Buffer]
}

object Anon_AddressHashInputOutput {
  @scala.inline
  def apply(
    address: java.lang.String,
    hash: nodeLib.Buffer,
    input: nodeLib.Buffer,
    output: nodeLib.Buffer,
    redeem: bitcoinjsDashLibLib.bitcoinjsDashLibMod.paymentsNs.Redeem,
    witness: js.Array[nodeLib.Buffer]
  ): Anon_AddressHashInputOutput = {
    val __obj = js.Dynamic.literal(address = address, hash = hash, input = input, output = output, redeem = redeem, witness = witness)
  
    __obj.asInstanceOf[Anon_AddressHashInputOutput]
  }
}

