package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`-240`
import typings.countriesAndTimezones.countriesAndTimezonesInts.`-300`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.BS
import typings.countriesAndTimezones.countriesAndTimezonesStrings.CA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `131` extends StObject {
  
  var c: js.Tuple2[CA, BS]
  
  var d: `-240`
  
  var u: `-300`
}
object `131` {
  
  inline def apply(c: js.Tuple2[CA, BS]): `131` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = -240, u = -300)
    __obj.asInstanceOf[`131`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `131`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Tuple2[CA, BS]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setD(value: `-240`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: `-300`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
