package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`765`
import typings.countriesAndTimezones.countriesAndTimezonesInts.`825`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.NZ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `376` extends StObject {
  
  var c: js.Array[NZ]
  
  var d: `825`
  
  var u: `765`
}
object `376` {
  
  inline def apply(c: js.Array[NZ]): `376` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 825, u = 765)
    __obj.asInstanceOf[`376`]
  }
  
  extension [Self <: `376`](x: Self) {
    
    inline def setC(value: js.Array[NZ]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: NZ*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: `825`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: `765`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
