package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.KZ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `152` extends StObject {
  
  var c: js.Array[KZ]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`300`
}
object `152` {
  
  inline def apply(c: js.Array[KZ]): `152` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 300)
    __obj.asInstanceOf[`152`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `152`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[KZ]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: KZ*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`300`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
