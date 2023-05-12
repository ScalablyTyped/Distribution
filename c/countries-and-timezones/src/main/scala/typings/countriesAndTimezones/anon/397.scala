package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.MH
import typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashTarawa
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `397` extends StObject {
  
  var a: PacificSlashTarawa
  
  var c: js.Array[MH]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `397` {
  
  inline def apply(c: js.Array[MH]): `397` = {
    val __obj = js.Dynamic.literal(a = "Pacific/Tarawa", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`397`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `397`] (val x: Self) extends AnyVal {
    
    inline def setA(value: PacificSlashTarawa): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[MH]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: MH*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
