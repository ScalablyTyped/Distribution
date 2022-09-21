package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.MA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait D extends StObject {
  
  var c: js.Array[MA]
  
  var d: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`0`
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`60`
}
object D {
  
  inline def apply(c: js.Array[MA]): D = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 0, u = 60)
    __obj.asInstanceOf[D]
  }
  
  extension [Self <: D](x: Self) {
    
    inline def setC(value: js.Array[MA]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: MA*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`0`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`60`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
