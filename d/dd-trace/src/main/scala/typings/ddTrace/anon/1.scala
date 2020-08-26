package typings.ddTrace.anon

import typings.ddTrace.mod.anyObject
import typings.opentracing.mod.Span
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `1` extends js.Object {
  /**
    * Hook to execute just before the aws span finishes.
    */
  var request: js.UndefOr[
    js.Function2[/* span */ js.UndefOr[Span], /* response */ js.UndefOr[anyObject], _]
  ] = js.native
}

object `1` {
  @scala.inline
  def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`]
  }
  @scala.inline
  implicit class `1Ops`[Self <: `1`] (val x: Self) extends AnyVal {
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
    def setRequest(value: (/* span */ js.UndefOr[Span], /* response */ js.UndefOr[anyObject]) => _): Self = this.set("request", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
  }
  
}

