package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`-120`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.BR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `106` extends StObject {
  
  var c: js.Array[BR]
  
  var u: `-120`
}
object `106` {
  
  inline def apply(c: js.Array[BR]): `106` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -120)
    __obj.asInstanceOf[`106`]
  }
  
  extension [Self <: `106`](x: Self) {
    
    inline def setC(value: js.Array[BR]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: BR*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `-120`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
