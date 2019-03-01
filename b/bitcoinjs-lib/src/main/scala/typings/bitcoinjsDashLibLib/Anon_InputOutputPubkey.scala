package typings
package bitcoinjsDashLibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InputOutputPubkey extends js.Object {
  var input: nodeLib.Buffer
  var output: nodeLib.Buffer
  var pubkey: nodeLib.Buffer
  var signature: nodeLib.Buffer
  var witness: js.Array[nodeLib.Buffer]
}

object Anon_InputOutputPubkey {
  @scala.inline
  def apply(
    input: nodeLib.Buffer,
    output: nodeLib.Buffer,
    pubkey: nodeLib.Buffer,
    signature: nodeLib.Buffer,
    witness: js.Array[nodeLib.Buffer]
  ): Anon_InputOutputPubkey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("input")(input)
    __obj.updateDynamic("output")(output)
    __obj.updateDynamic("pubkey")(pubkey)
    __obj.updateDynamic("signature")(signature)
    __obj.updateDynamic("witness")(witness)
    __obj.asInstanceOf[Anon_InputOutputPubkey]
  }
}

