package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`765`
import typings.countriesAndTimezones.countriesAndTimezonesInts.`825`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.NZ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `379` extends StObject {
  
  var c: js.Array[NZ]
  
  var d: `825`
  
  var u: `765`
}
object `379` {
  
  inline def apply(c: js.Array[NZ]): `379` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 825, u = 765)
    __obj.asInstanceOf[`379`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `379`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[NZ]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: NZ*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: `825`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: `765`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
