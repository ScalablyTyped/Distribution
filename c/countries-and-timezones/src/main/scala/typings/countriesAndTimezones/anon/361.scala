package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.RE
import typings.countriesAndTimezones.countriesAndTimezonesStrings.TF
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `361` extends StObject {
  
  var c: js.Tuple2[RE, TF]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`240`
}
object `361` {
  
  inline def apply(c: js.Tuple2[RE, TF]): `361` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 240)
    __obj.asInstanceOf[`361`]
  }
  
  extension [Self <: `361`](x: Self) {
    
    inline def setC(value: js.Tuple2[RE, TF]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`240`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
