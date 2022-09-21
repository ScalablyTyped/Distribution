package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`-480`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.PN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `402` extends StObject {
  
  var c: js.Array[PN]
  
  var u: `-480`
}
object `402` {
  
  inline def apply(c: js.Array[PN]): `402` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -480)
    __obj.asInstanceOf[`402`]
  }
  
  extension [Self <: `402`](x: Self) {
    
    inline def setC(value: js.Array[PN]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: PN*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `-480`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
