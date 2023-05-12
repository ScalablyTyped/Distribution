package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashLondon
import typings.countriesAndTimezones.countriesAndTimezonesStrings.GB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `302` extends StObject {
  
  var a: EuropeSlashLondon
  
  var c: js.Array[GB]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `302` {
  
  inline def apply(c: js.Array[GB]): `302` = {
    val __obj = js.Dynamic.literal(a = "Europe/London", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`302`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `302`] (val x: Self) extends AnyVal {
    
    inline def setA(value: EuropeSlashLondon): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[GB]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: GB*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
