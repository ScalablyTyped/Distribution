package typings.bitcoinjsDashLib

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InputM extends js.Object {
  var input: Buffer
  var m: Double
  var n: Double
  var output: Buffer
  var pubkeys: js.Array[Buffer]
  var signatures: js.Array[Buffer]
  var witness: js.Array[Buffer]
}

object Anon_InputM {
  @scala.inline
  def apply(
    input: Buffer,
    m: Double,
    n: Double,
    output: Buffer,
    pubkeys: js.Array[Buffer],
    signatures: js.Array[Buffer],
    witness: js.Array[Buffer]
  ): Anon_InputM = {
    val __obj = js.Dynamic.literal(input = input, m = m, n = n, output = output, pubkeys = pubkeys, signatures = signatures, witness = witness)
  
    __obj.asInstanceOf[Anon_InputM]
  }
}

