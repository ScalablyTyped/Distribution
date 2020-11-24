package typings.bootstrap.popoverMod

import typings.bootstrap.anon.PartialOptionsAnimation
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bootstrap/js/dist/popover", JSImport.Default)
@js.native
class default protected () extends Popover {
  def this(element: Element) = this()
  def this(element: Element, options: PartialOptionsAnimation) = this()
}
/* static members */
@JSImport("bootstrap/js/dist/popover", JSImport.Default)
@js.native
object default extends js.Object {
  
  /**
    * Static method which allows you to get the popover instance associated
    * with a DOM element
    */
  def getInstance(element: Element): Popover = js.native
  def getInstance(element: Element, options: PartialOptionsAnimation): Popover = js.native
  
  @js.native
  object Events extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.bootstrap.popoverMod.Popover.Events with String] = js.native
    
    /* "hidden.bs.popover" */ val hidden: typings.bootstrap.popoverMod.Popover.Events.hidden with String = js.native
    
    /* "hide.bs.popover" */ val hide: typings.bootstrap.popoverMod.Popover.Events.hide with String = js.native
    
    /* "inserted.bs.popover" */ val inserted: typings.bootstrap.popoverMod.Popover.Events.inserted with String = js.native
    
    /* "show.bs.popover" */ val show: typings.bootstrap.popoverMod.Popover.Events.show with String = js.native
    
    /* "shown.bs.popover" */ val shown: typings.bootstrap.popoverMod.Popover.Events.shown with String = js.native
  }
}
