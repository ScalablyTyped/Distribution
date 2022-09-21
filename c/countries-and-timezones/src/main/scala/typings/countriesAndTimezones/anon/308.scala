package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.DK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `308` extends StObject {
  
  var c: js.Array[DK]
  
  var d: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`120`
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`60`
}
object `308` {
  
  inline def apply(c: js.Array[DK]): `308` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 120, u = 60)
    __obj.asInstanceOf[`308`]
  }
  
  extension [Self <: `308`](x: Self) {
    
    inline def setC(value: js.Array[DK]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: DK*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`120`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`60`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
