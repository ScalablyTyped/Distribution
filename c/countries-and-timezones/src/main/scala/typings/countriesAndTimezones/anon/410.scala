package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`780`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.TO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `410` extends StObject {
  
  var c: js.Array[TO]
  
  var u: `780`
}
object `410` {
  
  inline def apply(c: js.Array[TO]): `410` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 780)
    __obj.asInstanceOf[`410`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `410`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[TO]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: TO*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `780`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
