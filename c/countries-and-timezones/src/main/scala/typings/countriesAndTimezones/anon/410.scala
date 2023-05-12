package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.MP
import typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashGuam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `410` extends StObject {
  
  var a: PacificSlashGuam
  
  var c: js.Array[MP]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `410` {
  
  inline def apply(c: js.Array[MP]): `410` = {
    val __obj = js.Dynamic.literal(a = "Pacific/Guam", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`410`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `410`] (val x: Self) extends AnyVal {
    
    inline def setA(value: PacificSlashGuam): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[MP]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: MP*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
