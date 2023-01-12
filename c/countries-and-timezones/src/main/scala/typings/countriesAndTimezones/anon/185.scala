package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashKathmandu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `185` extends StObject {
  
  var a: AsiaSlashKathmandu
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `185` {
  
  inline def apply(): `185` = {
    val __obj = js.Dynamic.literal(a = "Asia/Kathmandu", r = 1)
    __obj.asInstanceOf[`185`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `185`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AsiaSlashKathmandu): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
