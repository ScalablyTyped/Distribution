package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashMexico_City
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `372` extends StObject {
  
  var a: AmericaSlashMexico_City
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `372` {
  
  inline def apply(): `372` = {
    val __obj = js.Dynamic.literal(a = "America/Mexico_City", r = 1)
    __obj.asInstanceOf[`372`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `372`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AmericaSlashMexico_City): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
