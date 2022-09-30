package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AF
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `181` extends StObject {
  
  var c: js.Array[AF]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`270`
}
object `181` {
  
  inline def apply(c: js.Array[AF]): `181` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 270)
    __obj.asInstanceOf[`181`]
  }
  
  extension [Self <: `181`](x: Self) {
    
    inline def setC(value: js.Array[AF]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: AF*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`270`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
