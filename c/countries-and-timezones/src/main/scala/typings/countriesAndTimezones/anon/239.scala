package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashHobart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `239` extends StObject {
  
  var a: AustraliaSlashHobart
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `239` {
  
  inline def apply(): `239` = {
    val __obj = js.Dynamic.literal(a = "Australia/Hobart", r = 1)
    __obj.asInstanceOf[`239`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `239`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AustraliaSlashHobart): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
