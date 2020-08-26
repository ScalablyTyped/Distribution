package typings.cwiseParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompiledRoutine extends js.Object {
  var args: js.Array[CompiledArgument] = js.native
  var body: String = js.native
  var localVars: js.Array[String] = js.native
  var thisVars: js.Array[String] = js.native
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
  @scala.inline
  implicit class CompiledRoutineOps[Self <: CompiledRoutine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArgsVarargs(value: CompiledArgument*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[CompiledArgument]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalVarsVarargs(value: String*): Self = this.set("localVars", js.Array(value :_*))
    @scala.inline
    def setLocalVars(value: js.Array[String]): Self = this.set("localVars", value.asInstanceOf[js.Any])
    @scala.inline
    def setThisVarsVarargs(value: String*): Self = this.set("thisVars", js.Array(value :_*))
    @scala.inline
    def setThisVars(value: js.Array[String]): Self = this.set("thisVars", value.asInstanceOf[js.Any])
  }
  
}

