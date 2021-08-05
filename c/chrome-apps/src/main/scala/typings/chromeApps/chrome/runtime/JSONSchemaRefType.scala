package typings.chromeApps.chrome.runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSONSchemaRefType extends StObject {
  
  @JSName("$ref")
  var $ref: String
}
object JSONSchemaRefType {
  
  inline def apply($ref: String): JSONSchemaRefType = {
    val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONSchemaRefType]
  }
  
  extension [Self <: JSONSchemaRefType](x: Self) {
    
    inline def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
  }
}
