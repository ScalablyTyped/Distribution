package typings.ddTrace.anon

import typings.ddTrace.mod.Span
import typings.ddTrace.mod.plugins.ExecutionArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Execute extends js.Object {
  var execute: js.UndefOr[
    js.Function3[
      /* span */ js.UndefOr[Span], 
      /* args */ js.UndefOr[ExecutionArgs], 
      /* res */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}

object Execute {
  @scala.inline
  def apply(): Execute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Execute]
  }
  @scala.inline
  implicit class ExecuteOps[Self <: Execute] (val x: Self) extends AnyVal {
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
    def setExecute(
      value: (/* span */ js.UndefOr[Span], /* args */ js.UndefOr[ExecutionArgs], /* res */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("execute", js.Any.fromFunction3(value))
    @scala.inline
    def deleteExecute: Self = this.set("execute", js.undefined)
  }
  
}

