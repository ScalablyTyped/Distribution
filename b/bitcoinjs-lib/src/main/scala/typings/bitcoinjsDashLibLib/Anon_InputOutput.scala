package typings
package bitcoinjsDashLibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InputOutput extends js.Object {
  var input: nodeLib.Buffer
  var output: nodeLib.Buffer
  var pubkey: nodeLib.Buffer
  var signature: nodeLib.Buffer
  var witness: js.Array[nodeLib.Buffer]
}

object Anon_InputOutput {
  @scala.inline
  def apply(
    input: nodeLib.Buffer,
    output: nodeLib.Buffer,
    pubkey: nodeLib.Buffer,
    signature: nodeLib.Buffer,
    witness: js.Array[nodeLib.Buffer]
  ): Anon_InputOutput = {
    val __obj = js.Dynamic.literal(input = input, output = output, pubkey = pubkey, signature = signature, witness = witness)
  
    __obj.asInstanceOf[Anon_InputOutput]
  }
}

