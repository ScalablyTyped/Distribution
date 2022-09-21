package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`480`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.BN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `159` extends StObject {
  
  var c: js.Array[BN]
  
  var u: `480`
}
object `159` {
  
  inline def apply(c: js.Array[BN]): `159` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 480)
    __obj.asInstanceOf[`159`]
  }
  
  extension [Self <: `159`](x: Self) {
    
    inline def setC(value: js.Array[BN]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: BN*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `480`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
