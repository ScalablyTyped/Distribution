package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashVancouver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `259` extends StObject {
  
  var a: AmericaSlashVancouver
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `259` {
  
  inline def apply(): `259` = {
    val __obj = js.Dynamic.literal(a = "America/Vancouver", r = 1)
    __obj.asInstanceOf[`259`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `259`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AmericaSlashVancouver): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
