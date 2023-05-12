package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`-240`
import typings.countriesAndTimezones.countriesAndTimezonesInts.`-300`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.HT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `113` extends StObject {
  
  var c: js.Array[HT]
  
  var d: `-240`
  
  var u: `-300`
}
object `113` {
  
  inline def apply(c: js.Array[HT]): `113` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = -240, u = -300)
    __obj.asInstanceOf[`113`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `113`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[HT]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: HT*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: `-240`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: `-300`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
