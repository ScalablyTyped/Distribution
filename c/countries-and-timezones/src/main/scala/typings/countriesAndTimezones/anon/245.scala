package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashPerth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `245` extends StObject {
  
  var a: AustraliaSlashPerth
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`
}
object `245` {
  
  inline def apply(): `245` = {
    val __obj = js.Dynamic.literal(a = "Australia/Perth", r = 1)
    __obj.asInstanceOf[`245`]
  }
  
  extension [Self <: `245`](x: Self) {
    
    inline def setA(value: AustraliaSlashPerth): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
