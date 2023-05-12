package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.FM
import typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashGuadalcanal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `407` extends StObject {
  
  var a: PacificSlashGuadalcanal
  
  var c: js.Array[FM]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `407` {
  
  inline def apply(c: js.Array[FM]): `407` = {
    val __obj = js.Dynamic.literal(a = "Pacific/Guadalcanal", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`407`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `407`] (val x: Self) extends AnyVal {
    
    inline def setA(value: PacificSlashGuadalcanal): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[FM]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: FM*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
