package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashMacau
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `193` extends StObject {
  
  var a: AsiaSlashMacau
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `193` {
  
  inline def apply(): `193` = {
    val __obj = js.Dynamic.literal(a = "Asia/Macau", r = 1)
    __obj.asInstanceOf[`193`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `193`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AsiaSlashMacau): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
