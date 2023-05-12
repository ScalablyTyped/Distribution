package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AQ
import typings.countriesAndTimezones.countriesAndTimezonesStrings.CN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `219` extends StObject {
  
  var c: js.Tuple2[CN, AQ]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`360`
}
object `219` {
  
  inline def apply(c: js.Tuple2[CN, AQ]): `219` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 360)
    __obj.asInstanceOf[`219`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `219`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Tuple2[CN, AQ]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`360`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
