package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.LU
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `321` extends StObject {
  
  var c: js.Array[LU]
  
  var d: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`120`
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`60`
}
object `321` {
  
  inline def apply(c: js.Array[LU]): `321` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 120, u = 60)
    __obj.asInstanceOf[`321`]
  }
  
  extension [Self <: `321`](x: Self) {
    
    inline def setC(value: js.Array[LU]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: LU*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`120`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`60`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
