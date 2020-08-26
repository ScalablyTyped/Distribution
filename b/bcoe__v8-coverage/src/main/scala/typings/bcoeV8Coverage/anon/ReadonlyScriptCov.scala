package typings.bcoeV8Coverage.anon

import typings.bcoeV8Coverage.typesMod.FunctionCov
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@bcoe/v8-coverage.@bcoe/v8-coverage/dist/lib/types.ScriptCov> */
@js.native
trait ReadonlyScriptCov extends js.Object {
  val functions: js.Array[FunctionCov] = js.native
  val scriptId: String = js.native
  val url: String = js.native
}

object ReadonlyScriptCov {
  @scala.inline
  def apply(functions: js.Array[FunctionCov], scriptId: String, url: String): ReadonlyScriptCov = {
    val __obj = js.Dynamic.literal(functions = functions.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyScriptCov]
  }
  @scala.inline
  implicit class ReadonlyScriptCovOps[Self <: ReadonlyScriptCov] (val x: Self) extends AnyVal {
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
    def setFunctionsVarargs(value: FunctionCov*): Self = this.set("functions", js.Array(value :_*))
    @scala.inline
    def setFunctions(value: js.Array[FunctionCov]): Self = this.set("functions", value.asInstanceOf[js.Any])
    @scala.inline
    def setScriptId(value: String): Self = this.set("scriptId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

