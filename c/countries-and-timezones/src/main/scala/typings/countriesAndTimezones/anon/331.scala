package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.BV
import typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashBerlin
import typings.countriesAndTimezones.countriesAndTimezonesStrings.NO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `331` extends StObject {
  
  var a: EuropeSlashBerlin
  
  var c: js.Tuple2[NO, BV]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `331` {
  
  inline def apply(c: js.Tuple2[NO, BV]): `331` = {
    val __obj = js.Dynamic.literal(a = "Europe/Berlin", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`331`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `331`] (val x: Self) extends AnyVal {
    
    inline def setA(value: EuropeSlashBerlin): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Tuple2[NO, BV]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
