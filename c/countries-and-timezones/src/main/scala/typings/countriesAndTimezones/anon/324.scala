package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.BY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `324` extends StObject {
  
  var c: js.Array[BY]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`180`
}
object `324` {
  
  inline def apply(c: js.Array[BY]): `324` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 180)
    __obj.asInstanceOf[`324`]
  }
  
  extension [Self <: `324`](x: Self) {
    
    inline def setC(value: js.Array[BY]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: BY*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`180`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
