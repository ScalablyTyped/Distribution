package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.BG
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `341` extends StObject {
  
  var c: js.Array[BG]
  
  var d: typings.countriesAndTimezones.countriesAndTimezonesInts.`180`
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`120`
}
object `341` {
  
  inline def apply(c: js.Array[BG]): `341` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 180, u = 120)
    __obj.asInstanceOf[`341`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `341`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[BG]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: BG*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`180`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`120`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
