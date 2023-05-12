package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashMoscow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `429` extends StObject {
  
  var a: EuropeSlashMoscow
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `429` {
  
  inline def apply(): `429` = {
    val __obj = js.Dynamic.literal(a = "Europe/Moscow", r = 1)
    __obj.asInstanceOf[`429`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `429`] (val x: Self) extends AnyVal {
    
    inline def setA(value: EuropeSlashMoscow): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
