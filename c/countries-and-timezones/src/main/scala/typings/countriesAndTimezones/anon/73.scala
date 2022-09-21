package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`-300`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.BR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `73` extends StObject {
  
  var c: js.Array[BR]
  
  var u: `-300`
}
object `73` {
  
  inline def apply(c: js.Array[BR]): `73` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -300)
    __obj.asInstanceOf[`73`]
  }
  
  extension [Self <: `73`](x: Self) {
    
    inline def setC(value: js.Array[BR]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: BR*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `-300`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
