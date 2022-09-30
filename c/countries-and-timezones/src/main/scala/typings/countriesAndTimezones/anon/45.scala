package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`-180`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `45` extends StObject {
  
  var c: js.Array[typings.countriesAndTimezones.countriesAndTimezonesStrings.AR]
  
  var u: `-180`
}
object `45` {
  
  inline def apply(c: js.Array[typings.countriesAndTimezones.countriesAndTimezonesStrings.AR]): `45` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -180)
    __obj.asInstanceOf[`45`]
  }
  
  extension [Self <: `45`](x: Self) {
    
    inline def setC(value: js.Array[typings.countriesAndTimezones.countriesAndTimezonesStrings.AR]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: typings.countriesAndTimezones.countriesAndTimezonesStrings.AR*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `-180`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
