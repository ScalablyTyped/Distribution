package typings.betterScroll.anon

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<better-scroll.better-scroll.InfinityOption> */
trait PartialInfinityOption extends js.Object {
  var createTombstone: js.UndefOr[js.Function0[Element]] = js.undefined
  var fetch: js.UndefOr[js.Function1[/* count */ Double, Unit]] = js.undefined
  var render: js.UndefOr[js.Function2[/* item */ js.Any, /* div */ Element, Element]] = js.undefined
}

object PartialInfinityOption {
  @scala.inline
  def apply(
    createTombstone: () => Element = null,
    fetch: /* count */ Double => Unit = null,
    render: (/* item */ js.Any, /* div */ Element) => Element = null
  ): PartialInfinityOption = {
    val __obj = js.Dynamic.literal()
    if (createTombstone != null) __obj.updateDynamic("createTombstone")(js.Any.fromFunction0(createTombstone))
    if (fetch != null) __obj.updateDynamic("fetch")(js.Any.fromFunction1(fetch))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction2(render))
    __obj.asInstanceOf[PartialInfinityOption]
  }
}

