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
    createTombstone: js.Function0[stdLib.Element],
    fetch: js.Function1[scala.Double, scala.Unit],
    render: js.Function2[js.Any, stdLib.Element, stdLib.Element]
  ): InfinityOption = {
    val __obj = js.Dynamic.literal(createTombstone = createTombstone, fetch = fetch, render = render)
  
    __obj.asInstanceOf[InfinityOption]
  }
}

