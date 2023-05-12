package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashNairobi
import typings.countriesAndTimezones.countriesAndTimezonesStrings.MG
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `354` extends StObject {
  
  var a: AfricaSlashNairobi
  
  var c: js.Array[MG]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `354` {
  
  inline def apply(c: js.Array[MG]): `354` = {
    val __obj = js.Dynamic.literal(a = "Africa/Nairobi", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`354`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `354`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AfricaSlashNairobi): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[MG]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: MG*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
