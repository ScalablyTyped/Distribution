package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.KG
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `158` extends StObject {
  
  var c: js.Array[KG]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`360`
}
object `158` {
  
  inline def apply(c: js.Array[KG]): `158` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 360)
    __obj.asInstanceOf[`158`]
  }
  
  extension [Self <: `158`](x: Self) {
    
    inline def setC(value: js.Array[KG]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: KG*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`360`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
