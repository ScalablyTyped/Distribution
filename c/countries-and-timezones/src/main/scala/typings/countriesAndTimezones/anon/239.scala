package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`630`
import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`660`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.AU
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `239` extends StObject {
  
  var c: js.Array[AU]
  
  var d: `660`
  
  var u: `630`
}
object `239` {
  
  inline def apply(c: js.Array[AU]): `239` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 660, u = 630)
    __obj.asInstanceOf[`239`]
  }
  
  extension [Self <: `239`](x: Self) {
    
    inline def setC(value: js.Array[AU]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: AU*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: `660`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: `630`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
