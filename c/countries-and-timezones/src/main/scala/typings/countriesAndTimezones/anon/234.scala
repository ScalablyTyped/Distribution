package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashAbidjan
import typings.countriesAndTimezones.countriesAndTimezonesStrings.SH
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `234` extends StObject {
  
  var a: AfricaSlashAbidjan
  
  var c: js.Array[SH]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `234` {
  
  inline def apply(c: js.Array[SH]): `234` = {
    val __obj = js.Dynamic.literal(a = "Africa/Abidjan", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`234`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `234`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AfricaSlashAbidjan): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[SH]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: SH*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
