package typings.bootstrap.mod

import typings.bootstrap.tabMod.default
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bootstrap", "Tab")
@js.native
class Tab protected () extends default {
  def this(element: Element) = this()
}
/* static members */
@JSImport("bootstrap", "Tab")
@js.native
object Tab extends js.Object {
  
  /**
    * Static method which allows you to get the tab instance associated with a
    * DOM element
    */
  def getInstance(element: Element): typings.bootstrap.tabMod.Tab = js.native
  
  @js.native
  object Events extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.bootstrap.tabMod.Tab.Events with String] = js.native
    
    /* "hidden.bs.tab" */ val hidden: typings.bootstrap.tabMod.Tab.Events.hidden with String = js.native
    
    /* "hide.bs.tab" */ val hide: typings.bootstrap.tabMod.Tab.Events.hide with String = js.native
    
    /* "show.bs.tab" */ val show: typings.bootstrap.tabMod.Tab.Events.show with String = js.native
    
    /* "shown.bs.tab" */ val shown: typings.bootstrap.tabMod.Tab.Events.shown with String = js.native
  }
}
