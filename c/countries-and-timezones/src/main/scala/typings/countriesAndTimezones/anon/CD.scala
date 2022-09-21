package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.ES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CD extends StObject {
  
  var c: js.Array[ES]
  
  var d: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`120`
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`60`
}
object CD {
  
  inline def apply(c: js.Array[ES]): CD = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 120, u = 60)
    __obj.asInstanceOf[CD]
  }
  
  extension [Self <: CD](x: Self) {
    
    inline def setC(value: js.Array[ES]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: ES*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`120`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`60`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
