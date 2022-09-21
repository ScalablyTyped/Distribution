package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`-120`
import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`-180`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.GL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `107` extends StObject {
  
  var c: js.Array[GL]
  
  var d: `-120`
  
  var u: `-180`
}
object `107` {
  
  inline def apply(c: js.Array[GL]): `107` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = -120, u = -180)
    __obj.asInstanceOf[`107`]
  }
  
  extension [Self <: `107`](x: Self) {
    
    inline def setC(value: js.Array[GL]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: GL*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: `-120`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: `-180`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
