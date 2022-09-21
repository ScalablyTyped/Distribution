package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`-540`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.PF
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `385` extends StObject {
  
  var c: js.Array[PF]
  
  var u: `-540`
}
object `385` {
  
  inline def apply(c: js.Array[PF]): `385` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -540)
    __obj.asInstanceOf[`385`]
  }
  
  extension [Self <: `385`](x: Self) {
    
    inline def setC(value: js.Array[PF]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: PF*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `-540`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
