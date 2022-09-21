package typings.betterScroll.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InfinityOption extends StObject {
  
  def createTombstone(): Element
  
  def fetch(count: Double): Unit
  
  def render(item: Any, div: Element): Element
}
object InfinityOption {
  
  inline def apply(createTombstone: () => Element, fetch: Double => Unit, render: (Any, Element) => Element): InfinityOption = {
    val __obj = js.Dynamic.literal(createTombstone = js.Any.fromFunction0(createTombstone), fetch = js.Any.fromFunction1(fetch), render = js.Any.fromFunction2(render))
    __obj.asInstanceOf[InfinityOption]
  }
  
  extension [Self <: InfinityOption](x: Self) {
    
    inline def setCreateTombstone(value: () => Element): Self = StObject.set(x, "createTombstone", js.Any.fromFunction0(value))
    
    inline def setFetch(value: Double => Unit): Self = StObject.set(x, "fetch", js.Any.fromFunction1(value))
    
    inline def setRender(value: (Any, Element) => Element): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
  }
}
