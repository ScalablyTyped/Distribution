package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashThimphu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `214` extends StObject {
  
  var a: AsiaSlashThimphu
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `214` {
  
  inline def apply(): `214` = {
    val __obj = js.Dynamic.literal(a = "Asia/Thimphu", r = 1)
    __obj.asInstanceOf[`214`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `214`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AsiaSlashThimphu): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
