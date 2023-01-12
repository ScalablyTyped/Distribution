package typings.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Managedschema extends StObject {
  
  var managed_schema: String
}
object Managedschema {
  
  inline def apply(managed_schema: String): Managedschema = {
    val __obj = js.Dynamic.literal(managed_schema = managed_schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Managedschema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Managedschema] (val x: Self) extends AnyVal {
    
    inline def setManaged_schema(value: String): Self = StObject.set(x, "managed_schema", value.asInstanceOf[js.Any])
  }
}
