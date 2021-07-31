package typings.chrome.chrome.input.ime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssistiveWindowProperties extends StObject {
  
  var announceString: js.UndefOr[String] = js.undefined
  
  var `type`: AssistiveWindowType
  
  var visible: Boolean
}
object AssistiveWindowProperties {
  
  @scala.inline
  def apply(`type`: AssistiveWindowType, visible: Boolean): AssistiveWindowProperties = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssistiveWindowProperties]
  }
  
  @scala.inline
  implicit class AssistiveWindowPropertiesMutableBuilder[Self <: AssistiveWindowProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnounceString(value: String): Self = StObject.set(x, "announceString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnounceStringUndefined: Self = StObject.set(x, "announceString", js.undefined)
    
    @scala.inline
    def setType(value: AssistiveWindowType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
