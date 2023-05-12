package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashBerlin
import typings.countriesAndTimezones.countriesAndTimezonesStrings.SJ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `147` extends StObject {
  
  var a: EuropeSlashBerlin
  
  var c: js.Array[SJ]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `147` {
  
  inline def apply(c: js.Array[SJ]): `147` = {
    val __obj = js.Dynamic.literal(a = "Europe/Berlin", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`147`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `147`] (val x: Self) extends AnyVal {
    
    inline def setA(value: EuropeSlashBerlin): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[SJ]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: SJ*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
