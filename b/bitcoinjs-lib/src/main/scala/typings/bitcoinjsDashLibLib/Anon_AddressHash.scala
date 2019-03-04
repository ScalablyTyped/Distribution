package typings
package bitcoinjsDashLibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddressHash extends js.Object {
  var address: java.lang.String
  var hash: nodeLib.Buffer
  var input: nodeLib.Buffer
  var output: nodeLib.Buffer
  var pubkey: nodeLib.Buffer
  var signature: nodeLib.Buffer
  var witness: js.Array[nodeLib.Buffer]
}

object Anon_AddressHash {
  @scala.inline
  def apply(
    address: java.lang.String,
    hash: nodeLib.Buffer,
    input: nodeLib.Buffer,
    output: nodeLib.Buffer,
    pubkey: nodeLib.Buffer,
    signature: nodeLib.Buffer,
    witness: js.Array[nodeLib.Buffer]
  ): Anon_AddressHash = {
    val __obj = js.Dynamic.literal(address = address, hash = hash, input = input, output = output, pubkey = pubkey, signature = signature, witness = witness)
  
    __obj.asInstanceOf[Anon_AddressHash]
  }
}

