package typings
package cwiseDashParserLib.cwiseDashParserMod.cwiseUnderscoreParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompiledRoutine extends js.Object {
  var args: js.Array[CompiledArgument]
  var body: java.lang.String
  var localVars: js.Array[java.lang.String]
  var thisVars: js.Array[java.lang.String]
}

object CompiledRoutine {
  @scala.inline
  def apply(
    args: js.Array[CompiledArgument],
    body: java.lang.String,
    localVars: js.Array[java.lang.String],
    thisVars: js.Array[java.lang.String]
  ): CompiledRoutine = {
    val __obj = js.Dynamic.literal(args = args, body = body, localVars = localVars, thisVars = thisVars)
  
    __obj.asInstanceOf[CompiledRoutine]
  }
}

