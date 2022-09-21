package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`540`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.TL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `168` extends StObject {
  
  var c: js.Array[TL]
  
  var u: `540`
}
object `168` {
  
  inline def apply(c: js.Array[TL]): `168` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 540)
    __obj.asInstanceOf[`168`]
  }
  
  extension [Self <: `168`](x: Self) {
    
    inline def setC(value: js.Array[TL]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: TL*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `540`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
