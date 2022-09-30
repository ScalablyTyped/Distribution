package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.IR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `208` extends StObject {
  
  var c: js.Array[IR]
  
  var d: typings.countriesAndTimezones.countriesAndTimezonesInts.`270`
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`210`
}
object `208` {
  
  inline def apply(c: js.Array[IR]): `208` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 270, u = 210)
    __obj.asInstanceOf[`208`]
  }
  
  extension [Self <: `208`](x: Self) {
    
    inline def setC(value: js.Array[IR]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: IR*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`270`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`210`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
