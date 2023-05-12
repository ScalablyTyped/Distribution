package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`-600`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.CK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `409` extends StObject {
  
  var c: js.Array[CK]
  
  var u: `-600`
}
object `409` {
  
  inline def apply(c: js.Array[CK]): `409` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -600)
    __obj.asInstanceOf[`409`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `409`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[CK]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: CK*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `-600`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
