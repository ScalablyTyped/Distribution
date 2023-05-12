package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashBroken_Hill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `250` extends StObject {
  
  var a: AustraliaSlashBroken_Hill
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `250` {
  
  inline def apply(): `250` = {
    val __obj = js.Dynamic.literal(a = "Australia/Broken_Hill", r = 1)
    __obj.asInstanceOf[`250`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `250`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AustraliaSlashBroken_Hill): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
