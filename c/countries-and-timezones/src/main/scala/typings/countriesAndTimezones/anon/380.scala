package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.FM
import typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashPort_Moresby
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `380` extends StObject {
  
  var a: PacificSlashPort_Moresby
  
  var c: js.Array[FM]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `380` {
  
  inline def apply(c: js.Array[FM]): `380` = {
    val __obj = js.Dynamic.literal(a = "Pacific/Port_Moresby", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`380`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `380`] (val x: Self) extends AnyVal {
    
    inline def setA(value: PacificSlashPort_Moresby): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[FM]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: FM*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
