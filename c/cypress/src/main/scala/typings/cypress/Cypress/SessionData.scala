package typings.cypress.Cypress

import typings.cypress.cypressBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionData extends StObject {
  
  var cacheAcrossSpecs: js.UndefOr[Boolean] = js.undefined
  
  var cookies: js.UndefOr[js.Array[Cookie] | Null] = js.undefined
  
  var hydrated: Boolean
  
  var id: String
  
  var localStorage: js.UndefOr[js.Array[OriginStorage] | Null] = js.undefined
  
  var sessionStorage: js.UndefOr[js.Array[OriginStorage] | Null] = js.undefined
  
  def setup(): Unit
  
  var validate: js.UndefOr[js.Function0[(js.Promise[`false` | Unit]) | Unit]] = js.undefined
}
object SessionData {
  
  inline def apply(hydrated: Boolean, id: String, setup: () => Unit): SessionData = {
    val __obj = js.Dynamic.literal(hydrated = hydrated.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], setup = js.Any.fromFunction0(setup))
    __obj.asInstanceOf[SessionData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SessionData] (val x: Self) extends AnyVal {
    
    inline def setCacheAcrossSpecs(value: Boolean): Self = StObject.set(x, "cacheAcrossSpecs", value.asInstanceOf[js.Any])
    
    inline def setCacheAcrossSpecsUndefined: Self = StObject.set(x, "cacheAcrossSpecs", js.undefined)
    
    inline def setCookies(value: js.Array[Cookie]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    inline def setCookiesNull: Self = StObject.set(x, "cookies", null)
    
    inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
    
    inline def setCookiesVarargs(value: Cookie*): Self = StObject.set(x, "cookies", js.Array(value*))
    
    inline def setHydrated(value: Boolean): Self = StObject.set(x, "hydrated", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLocalStorage(value: js.Array[OriginStorage]): Self = StObject.set(x, "localStorage", value.asInstanceOf[js.Any])
    
    inline def setLocalStorageNull: Self = StObject.set(x, "localStorage", null)
    
    inline def setLocalStorageUndefined: Self = StObject.set(x, "localStorage", js.undefined)
    
    inline def setLocalStorageVarargs(value: OriginStorage*): Self = StObject.set(x, "localStorage", js.Array(value*))
    
    inline def setSessionStorage(value: js.Array[OriginStorage]): Self = StObject.set(x, "sessionStorage", value.asInstanceOf[js.Any])
    
    inline def setSessionStorageNull: Self = StObject.set(x, "sessionStorage", null)
    
    inline def setSessionStorageUndefined: Self = StObject.set(x, "sessionStorage", js.undefined)
    
    inline def setSessionStorageVarargs(value: OriginStorage*): Self = StObject.set(x, "sessionStorage", js.Array(value*))
    
    inline def setSetup(value: () => Unit): Self = StObject.set(x, "setup", js.Any.fromFunction0(value))
    
    inline def setValidate(value: () => (js.Promise[`false` | Unit]) | Unit): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
