package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`720`
import typings.countriesAndTimezones.countriesAndTimezonesInts.`780`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.AQ
import typings.countriesAndTimezones.countriesAndTimezonesStrings.NZ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `377` extends StObject {
  
  var c: js.Tuple2[NZ, AQ]
  
  var d: `780`
  
  var u: `720`
}
object `377` {
  
  inline def apply(c: js.Tuple2[NZ, AQ]): `377` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 780, u = 720)
    __obj.asInstanceOf[`377`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `377`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Tuple2[NZ, AQ]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setD(value: `780`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: `720`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
