package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.core.utils.DxPromise
import typings.devextremeB5DqTZzf.mod.DevExpress.events.ChangedOptionInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.EventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.InitializedEventInfo
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDrawer
  extends StObject
     with Widget[dxDrawerOptions] {
  
  /**
    * Gets the drawer&apos;s content.
    */
  def content(): DxElement_[HTMLElement] = js.native
  
  /**
    * Closes the drawer.
    */
  def hide(): DxPromise[Unit] = js.native
  
  /**
    * Opens the drawer.
    */
  def show(): DxPromise[Unit] = js.native
  
  /**
    * Opens or closes the drawer, reversing the current state.
    */
  def toggle(): DxPromise[Unit] = js.native
}
object dxDrawer {
  
  type DisposingEvent = EventInfo[dxDrawer]
  
  type InitializedEvent = InitializedEventInfo[dxDrawer]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxDrawer]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxDrawer, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxDrawerOptions
}
