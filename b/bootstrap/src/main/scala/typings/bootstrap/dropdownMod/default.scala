package typings.bootstrap.dropdownMod

import typings.bootstrap.anon.PartialOptionsBoundary
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bootstrap/js/dist/dropdown", JSImport.Default)
@js.native
class default protected () extends Dropdown {
  def this(element: Element) = this()
  def this(element: Element, options: PartialOptionsBoundary) = this()
}
/* static members */
@JSImport("bootstrap/js/dist/dropdown", JSImport.Default)
@js.native
object default extends js.Object {
  
  /**
    * Static method which allows you to get the dropdown instance associated
    * with a DOM element.
    */
  def getInstance(element: Element): Dropdown = js.native
  def getInstance(element: Element, options: PartialOptionsBoundary): Dropdown = js.native
  
  @js.native
  object Events extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.bootstrap.dropdownMod.Dropdown.Events with String] = js.native
    
    /* "hidden.bs.dropdown" */ val hidden: typings.bootstrap.dropdownMod.Dropdown.Events.hidden with String = js.native
    
    /* "hide.bs.dropdown" */ val hide: typings.bootstrap.dropdownMod.Dropdown.Events.hide with String = js.native
    
    /* "show.bs.dropdown" */ val show: typings.bootstrap.dropdownMod.Dropdown.Events.show with String = js.native
    
    /* "shown.bs.dropdown" */ val shown: typings.bootstrap.dropdownMod.Dropdown.Events.shown with String = js.native
  }
}
