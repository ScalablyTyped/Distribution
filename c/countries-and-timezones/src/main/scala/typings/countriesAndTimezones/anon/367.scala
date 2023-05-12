package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashTokyo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `367` extends StObject {
  
  var a: AsiaSlashTokyo
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `367` {
  
  inline def apply(): `367` = {
    val __obj = js.Dynamic.literal(a = "Asia/Tokyo", r = 1)
    __obj.asInstanceOf[`367`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `367`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AsiaSlashTokyo): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
