package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`-660`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.NU
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `397` extends StObject {
  
  var c: js.Array[NU]
  
  var u: `-660`
}
object `397` {
  
  inline def apply(c: js.Array[NU]): `397` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -660)
    __obj.asInstanceOf[`397`]
  }
  
  extension [Self <: `397`](x: Self) {
    
    inline def setC(value: js.Array[NU]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: NU*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `-660`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
