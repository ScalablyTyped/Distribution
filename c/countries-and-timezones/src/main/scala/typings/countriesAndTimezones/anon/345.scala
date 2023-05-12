package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashChisinau
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `345` extends StObject {
  
  var a: EuropeSlashChisinau
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `345` {
  
  inline def apply(): `345` = {
    val __obj = js.Dynamic.literal(a = "Europe/Chisinau", r = 1)
    __obj.asInstanceOf[`345`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `345`] (val x: Self) extends AnyVal {
    
    inline def setA(value: EuropeSlashChisinau): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
