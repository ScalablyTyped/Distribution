package typings.betterScroll.anon

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<better-scroll.better-scroll.InfinityOption> */
@js.native
trait PartialInfinityOption extends js.Object {
  var createTombstone: js.UndefOr[js.Function0[Element]] = js.native
  var fetch: js.UndefOr[js.Function1[/* count */ Double, Unit]] = js.native
  var render: js.UndefOr[js.Function2[/* item */ js.Any, /* div */ Element, Element]] = js.native
}

object PartialInfinityOption {
  @scala.inline
  def apply(): PartialInfinityOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialInfinityOption]
  }
  @scala.inline
  implicit class PartialInfinityOptionOps[Self <: PartialInfinityOption] (val x: Self) extends AnyVal {
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
    def setCreateTombstone(value: () => Element): Self = this.set("createTombstone", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCreateTombstone: Self = this.set("createTombstone", js.undefined)
    @scala.inline
    def setFetch(value: /* count */ Double => Unit): Self = this.set("fetch", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFetch: Self = this.set("fetch", js.undefined)
    @scala.inline
    def setRender(value: (/* item */ js.Any, /* div */ Element) => Element): Self = this.set("render", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
  }
  
}

