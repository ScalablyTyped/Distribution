package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashMakassar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `217` extends StObject {
  
  var a: AsiaSlashMakassar
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `217` {
  
  inline def apply(): `217` = {
    val __obj = js.Dynamic.literal(a = "Asia/Makassar", r = 1)
    __obj.asInstanceOf[`217`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `217`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AsiaSlashMakassar): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
