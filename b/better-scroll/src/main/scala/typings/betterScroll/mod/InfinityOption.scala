package typings.betterScroll.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfinityOption extends StObject {
  
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
  implicit class InfinityOptionMutableBuilder[Self <: InfinityOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTombstone(value: () => Element): Self = StObject.set(x, "createTombstone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFetch(value: Double => Unit): Self = StObject.set(x, "fetch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRender(value: (js.Any, Element) => Element): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
  }
}
