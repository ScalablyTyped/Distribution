package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.TM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `153` extends StObject {
  
  var c: js.Array[TM]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`300`
}
object `153` {
  
  inline def apply(c: js.Array[TM]): `153` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 300)
    __obj.asInstanceOf[`153`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `153`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[TM]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: TM*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`300`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
