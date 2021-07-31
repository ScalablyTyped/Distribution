package typings.chromeApps.chrome.runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSONSchemaRefType extends StObject {
  
  @JSName("$ref")
  var $ref: String
}
object JSONSchemaRefType {
  
  @scala.inline
  def apply($ref: String): JSONSchemaRefType = {
    val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONSchemaRefType]
  }
  
  @scala.inline
  implicit class JSONSchemaRefTypeMutableBuilder[Self <: JSONSchemaRefType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
  }
}
