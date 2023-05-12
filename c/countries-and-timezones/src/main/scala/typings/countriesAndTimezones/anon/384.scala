package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`780`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.TK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `384` extends StObject {
  
  var c: js.Array[TK]
  
  var u: `780`
}
object `384` {
  
  inline def apply(c: js.Array[TK]): `384` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 780)
    __obj.asInstanceOf[`384`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `384`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[TK]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: TK*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `780`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
