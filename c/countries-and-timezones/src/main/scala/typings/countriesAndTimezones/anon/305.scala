package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashPrague
import typings.countriesAndTimezones.countriesAndTimezonesStrings.SK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `305` extends StObject {
  
  var a: EuropeSlashPrague
  
  var c: js.Array[SK]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `305` {
  
  inline def apply(c: js.Array[SK]): `305` = {
    val __obj = js.Dynamic.literal(a = "Europe/Prague", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`305`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `305`] (val x: Self) extends AnyVal {
    
    inline def setA(value: EuropeSlashPrague): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[SK]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: SK*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
