package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashLagos
import typings.countriesAndTimezones.countriesAndTimezonesStrings.GQ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `25` extends StObject {
  
  var a: AfricaSlashLagos
  
  var c: js.Array[GQ]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `25` {
  
  inline def apply(c: js.Array[GQ]): `25` = {
    val __obj = js.Dynamic.literal(a = "Africa/Lagos", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`25`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `25`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AfricaSlashLagos): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[GQ]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: GQ*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
