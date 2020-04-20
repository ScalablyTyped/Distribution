package typings.cwiseParser.mod

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
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], localVars = localVars.asInstanceOf[js.Any], thisVars = thisVars.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompiledRoutine]
  }
}

