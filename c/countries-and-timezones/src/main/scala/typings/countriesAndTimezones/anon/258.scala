package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashSt_Johns
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `258` extends StObject {
  
  var a: AmericaSlashSt_Johns
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `258` {
  
  inline def apply(): `258` = {
    val __obj = js.Dynamic.literal(a = "America/St_Johns", r = 1)
    __obj.asInstanceOf[`258`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `258`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AmericaSlashSt_Johns): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
