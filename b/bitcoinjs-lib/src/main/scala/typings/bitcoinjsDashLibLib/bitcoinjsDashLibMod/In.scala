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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("script")(script)
    __obj.updateDynamic("sequence")(sequence)
    __obj.updateDynamic("witness")(witness)
    __obj.asInstanceOf[In]
  }
}

