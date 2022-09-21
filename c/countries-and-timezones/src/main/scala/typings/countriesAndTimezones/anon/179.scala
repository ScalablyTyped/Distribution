package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`540`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `179` extends StObject {
  
  var c: js.Array[ID]
  
  var u: `540`
}
object `179` {
  
  inline def apply(c: js.Array[ID]): `179` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 540)
    __obj.asInstanceOf[`179`]
  }
  
  extension [Self <: `179`](x: Self) {
    
    inline def setC(value: js.Array[ID]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: ID*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `540`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
