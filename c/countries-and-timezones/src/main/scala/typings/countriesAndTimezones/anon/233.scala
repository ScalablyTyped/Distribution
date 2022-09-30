package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`570`
import typings.countriesAndTimezones.countriesAndTimezonesInts.`630`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.AU
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `233` extends StObject {
  
  var c: js.Array[AU]
  
  var d: `630`
  
  var u: `570`
}
object `233` {
  
  inline def apply(c: js.Array[AU]): `233` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 630, u = 570)
    __obj.asInstanceOf[`233`]
  }
  
  extension [Self <: `233`](x: Self) {
    
    inline def setC(value: js.Array[AU]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: AU*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: `630`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: `570`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
