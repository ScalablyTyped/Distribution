package typings.betterScroll.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InfinityOption extends js.Object {
  def createTombstone(): Element = js.native
  def fetch(count: Double): Unit = js.native
  def render(item: js.Any, div: Element): Element = js.native
}

object InfinityOption {
  @scala.inline
  def apply(createTombstone: () => Element, fetch: Double => Unit, render: (js.Any, Element) => Element): InfinityOption = {
    val __obj = js.Dynamic.literal(createTombstone = js.Any.fromFunction0(createTombstone), fetch = js.Any.fromFunction1(fetch), render = js.Any.fromFunction2(render))
    __obj.asInstanceOf[InfinityOption]
  }
  @scala.inline
  implicit class InfinityOptionOps[Self <: InfinityOption] (val x: Self) extends AnyVal {
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
    def setFetch(value: Double => Unit): Self = this.set("fetch", js.Any.fromFunction1(value))
    @scala.inline
    def setRender(value: (js.Any, Element) => Element): Self = this.set("render", js.Any.fromFunction2(value))
  }
  
}

