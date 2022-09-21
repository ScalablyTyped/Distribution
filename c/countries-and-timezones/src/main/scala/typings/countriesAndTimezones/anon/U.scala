package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.DZ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait U extends StObject {
  
  var c: js.Array[DZ]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`60`
}
object U {
  
  inline def apply(c: js.Array[DZ]): U = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 60)
    __obj.asInstanceOf[U]
  }
  
  extension [Self <: U](x: Self) {
    
    inline def setC(value: js.Array[DZ]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: DZ*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`60`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
