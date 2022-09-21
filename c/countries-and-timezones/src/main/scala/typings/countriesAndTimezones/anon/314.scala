package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.TR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `314` extends StObject {
  
  var c: js.Array[TR]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`180`
}
object `314` {
  
  inline def apply(c: js.Array[TR]): `314` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 180)
    __obj.asInstanceOf[`314`]
  }
  
  extension [Self <: `314`](x: Self) {
    
    inline def setC(value: js.Array[TR]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: TR*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`180`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
