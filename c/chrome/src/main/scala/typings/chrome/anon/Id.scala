package typings.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var id: String
  
  var minimum_version: js.UndefOr[String] = js.undefined
}
object Id {
  
  inline def apply(id: String): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMinimum_version(value: String): Self = StObject.set(x, "minimum_version", value.asInstanceOf[js.Any])
    
    inline def setMinimum_versionUndefined: Self = StObject.set(x, "minimum_version", js.undefined)
  }
}
