package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashTehran
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `365` extends StObject {
  
  var a: AsiaSlashTehran
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `365` {
  
  inline def apply(): `365` = {
    val __obj = js.Dynamic.literal(a = "Asia/Tehran", r = 1)
    __obj.asInstanceOf[`365`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `365`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AsiaSlashTehran): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
