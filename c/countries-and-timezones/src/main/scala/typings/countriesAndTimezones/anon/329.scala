package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashParis
import typings.countriesAndTimezones.countriesAndTimezonesStrings.MC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `329` extends StObject {
  
  var a: EuropeSlashParis
  
  var c: js.Array[MC]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `329` {
  
  inline def apply(c: js.Array[MC]): `329` = {
    val __obj = js.Dynamic.literal(a = "Europe/Paris", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`329`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `329`] (val x: Self) extends AnyVal {
    
    inline def setA(value: EuropeSlashParis): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[MC]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: MC*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
