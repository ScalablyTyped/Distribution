package typings
package cwiseDashParserLib.cwiseDashParserMod.cwiseUnderscoreParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompiledArgument extends js.Object {
  var count: scala.Double
  var lvalue: scala.Boolean
  var name: java.lang.String
  var rvalue: scala.Boolean
}

object CompiledArgument {
  @scala.inline
  def apply(count: scala.Double, lvalue: scala.Boolean, name: java.lang.String, rvalue: scala.Boolean): CompiledArgument = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("lvalue")(lvalue)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("rvalue")(rvalue)
    __obj.asInstanceOf[CompiledArgument]
  }
}

