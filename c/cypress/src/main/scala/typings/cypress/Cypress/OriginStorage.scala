package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginStorage extends StObject {
  
  var origin: String
  
  var value: StorableRecord
}
object OriginStorage {
  
  inline def apply(origin: String, value: StorableRecord): OriginStorage = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginStorage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OriginStorage] (val x: Self) extends AnyVal {
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setValue(value: StorableRecord): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
