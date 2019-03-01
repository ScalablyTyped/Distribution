package typings
package bitcoinjsDashLibLib.bitcoinjsDashLibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Input extends js.Object {
  var prevOutScript: nodeLib.Buffer
  var prevOutType: java.lang.String
  var pubKeys: js.Array[nodeLib.Buffer]
  var signScript: nodeLib.Buffer
  var signType: java.lang.String
  var signatures: js.Array[nodeLib.Buffer]
  var witness: scala.Boolean
}

object Input {
  @scala.inline
  def apply(
    prevOutScript: nodeLib.Buffer,
    prevOutType: java.lang.String,
    pubKeys: js.Array[nodeLib.Buffer],
    signScript: nodeLib.Buffer,
    signType: java.lang.String,
    signatures: js.Array[nodeLib.Buffer],
    witness: scala.Boolean
  ): Input = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("prevOutScript")(prevOutScript)
    __obj.updateDynamic("prevOutType")(prevOutType)
    __obj.updateDynamic("pubKeys")(pubKeys)
    __obj.updateDynamic("signScript")(signScript)
    __obj.updateDynamic("signType")(signType)
    __obj.updateDynamic("signatures")(signatures)
    __obj.updateDynamic("witness")(witness)
    __obj.asInstanceOf[Input]
  }
}

