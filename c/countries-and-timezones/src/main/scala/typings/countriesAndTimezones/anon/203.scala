package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashYangon
import typings.countriesAndTimezones.countriesAndTimezonesStrings.MM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `203` extends StObject {
  
  var a: AsiaSlashYangon
  
  var c: js.Array[MM]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `203` {
  
  inline def apply(c: js.Array[MM]): `203` = {
    val __obj = js.Dynamic.literal(a = "Asia/Yangon", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`203`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `203`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AsiaSlashYangon): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[MM]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: MM*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
