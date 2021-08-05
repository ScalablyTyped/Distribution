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
  
  inline def apply(contextID: Double, properties: AssistiveWindowProperties): ContextID = {
    val __obj = js.Dynamic.literal(contextID = contextID.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextID]
  }
  
  extension [Self <: ContextID](x: Self) {
    
    inline def setContextID(value: Double): Self = StObject.set(x, "contextID", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: AssistiveWindowProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
