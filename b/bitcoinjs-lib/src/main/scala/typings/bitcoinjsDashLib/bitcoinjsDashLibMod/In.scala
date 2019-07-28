package typings.bitcoinjsDashLib.bitcoinjsDashLibMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait In extends js.Object {
  var hash: Buffer
  var index: Double
  var script: Buffer
  var sequence: Double
  var witness: js.Array[Buffer]
}

object In {
  @scala.inline
  def apply(hash: Buffer, index: Double, script: Buffer, sequence: Double, witness: js.Array[Buffer]): In = {
    val __obj = js.Dynamic.literal(hash = hash, index = index, script = script, sequence = sequence, witness = witness)
  
    __obj.asInstanceOf[In]
  }
}

