package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashHo_Chi_Minh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201` extends StObject {
  
  var a: AsiaSlashHo_Chi_Minh
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `201` {
  
  inline def apply(): `201` = {
    val __obj = js.Dynamic.literal(a = "Asia/Ho_Chi_Minh", r = 1)
    __obj.asInstanceOf[`201`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AsiaSlashHo_Chi_Minh): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
