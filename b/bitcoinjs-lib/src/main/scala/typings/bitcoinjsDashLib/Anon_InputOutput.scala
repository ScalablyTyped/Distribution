package typings.bitcoinjsDashLib

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InputOutput extends js.Object {
  var input: Buffer
  var output: Buffer
  var pubkey: Buffer
  var signature: Buffer
  var witness: js.Array[Buffer]
}

object Anon_InputOutput {
  @scala.inline
  def apply(input: Buffer, output: Buffer, pubkey: Buffer, signature: Buffer, witness: js.Array[Buffer]): Anon_InputOutput = {
    val __obj = js.Dynamic.literal(input = input, output = output, pubkey = pubkey, signature = signature, witness = witness)
  
    __obj.asInstanceOf[Anon_InputOutput]
  }
}

