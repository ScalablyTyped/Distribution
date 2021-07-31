package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionDescriptor extends StObject {
  
  /**
    * Name of the clickable action. If not defined then no action will be shown
    */
  var actionTitle: js.UndefOr[String] = js.undefined
  
  /**
    * Data sent on callback being run.
    */
  var callbackData: js.UndefOr[js.Any] = js.undefined
  
  /**
    * User-visible label to display
    */
  var label: String
}
object ActionDescriptor {
  
  @scala.inline
  def apply(label: String): ActionDescriptor = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionDescriptor]
  }
  
  @scala.inline
  implicit class ActionDescriptorMutableBuilder[Self <: ActionDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionTitle(value: String): Self = StObject.set(x, "actionTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionTitleUndefined: Self = StObject.set(x, "actionTitle", js.undefined)
    
    @scala.inline
    def setCallbackData(value: js.Any): Self = StObject.set(x, "callbackData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackDataUndefined: Self = StObject.set(x, "callbackData", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
