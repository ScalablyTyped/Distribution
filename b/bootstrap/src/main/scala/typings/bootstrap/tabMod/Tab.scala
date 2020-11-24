package typings.bootstrap.tabMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tab extends js.Object {
  
  /**
    * Destroys an element’s tab.
    */
  def dispose(): Unit = js.native
  
  /**
    * Selects the given list item and shows its associated pane. Any other
    * list item that was previously selected becomes unselected and its
    * associated pane is hidden. Returns to the caller before the tab pane
    * has actually been shown (for example, before the shown.bs.tab event
    * occurs).
    */
  def show(): Unit = js.native
}
@JSImport("bootstrap/js/dist/tab", "Tab")
@js.native
object Tab extends js.Object {
  
  @js.native
  sealed trait Events extends js.Object
  @js.native
  object Events extends js.Object {
    
    /**
      * This event fires after a new tab is shown (and thus the previous
      * active tab is hidden). Use event.target and event.relatedTarget to
      * target the previous active tab and the new active tab, respectively.
      */
    @js.native
    sealed trait hidden extends Events
    
    /**
      * This event fires when a new tab is to be shown (and thus the previous
      * active tab is to be hidden). Use event.target and event.relatedTarget
      * to target the current active tab and the new soon-to-be-active tab,
      * respectively.
      */
    @js.native
    sealed trait hide extends Events
    
    /**
      * This event fires on tab show, but before the new tab has been shown.
      * Use event.target and event.relatedTarget to target the active tab and
      * the previous active tab (if available) respectively.
      */
    @js.native
    sealed trait show extends Events
    
    /**
      * This event fires on tab show after a tab has been shown. Use
      * event.target and event.relatedTarget to target the active tab and the
      * previous active tab (if available) respectively.
      */
    @js.native
    sealed trait shown extends Events
  }
}
