package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.BA
import typings.countriesAndTimezones.countriesAndTimezonesStrings.HR
import typings.countriesAndTimezones.countriesAndTimezonesStrings.ME
import typings.countriesAndTimezones.countriesAndTimezonesStrings.MK
import typings.countriesAndTimezones.countriesAndTimezonesStrings.RS
import typings.countriesAndTimezones.countriesAndTimezonesStrings.SI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `300` extends StObject {
  
  var c: js.Tuple6[RS, BA, HR, ME, MK, SI]
  
  var d: typings.countriesAndTimezones.countriesAndTimezonesInts.`120`
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`60`
}
object `300` {
  
  inline def apply(c: js.Tuple6[RS, BA, HR, ME, MK, SI]): `300` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 120, u = 60)
    __obj.asInstanceOf[`300`]
  }
  
  extension [Self <: `300`](x: Self) {
    
    inline def setC(value: js.Tuple6[RS, BA, HR, ME, MK, SI]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setD(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`120`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`60`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
