package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`570`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.AU
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `236` extends StObject {
  
  var c: js.Array[AU]
  
  var u: `570`
}
object `236` {
  
  inline def apply(c: js.Array[AU]): `236` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 570)
    __obj.asInstanceOf[`236`]
  }
  
  extension [Self <: `236`](x: Self) {
    
    inline def setC(value: js.Array[AU]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: AU*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `570`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
