package typings.bitcoinjsDashLib.bitcoinjsDashLibMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Input extends js.Object {
  var prevOutScript: Buffer
  var prevOutType: String
  var pubKeys: js.Array[Buffer]
  var signScript: Buffer
  var signType: String
  var signatures: js.Array[Buffer]
  var witness: Boolean
}

object Input {
  @scala.inline
  def apply(
    prevOutScript: Buffer,
    prevOutType: String,
    pubKeys: js.Array[Buffer],
    signScript: Buffer,
    signType: String,
    signatures: js.Array[Buffer],
    witness: Boolean
  ): Input = {
    val __obj = js.Dynamic.literal(prevOutScript = prevOutScript, prevOutType = prevOutType, pubKeys = pubKeys, signScript = signScript, signType = signType, signatures = signatures, witness = witness)
  
    __obj.asInstanceOf[Input]
  }
}

