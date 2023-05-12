package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`480`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.CN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `208` extends StObject {
  
  var c: js.Array[CN]
  
  var u: `480`
}
object `208` {
  
  inline def apply(c: js.Array[CN]): `208` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 480)
    __obj.asInstanceOf[`208`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `208`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[CN]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: CN*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `480`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
