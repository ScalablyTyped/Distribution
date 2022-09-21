package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`-600`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.UM
import typings.countriesAndTimezones.countriesAndTimezonesStrings.US
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `388` extends StObject {
  
  var c: js.Tuple2[US, UM]
  
  var u: `-600`
}
object `388` {
  
  inline def apply(c: js.Tuple2[US, UM]): `388` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -600)
    __obj.asInstanceOf[`388`]
  }
  
  extension [Self <: `388`](x: Self) {
    
    inline def setC(value: js.Tuple2[US, UM]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setU(value: `-600`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
