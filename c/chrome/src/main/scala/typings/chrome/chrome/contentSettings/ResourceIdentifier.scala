package typings.chrome.chrome.contentSettings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceIdentifier extends StObject {
  
  /** Optional. A human readable description of the resource.  */
  var description: js.UndefOr[String] = js.undefined
  
  /** The resource identifier for the given content type. */
  var id: String
}
object ResourceIdentifier {
  
  inline def apply(id: String): ResourceIdentifier = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceIdentifier] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
