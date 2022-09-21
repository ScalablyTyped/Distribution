package typings.countriesAndTimezones.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `296` extends StObject {
  
  var c: js.Array[typings.countriesAndTimezones.countriesAndTimezonesStrings.AD]
  
  var d: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`120`
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`60`
}
object `296` {
  
  inline def apply(c: js.Array[typings.countriesAndTimezones.countriesAndTimezonesStrings.AD]): `296` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 120, u = 60)
    __obj.asInstanceOf[`296`]
  }
  
  extension [Self <: `296`](x: Self) {
    
    inline def setC(value: js.Array[typings.countriesAndTimezones.countriesAndTimezonesStrings.AD]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: typings.countriesAndTimezones.countriesAndTimezonesStrings.AD*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`120`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`60`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
