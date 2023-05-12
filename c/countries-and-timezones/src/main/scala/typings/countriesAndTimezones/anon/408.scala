package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`600`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.AQ
import typings.countriesAndTimezones.countriesAndTimezonesStrings.FM
import typings.countriesAndTimezones.countriesAndTimezonesStrings.PG
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `408` extends StObject {
  
  var c: js.Tuple3[PG, AQ, FM]
  
  var u: `600`
}
object `408` {
  
  inline def apply(c: js.Tuple3[PG, AQ, FM]): `408` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 600)
    __obj.asInstanceOf[`408`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `408`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Tuple3[PG, AQ, FM]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setU(value: `600`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
