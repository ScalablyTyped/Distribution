package typings
package betterDashScrollLib.betterDashScrollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfinityOption extends js.Object {
  def createTombstone(): stdLib.Element
  def fetch(count: scala.Double): scala.Unit
  def render(item: js.Any, div: stdLib.Element): stdLib.Element
}

object InfinityOption {
  @scala.inline
  def apply(
    createTombstone: () => stdLib.Element,
    fetch: scala.Double => scala.Unit,
    render: (js.Any, stdLib.Element) => stdLib.Element
  ): InfinityOption = {
    val __obj = js.Dynamic.literal(createTombstone = js.Any.fromFunction0(createTombstone), fetch = js.Any.fromFunction1(fetch), render = js.Any.fromFunction2(render))
  
    __obj.asInstanceOf[InfinityOption]
  }
}

