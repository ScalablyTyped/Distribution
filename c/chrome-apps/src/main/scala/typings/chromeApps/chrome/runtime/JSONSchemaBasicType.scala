package typings.chromeApps.chrome.runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSONSchemaBasicType extends StObject {
  
  var `type`: JSONBasicTypes
}
object JSONSchemaBasicType {
  
  inline def apply(`type`: JSONBasicTypes): JSONSchemaBasicType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONSchemaBasicType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JSONSchemaBasicType] (val x: Self) extends AnyVal {
    
    inline def setType(value: JSONBasicTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
