package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashAdak
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `49` extends StObject {
  
  var a: AmericaSlashAdak
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`
}
object `49` {
  
  inline def apply(): `49` = {
    val __obj = js.Dynamic.literal(a = "America/Adak", r = 1)
    __obj.asInstanceOf[`49`]
  }
  
  extension [Self <: `49`](x: Self) {
    
    inline def setA(value: AmericaSlashAdak): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
