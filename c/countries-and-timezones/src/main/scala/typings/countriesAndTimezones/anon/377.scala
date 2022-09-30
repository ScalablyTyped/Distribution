package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`600`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.FM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `377` extends StObject {
  
  var c: js.Array[FM]
  
  var u: `600`
}
object `377` {
  
  inline def apply(c: js.Array[FM]): `377` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 600)
    __obj.asInstanceOf[`377`]
  }
  
  extension [Self <: `377`](x: Self) {
    
    inline def setC(value: js.Array[FM]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: FM*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `600`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
