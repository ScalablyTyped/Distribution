package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.ST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `37` extends StObject {
  
  var c: js.Array[ST]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`0`
}
object `37` {
  
  inline def apply(c: js.Array[ST]): `37` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 0)
    __obj.asInstanceOf[`37`]
  }
  
  extension [Self <: `37`](x: Self) {
    
    inline def setC(value: js.Array[ST]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: ST*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`0`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
