package typings.cwiseDashParser.cwiseDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompiledRoutine extends js.Object {
  var args: js.Array[CompiledArgument]
  var body: String
  var localVars: js.Array[String]
  var thisVars: js.Array[String]
}

object CompiledRoutine {
  @scala.inline
  def apply(
    args: js.Array[CompiledArgument],
    body: String,
    localVars: js.Array[String],
    thisVars: js.Array[String]
  ): CompiledRoutine = {
    val __obj = js.Dynamic.literal(args = args, body = body, localVars = localVars, thisVars = thisVars)
  
    __obj.asInstanceOf[CompiledRoutine]
  }
}

