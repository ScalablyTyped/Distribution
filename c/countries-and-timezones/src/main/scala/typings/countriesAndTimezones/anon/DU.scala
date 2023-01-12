package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.EH
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DU extends StObject {
  
  var c: js.Array[EH]
  
  var d: typings.countriesAndTimezones.countriesAndTimezonesInts.`0`
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`60`
}
object DU {
  
  inline def apply(c: js.Array[EH]): DU = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 0, u = 60)
    __obj.asInstanceOf[DU]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DU] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[EH]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: EH*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`0`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`60`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
