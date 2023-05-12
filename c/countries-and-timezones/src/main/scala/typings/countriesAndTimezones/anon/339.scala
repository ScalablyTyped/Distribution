package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.RU
import typings.countriesAndTimezones.countriesAndTimezonesStrings.UA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `339` extends StObject {
  
  var c: js.Tuple2[RU, UA]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`180`
}
object `339` {
  
  inline def apply(c: js.Tuple2[RU, UA]): `339` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 180)
    __obj.asInstanceOf[`339`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `339`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Tuple2[RU, UA]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`180`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
