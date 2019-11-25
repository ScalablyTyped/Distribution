package typings.cwiseDashParser.cwiseDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompiledArgument extends js.Object {
  var count: Double
  var lvalue: Boolean
  var name: String
  var rvalue: Boolean
}

object CompiledArgument {
  @scala.inline
  def apply(count: Double, lvalue: Boolean, name: String, rvalue: Boolean): CompiledArgument = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], lvalue = lvalue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rvalue = rvalue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CompiledArgument]
  }
}

