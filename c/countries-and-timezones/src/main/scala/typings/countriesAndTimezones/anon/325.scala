package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashBrussels
import typings.countriesAndTimezones.countriesAndTimezonesStrings.LU
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `325` extends StObject {
  
  var a: EuropeSlashBrussels
  
  var c: js.Array[LU]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `325` {
  
  inline def apply(c: js.Array[LU]): `325` = {
    val __obj = js.Dynamic.literal(a = "Europe/Brussels", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`325`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `325`] (val x: Self) extends AnyVal {
    
    inline def setA(value: EuropeSlashBrussels): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[LU]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: LU*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
