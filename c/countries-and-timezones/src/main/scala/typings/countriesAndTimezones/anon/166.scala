package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashShanghai
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `166` extends StObject {
  
  var a: AsiaSlashShanghai
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `166` {
  
  inline def apply(): `166` = {
    val __obj = js.Dynamic.literal(a = "Asia/Shanghai", r = 1)
    __obj.asInstanceOf[`166`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `166`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AsiaSlashShanghai): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
