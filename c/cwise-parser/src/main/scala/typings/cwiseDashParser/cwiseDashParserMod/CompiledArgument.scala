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
    val __obj = js.Dynamic.literal(count = count, lvalue = lvalue, name = name, rvalue = rvalue)
  
    __obj.asInstanceOf[CompiledArgument]
  }
}

