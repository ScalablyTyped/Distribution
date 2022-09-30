package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.NP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `184` extends StObject {
  
  var c: js.Array[NP]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`345`
}
object `184` {
  
  inline def apply(c: js.Array[NP]): `184` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 345)
    __obj.asInstanceOf[`184`]
  }
  
  extension [Self <: `184`](x: Self) {
    
    inline def setC(value: js.Array[NP]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: NP*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`345`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
