package typings
package bitcoinjsDashLibLib.bitcoinjsDashLibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait In extends js.Object {
  var hash: nodeLib.Buffer
  var index: scala.Double
  var script: nodeLib.Buffer
  var sequence: scala.Double
  var witness: js.Array[nodeLib.Buffer]
}

object In {
  @scala.inline
  def apply(
    hash: nodeLib.Buffer,
    index: scala.Double,
    script: nodeLib.Buffer,
    sequence: scala.Double,
    witness: js.Array[nodeLib.Buffer]
  ): In = {
    val __obj = js.Dynamic.literal(hash = hash, index = index, script = script, sequence = sequence, witness = witness)
  
    __obj.asInstanceOf[In]
  }
}

