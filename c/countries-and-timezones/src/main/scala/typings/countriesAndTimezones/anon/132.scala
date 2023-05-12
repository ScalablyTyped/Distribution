package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`-180`
import typings.countriesAndTimezones.countriesAndTimezonesInts.`-240`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.GL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `132` extends StObject {
  
  var c: js.Array[GL]
  
  var d: `-180`
  
  var u: `-240`
}
object `132` {
  
  inline def apply(c: js.Array[GL]): `132` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = -180, u = -240)
    __obj.asInstanceOf[`132`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `132`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[GL]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: GL*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: `-180`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: `-240`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
