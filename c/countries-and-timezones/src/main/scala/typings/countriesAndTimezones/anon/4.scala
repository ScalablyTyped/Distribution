package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.EG
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  var c: js.Array[EG]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`120`
}
object `4` {
  
  inline def apply(c: js.Array[EG]): `4` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 120)
    __obj.asInstanceOf[`4`]
  }
  
  extension [Self <: `4`](x: Self) {
    
    inline def setC(value: js.Array[EG]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: EG*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`120`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
