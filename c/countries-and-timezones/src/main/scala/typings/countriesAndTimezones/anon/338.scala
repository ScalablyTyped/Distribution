package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.BA
import typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashBelgrade
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `338` extends StObject {
  
  var a: EuropeSlashBelgrade
  
  var c: js.Array[BA]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `338` {
  
  inline def apply(c: js.Array[BA]): `338` = {
    val __obj = js.Dynamic.literal(a = "Europe/Belgrade", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`338`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `338`] (val x: Self) extends AnyVal {
    
    inline def setA(value: EuropeSlashBelgrade): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[BA]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: BA*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
