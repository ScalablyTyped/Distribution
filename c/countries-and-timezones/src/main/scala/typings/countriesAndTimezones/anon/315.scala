package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AX
import typings.countriesAndTimezones.countriesAndTimezonesStrings.FI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `315` extends StObject {
  
  var c: js.Tuple2[FI, AX]
  
  var d: typings.countriesAndTimezones.countriesAndTimezonesInts.`180`
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`120`
}
object `315` {
  
  inline def apply(c: js.Tuple2[FI, AX]): `315` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 180, u = 120)
    __obj.asInstanceOf[`315`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `315`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Tuple2[FI, AX]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setD(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`180`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`120`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
