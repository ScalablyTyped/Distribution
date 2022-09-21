package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`720`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.TV
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `383` extends StObject {
  
  var c: js.Array[TV]
  
  var u: `720`
}
object `383` {
  
  inline def apply(c: js.Array[TV]): `383` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 720)
    __obj.asInstanceOf[`383`]
  }
  
  extension [Self <: `383`](x: Self) {
    
    inline def setC(value: js.Array[TV]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: TV*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `720`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
