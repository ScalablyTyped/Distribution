package typings.betterSqlite3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregateOptions extends RegistrationOptions {
  var inverse: js.UndefOr[js.Function2[/* total */ js.Any, /* dropped */ js.Any, _]] = js.native
  var result: js.UndefOr[js.Function1[/* total */ js.Any, _]] = js.native
  var start: js.UndefOr[js.Any] = js.native
  def step(total: js.Any, next: js.Any): js.Any = js.native
}

object AggregateOptions {
  @scala.inline
  def apply(step: (js.Any, js.Any) => js.Any): AggregateOptions = {
    val __obj = js.Dynamic.literal(step = js.Any.fromFunction2(step))
    __obj.asInstanceOf[AggregateOptions]
  }
  @scala.inline
  implicit class AggregateOptionsOps[Self <: AggregateOptions] (val x: Self) extends AnyVal {
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
    def setStep(value: (js.Any, js.Any) => js.Any): Self = this.set("step", js.Any.fromFunction2(value))
    @scala.inline
    def setInverse(value: (/* total */ js.Any, /* dropped */ js.Any) => _): Self = this.set("inverse", js.Any.fromFunction2(value))
    @scala.inline
    def deleteInverse: Self = this.set("inverse", js.undefined)
    @scala.inline
    def setResult(value: /* total */ js.Any => _): Self = this.set("result", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    @scala.inline
    def setStart(value: js.Any): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

