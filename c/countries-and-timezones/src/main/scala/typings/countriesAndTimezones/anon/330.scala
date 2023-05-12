package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashNicosia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `330` extends StObject {
  
  var a: AsiaSlashNicosia
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `330` {
  
  inline def apply(): `330` = {
    val __obj = js.Dynamic.literal(a = "Asia/Nicosia", r = 1)
    __obj.asInstanceOf[`330`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `330`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AsiaSlashNicosia): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
