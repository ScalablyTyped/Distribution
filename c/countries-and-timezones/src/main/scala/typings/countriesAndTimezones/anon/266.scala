package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashDublin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `266` extends StObject {
  
  var a: EuropeSlashDublin
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`
}
object `266` {
  
  inline def apply(): `266` = {
    val __obj = js.Dynamic.literal(a = "Europe/Dublin", r = 1)
    __obj.asInstanceOf[`266`]
  }
  
  extension [Self <: `266`](x: Self) {
    
    inline def setA(value: EuropeSlashDublin): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
