package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashNairobi
import typings.countriesAndTimezones.countriesAndTimezonesStrings.YT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `363` extends StObject {
  
  var a: AfricaSlashNairobi
  
  var c: js.Array[YT]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `363` {
  
  inline def apply(c: js.Array[YT]): `363` = {
    val __obj = js.Dynamic.literal(a = "Africa/Nairobi", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`363`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `363`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AfricaSlashNairobi): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[YT]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: YT*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
