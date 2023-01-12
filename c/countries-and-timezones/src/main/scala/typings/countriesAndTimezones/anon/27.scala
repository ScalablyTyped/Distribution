package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashJohannesburg
import typings.countriesAndTimezones.countriesAndTimezonesStrings.LS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `27` extends StObject {
  
  var a: AfricaSlashJohannesburg
  
  var c: js.Array[LS]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `27` {
  
  inline def apply(c: js.Array[LS]): `27` = {
    val __obj = js.Dynamic.literal(a = "Africa/Johannesburg", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`27`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `27`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AfricaSlashJohannesburg): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[LS]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: LS*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
