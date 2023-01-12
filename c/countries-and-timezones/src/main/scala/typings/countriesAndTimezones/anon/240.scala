package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashDarwin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `240` extends StObject {
  
  var a: AustraliaSlashDarwin
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `240` {
  
  inline def apply(): `240` = {
    val __obj = js.Dynamic.literal(a = "Australia/Darwin", r = 1)
    __obj.asInstanceOf[`240`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `240`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AustraliaSlashDarwin): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
