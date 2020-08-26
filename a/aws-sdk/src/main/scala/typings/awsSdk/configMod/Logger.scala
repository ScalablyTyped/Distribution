package typings.awsSdk.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Logger extends js.Object {
  var log: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var write: js.UndefOr[
    js.Function3[
      /* chunk */ js.Any, 
      /* encoding */ js.UndefOr[String], 
      /* callback */ js.UndefOr[js.Function0[Unit]], 
      Unit
    ]
  ] = js.native
}

object Logger {
  @scala.inline
  def apply(): Logger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Logger]
  }
  @scala.inline
  implicit class LoggerOps[Self <: Logger] (val x: Self) extends AnyVal {
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
    def setLog(value: /* repeated */ js.Any => Unit): Self = this.set("log", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    @scala.inline
    def setWrite(
      value: (/* chunk */ js.Any, /* encoding */ js.UndefOr[String], /* callback */ js.UndefOr[js.Function0[Unit]]) => Unit
    ): Self = this.set("write", js.Any.fromFunction3(value))
    @scala.inline
    def deleteWrite: Self = this.set("write", js.undefined)
  }
  
}

