package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.FO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `230` extends StObject {
  
  var c: js.Array[FO]
  
  var d: typings.countriesAndTimezones.countriesAndTimezonesInts.`60`
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`0`
}
object `230` {
  
  inline def apply(c: js.Array[FO]): `230` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 60, u = 0)
    __obj.asInstanceOf[`230`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `230`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[FO]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: FO*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`60`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`0`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
