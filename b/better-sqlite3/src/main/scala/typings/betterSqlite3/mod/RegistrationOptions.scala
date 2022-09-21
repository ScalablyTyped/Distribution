package typings.betterSqlite3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegistrationOptions extends StObject {
  
  var deterministic: js.UndefOr[Boolean] = js.undefined
  
  var directOnly: js.UndefOr[Boolean] = js.undefined
  
  var safeIntegers: js.UndefOr[Boolean] = js.undefined
  
  var varargs: js.UndefOr[Boolean] = js.undefined
}
object RegistrationOptions {
  
  inline def apply(): RegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegistrationOptions]
  }
  
  extension [Self <: RegistrationOptions](x: Self) {
    
    inline def setDeterministic(value: Boolean): Self = StObject.set(x, "deterministic", value.asInstanceOf[js.Any])
    
    inline def setDeterministicUndefined: Self = StObject.set(x, "deterministic", js.undefined)
    
    inline def setDirectOnly(value: Boolean): Self = StObject.set(x, "directOnly", value.asInstanceOf[js.Any])
    
    inline def setDirectOnlyUndefined: Self = StObject.set(x, "directOnly", js.undefined)
    
    inline def setSafeIntegers(value: Boolean): Self = StObject.set(x, "safeIntegers", value.asInstanceOf[js.Any])
    
    inline def setSafeIntegersUndefined: Self = StObject.set(x, "safeIntegers", js.undefined)
    
    inline def setVarargs(value: Boolean): Self = StObject.set(x, "varargs", value.asInstanceOf[js.Any])
    
    inline def setVarargsUndefined: Self = StObject.set(x, "varargs", js.undefined)
  }
}
