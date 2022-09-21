package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.core.UserDefinedElement
import typings.devextremeB5DqTZzf.mod.DevExpress.core.utils.DxPromise
import typings.devextremeB5DqTZzf.mod.DevExpress.events.Cancelable
import typings.devextremeB5DqTZzf.mod.DevExpress.events.ChangedOptionInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.EventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.InitializedEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxPopup.TitleRenderedInfo
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxPopover[TProperties]
  extends StObject
     with dxOverlay[TProperties] {
  
  /**
    * Shows the UI component for a target element.
    */
  def show(target: String): DxPromise[Boolean] = js.native
  def show(target: UserDefinedElement[Element]): DxPromise[Boolean] = js.native
}
object dxPopover {
  
  type ContentReadyEvent = EventInfo[dxPopover[Properties]]
  
  type DisposingEvent = EventInfo[dxPopover[Properties]]
  
  type HiddenEvent = EventInfo[dxPopover[Properties]]
  
  trait HidingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxPopover[Properties]]
  object HidingEvent {
    
    inline def apply(component: dxPopover[Properties], element: DxElement_[HTMLElement]): HidingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[HidingEvent]
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxPopover[Properties]]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxPopover[Properties]]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxPopover[Properties], element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please describe your scenario in the following GitHub Issue, and we will suggest a public alternative: {@link https://github.com/DevExpress/DevExtreme/issues/17885|Internal Types}.
    */
  type PopoverInstance = dxPopover[Properties]
  
  trait Properties
    extends StObject
       with dxPopoverOptions[PopoverInstance]
  object Properties {
    
    inline def apply(): Properties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Properties]
    }
  }
  
  trait ShowingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxPopover[Properties]]
  object ShowingEvent {
    
    inline def apply(component: dxPopover[Properties], element: DxElement_[HTMLElement]): ShowingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShowingEvent]
    }
  }
  
  trait ShownEvent
    extends StObject
       with EventInfo[dxPopover[Properties]]
  object ShownEvent {
    
    inline def apply(component: dxPopover[Properties], element: DxElement_[HTMLElement]): ShownEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShownEvent]
    }
  }
  
  trait TitleRenderedEvent
    extends StObject
       with EventInfo[dxPopover[Properties]]
       with TitleRenderedInfo
  object TitleRenderedEvent {
    
    inline def apply(
      component: dxPopover[Properties],
      element: DxElement_[HTMLElement],
      titleElement: DxElement_[HTMLElement]
    ): TitleRenderedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], titleElement = titleElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[TitleRenderedEvent]
    }
  }
}
