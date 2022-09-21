package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashMoscow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `426` extends StObject {
  
  var a: EuropeSlashMoscow
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`
}
object `426` {
  
  inline def apply(): `426` = {
    val __obj = js.Dynamic.literal(a = "Europe/Moscow", r = 1)
    __obj.asInstanceOf[`426`]
  }
  
  extension [Self <: `426`](x: Self) {
    
    inline def setA(value: EuropeSlashMoscow): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
