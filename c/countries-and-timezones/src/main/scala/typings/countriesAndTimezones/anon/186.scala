package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.IN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `186` extends StObject {
  
  var c: js.Array[IN]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`330`
}
object `186` {
  
  inline def apply(c: js.Array[IN]): `186` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 330)
    __obj.asInstanceOf[`186`]
  }
  
  extension [Self <: `186`](x: Self) {
    
    inline def setC(value: js.Array[IN]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: IN*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`330`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
