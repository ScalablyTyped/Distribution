package typings.bootstrap.mod

import typings.bootstrap.anon.PartialOptionsMethod
import typings.bootstrap.scrollspyMod.default
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bootstrap", "ScrollSpy")
@js.native
class ScrollSpy protected () extends default {
  def this(element: Element) = this()
  def this(element: Element, options: PartialOptionsMethod) = this()
}
/* static members */
@JSImport("bootstrap", "ScrollSpy")
@js.native
object ScrollSpy extends js.Object {
  
  /**
    * Static method which allows you to get the scrollspy instance associated
    * with a DOM element
    */
  def getInstance(element: Element): typings.bootstrap.scrollspyMod.ScrollSpy = js.native
  def getInstance(element: Element, options: PartialOptionsMethod): typings.bootstrap.scrollspyMod.ScrollSpy = js.native
  
  @js.native
  object Events extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.bootstrap.scrollspyMod.ScrollSpy.Events with String] = js.native
    
    /* "activate.bs.scrollspy" */ val activate: typings.bootstrap.scrollspyMod.ScrollSpy.Events.activate with String = js.native
  }
}
