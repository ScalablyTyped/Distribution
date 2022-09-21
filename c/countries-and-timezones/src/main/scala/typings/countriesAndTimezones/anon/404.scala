package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`600`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.AQ
import typings.countriesAndTimezones.countriesAndTimezonesStrings.PG
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `404` extends StObject {
  
  var c: js.Tuple2[PG, AQ]
  
  var u: `600`
}
object `404` {
  
  inline def apply(c: js.Tuple2[PG, AQ]): `404` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 600)
    __obj.asInstanceOf[`404`]
  }
  
  extension [Self <: `404`](x: Self) {
    
    inline def setC(value: js.Tuple2[PG, AQ]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setU(value: `600`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
