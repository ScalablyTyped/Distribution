package typings.baiduApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesAny extends StObject {
  
  var properties: js.Any
}
object PropertiesAny {
  
  @scala.inline
  def apply(properties: js.Any): PropertiesAny = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesAny]
  }
  
  @scala.inline
  implicit class PropertiesAnyMutableBuilder[Self <: PropertiesAny] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
