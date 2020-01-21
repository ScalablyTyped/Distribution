package typings.betterScroll.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfinityOption extends js.Object {
  def createTombstone(): Element
  def fetch(count: Double): Unit
  def render(item: js.Any, div: Element): Element
}

object InfinityOption {
  @scala.inline
  def apply(createTombstone: () => Element, fetch: Double => Unit, render: (js.Any, Element) => Element): InfinityOption = {
    val __obj = js.Dynamic.literal(createTombstone = js.Any.fromFunction0(createTombstone), fetch = js.Any.fromFunction1(fetch), render = js.Any.fromFunction2(render))
  
    __obj.asInstanceOf[InfinityOption]
  }
}

