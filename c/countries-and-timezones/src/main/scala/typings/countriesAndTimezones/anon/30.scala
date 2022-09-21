package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.LR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `30` extends StObject {
  
  var c: js.Array[LR]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`0`
}
object `30` {
  
  inline def apply(c: js.Array[LR]): `30` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 0)
    __obj.asInstanceOf[`30`]
  }
  
  extension [Self <: `30`](x: Self) {
    
    inline def setC(value: js.Array[LR]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: LR*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`0`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
