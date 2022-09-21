package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`840`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.KI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `391` extends StObject {
  
  var c: js.Array[KI]
  
  var u: `840`
}
object `391` {
  
  inline def apply(c: js.Array[KI]): `391` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 840)
    __obj.asInstanceOf[`391`]
  }
  
  extension [Self <: `391`](x: Self) {
    
    inline def setC(value: js.Array[KI]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: KI*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `840`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
