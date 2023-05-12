package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashYangon
import typings.countriesAndTimezones.countriesAndTimezonesStrings.CC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `357` extends StObject {
  
  var a: AsiaSlashYangon
  
  var c: js.Array[CC]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `357` {
  
  inline def apply(c: js.Array[CC]): `357` = {
    val __obj = js.Dynamic.literal(a = "Asia/Yangon", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`357`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `357`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AsiaSlashYangon): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[CC]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: CC*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
