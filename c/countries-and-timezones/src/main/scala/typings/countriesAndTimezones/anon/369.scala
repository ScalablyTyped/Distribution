package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashMexico_City
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `369` extends StObject {
  
  var a: AmericaSlashMexico_City
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`
}
object `369` {
  
  inline def apply(): `369` = {
    val __obj = js.Dynamic.literal(a = "America/Mexico_City", r = 1)
    __obj.asInstanceOf[`369`]
  }
  
  extension [Self <: `369`](x: Self) {
    
    inline def setA(value: AmericaSlashMexico_City): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
