package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`-570`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.PF
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `398` extends StObject {
  
  var c: js.Array[PF]
  
  var u: `-570`
}
object `398` {
  
  inline def apply(c: js.Array[PF]): `398` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -570)
    __obj.asInstanceOf[`398`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `398`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[PF]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: PF*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `-570`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
