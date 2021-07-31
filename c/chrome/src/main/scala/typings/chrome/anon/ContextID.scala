package typings.chrome.anon

import typings.chrome.chrome.input.ime.AssistiveWindowProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextID extends StObject {
  
  var contextID: Double
  
  var properties: AssistiveWindowProperties
}
object ContextID {
  
  @scala.inline
  def apply(contextID: Double, properties: AssistiveWindowProperties): ContextID = {
    val __obj = js.Dynamic.literal(contextID = contextID.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextID]
  }
  
  @scala.inline
  implicit class ContextIDMutableBuilder[Self <: ContextID] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContextID(value: Double): Self = StObject.set(x, "contextID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: AssistiveWindowProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
