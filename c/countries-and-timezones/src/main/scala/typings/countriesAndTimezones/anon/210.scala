package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashThimphu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `210` extends StObject {
  
  var a: AsiaSlashThimphu
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `210` {
  
  inline def apply(): `210` = {
    val __obj = js.Dynamic.literal(a = "Asia/Thimphu", r = 1)
    __obj.asInstanceOf[`210`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `210`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AsiaSlashThimphu): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
