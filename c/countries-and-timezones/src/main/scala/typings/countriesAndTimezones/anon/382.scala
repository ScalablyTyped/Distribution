package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`720`
import typings.countriesAndTimezones.countriesAndTimezonesInts.`780`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.FJ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `382` extends StObject {
  
  var c: js.Array[FJ]
  
  var d: `780`
  
  var u: `720`
}
object `382` {
  
  inline def apply(c: js.Array[FJ]): `382` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 780, u = 720)
    __obj.asInstanceOf[`382`]
  }
  
  extension [Self <: `382`](x: Self) {
    
    inline def setC(value: js.Array[FJ]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: FJ*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: `780`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: `720`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
