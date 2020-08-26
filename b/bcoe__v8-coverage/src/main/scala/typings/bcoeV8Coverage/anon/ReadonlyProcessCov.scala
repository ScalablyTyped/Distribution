package typings.bcoeV8Coverage.anon

import typings.bcoeV8Coverage.typesMod.ScriptCov
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@bcoe/v8-coverage.@bcoe/v8-coverage/dist/lib/types.ProcessCov> */
@js.native
trait ReadonlyProcessCov extends js.Object {
  val result: js.Array[ScriptCov] = js.native
}

object ReadonlyProcessCov {
  @scala.inline
  def apply(result: js.Array[ScriptCov]): ReadonlyProcessCov = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyProcessCov]
  }
  @scala.inline
  implicit class ReadonlyProcessCovOps[Self <: ReadonlyProcessCov] (val x: Self) extends AnyVal {
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
    def setResultVarargs(value: ScriptCov*): Self = this.set("result", js.Array(value :_*))
    @scala.inline
    def setResult(value: js.Array[ScriptCov]): Self = this.set("result", value.asInstanceOf[js.Any])
  }
  
}

