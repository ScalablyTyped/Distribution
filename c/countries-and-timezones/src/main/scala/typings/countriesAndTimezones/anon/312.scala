package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.IE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `312` extends StObject {
  
  var c: js.Array[IE]
  
  var d: typings.countriesAndTimezones.countriesAndTimezonesInts.`0`
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`60`
}
object `312` {
  
  inline def apply(c: js.Array[IE]): `312` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 0, u = 60)
    __obj.asInstanceOf[`312`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `312`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[IE]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: IE*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`0`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`60`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
