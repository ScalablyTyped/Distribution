package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.IQ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `155` extends StObject {
  
  var c: js.Array[IQ]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`180`
}
object `155` {
  
  inline def apply(c: js.Array[IQ]): `155` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 180)
    __obj.asInstanceOf[`155`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `155`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[IQ]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: IQ*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`180`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
