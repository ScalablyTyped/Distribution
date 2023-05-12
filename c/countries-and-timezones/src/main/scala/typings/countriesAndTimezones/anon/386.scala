package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashTarawa
import typings.countriesAndTimezones.countriesAndTimezonesStrings.TV
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `386` extends StObject {
  
  var a: PacificSlashTarawa
  
  var c: js.Array[TV]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `386` {
  
  inline def apply(c: js.Array[TV]): `386` = {
    val __obj = js.Dynamic.literal(a = "Pacific/Tarawa", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`386`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `386`] (val x: Self) extends AnyVal {
    
    inline def setA(value: PacificSlashTarawa): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[TV]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: TV*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
