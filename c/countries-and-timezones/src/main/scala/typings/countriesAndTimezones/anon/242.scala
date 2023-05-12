package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashLord_Howe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `242` extends StObject {
  
  var a: AustraliaSlashLord_Howe
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `242` {
  
  inline def apply(): `242` = {
    val __obj = js.Dynamic.literal(a = "Australia/Lord_Howe", r = 1)
    __obj.asInstanceOf[`242`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `242`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AustraliaSlashLord_Howe): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
