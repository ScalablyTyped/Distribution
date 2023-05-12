package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.DK
import typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashBerlin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `311` extends StObject {
  
  var a: EuropeSlashBerlin
  
  var c: js.Array[DK]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `311` {
  
  inline def apply(c: js.Array[DK]): `311` = {
    val __obj = js.Dynamic.literal(a = "Europe/Berlin", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`311`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `311`] (val x: Self) extends AnyVal {
    
    inline def setA(value: EuropeSlashBerlin): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[DK]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: DK*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
