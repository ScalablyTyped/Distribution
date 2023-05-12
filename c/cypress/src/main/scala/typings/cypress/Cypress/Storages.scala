package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Storages extends StObject {
  
  var localStorage: js.Array[OriginStorage]
  
  var sessionStorage: js.Array[OriginStorage]
}
object Storages {
  
  inline def apply(localStorage: js.Array[OriginStorage], sessionStorage: js.Array[OriginStorage]): Storages = {
    val __obj = js.Dynamic.literal(localStorage = localStorage.asInstanceOf[js.Any], sessionStorage = sessionStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Storages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Storages] (val x: Self) extends AnyVal {
    
    inline def setLocalStorage(value: js.Array[OriginStorage]): Self = StObject.set(x, "localStorage", value.asInstanceOf[js.Any])
    
    inline def setLocalStorageVarargs(value: OriginStorage*): Self = StObject.set(x, "localStorage", js.Array(value*))
    
    inline def setSessionStorage(value: js.Array[OriginStorage]): Self = StObject.set(x, "sessionStorage", value.asInstanceOf[js.Any])
    
    inline def setSessionStorageVarargs(value: OriginStorage*): Self = StObject.set(x, "sessionStorage", js.Array(value*))
  }
}
