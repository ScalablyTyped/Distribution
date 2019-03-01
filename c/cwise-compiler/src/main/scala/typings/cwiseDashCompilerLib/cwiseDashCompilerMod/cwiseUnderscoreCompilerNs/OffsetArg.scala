package typings
package cwiseDashCompilerLib.cwiseDashCompilerMod.cwiseUnderscoreCompilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OffsetArg extends ArgType {
  var array: scala.Double
  var offset: js.Array[scala.Double]
}

object OffsetArg {
  @scala.inline
  def apply(array: scala.Double, offset: js.Array[scala.Double]): OffsetArg = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("array")(array)
    __obj.updateDynamic("offset")(offset)
    __obj.asInstanceOf[OffsetArg]
  }
}

