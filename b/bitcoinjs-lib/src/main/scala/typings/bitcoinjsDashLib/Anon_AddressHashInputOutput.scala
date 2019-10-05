package typings.bitcoinjsDashLib

import typings.bitcoinjsDashLib.bitcoinjsDashLibMod.payments.Redeem
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddressHashInputOutput extends js.Object {
  var address: String
  var hash: Buffer
  var input: Buffer
  var output: Buffer
  var redeem: Redeem
  var witness: js.Array[Buffer]
}

object Anon_AddressHashInputOutput {
  @scala.inline
  def apply(
    address: String,
    hash: Buffer,
    input: Buffer,
    output: Buffer,
    redeem: Redeem,
    witness: js.Array[Buffer]
  ): Anon_AddressHashInputOutput = {
    val __obj = js.Dynamic.literal(address = address, hash = hash, input = input, output = output, redeem = redeem, witness = witness)
  
    __obj.asInstanceOf[Anon_AddressHashInputOutput]
  }
}

