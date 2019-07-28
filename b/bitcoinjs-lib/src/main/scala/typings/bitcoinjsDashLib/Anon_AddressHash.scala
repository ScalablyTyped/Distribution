package typings.bitcoinjsDashLib

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddressHash extends js.Object {
  var address: String
  var hash: Buffer
  var input: Buffer
  var output: Buffer
  var pubkey: Buffer
  var signature: Buffer
  var witness: js.Array[Buffer]
}

object Anon_AddressHash {
  @scala.inline
  def apply(
    address: String,
    hash: Buffer,
    input: Buffer,
    output: Buffer,
    pubkey: Buffer,
    signature: Buffer,
    witness: js.Array[Buffer]
  ): Anon_AddressHash = {
    val __obj = js.Dynamic.literal(address = address, hash = hash, input = input, output = output, pubkey = pubkey, signature = signature, witness = witness)
  
    __obj.asInstanceOf[Anon_AddressHash]
  }
}

