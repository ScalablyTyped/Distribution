package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashIstanbul
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `177` extends StObject {
  
  var a: EuropeSlashIstanbul
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `177` {
  
  inline def apply(): `177` = {
    val __obj = js.Dynamic.literal(a = "Europe/Istanbul", r = 1)
    __obj.asInstanceOf[`177`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `177`] (val x: Self) extends AnyVal {
    
    inline def setA(value: EuropeSlashIstanbul): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
