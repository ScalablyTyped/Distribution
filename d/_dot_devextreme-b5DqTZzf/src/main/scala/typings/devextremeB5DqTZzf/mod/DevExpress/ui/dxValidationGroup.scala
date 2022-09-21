package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.mod.DevExpress.DOMComponent
import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.events.ChangedOptionInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.EventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.InitializedEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxValidationGroup.ValidationResult
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxValidationGroup
  extends StObject
     with DOMComponent[dxValidationGroupOptions] {
  
  /**
    * Resets the value and validation result of the editors that are included to the current validation group.
    */
  def reset(): Unit = js.native
  
  /**
    * Validates rules of the validators that belong to the current validation group.
    */
  def validate(): ValidationResult = js.native
}
object dxValidationGroup {
  
  type DisposingEvent = EventInfo[dxValidationGroup]
  
  type InitializedEvent = InitializedEventInfo[dxValidationGroup]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxValidationGroup]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxValidationGroup, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxValidationGroupOptions
  
  type ValidationResult = dxValidationGroupResult
}
