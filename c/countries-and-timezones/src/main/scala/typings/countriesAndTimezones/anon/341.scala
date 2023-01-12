package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashChisinau
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `341` extends StObject {
  
  var a: EuropeSlashChisinau
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `341` {
  
  inline def apply(): `341` = {
    val __obj = js.Dynamic.literal(a = "Europe/Chisinau", r = 1)
    __obj.asInstanceOf[`341`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `341`] (val x: Self) extends AnyVal {
    
    inline def setA(value: EuropeSlashChisinau): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
