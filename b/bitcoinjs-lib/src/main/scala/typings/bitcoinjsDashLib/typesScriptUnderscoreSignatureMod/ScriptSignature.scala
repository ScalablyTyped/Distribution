package typings.bitcoinjsDashLib.typesScriptUnderscoreSignatureMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptSignature extends js.Object {
  var hashType: Double
  var signature: Buffer
}

object ScriptSignature {
  @scala.inline
  def apply(hashType: Double, signature: Buffer): ScriptSignature = {
    val __obj = js.Dynamic.literal(hashType = hashType, signature = signature)
  
    __obj.asInstanceOf[ScriptSignature]
  }
}

