package typings
package bitcoinjsDashLibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InputMN extends js.Object {
  var input: nodeLib.Buffer
  var m: scala.Double
  var n: scala.Double
  var output: nodeLib.Buffer
  var pubkeys: js.Array[nodeLib.Buffer]
  var signatures: js.Array[nodeLib.Buffer]
  var witness: js.Array[nodeLib.Buffer]
}

object Anon_InputMN {
  @scala.inline
  def apply(
    input: nodeLib.Buffer,
    m: scala.Double,
    n: scala.Double,
    output: nodeLib.Buffer,
    pubkeys: js.Array[nodeLib.Buffer],
    signatures: js.Array[nodeLib.Buffer],
    witness: js.Array[nodeLib.Buffer]
  ): Anon_InputMN = {
    val __obj = js.Dynamic.literal(input = input, m = m, n = n, output = output, pubkeys = pubkeys, signatures = signatures, witness = witness)
  
    __obj.asInstanceOf[Anon_InputMN]
  }
}

