package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`720`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.MH
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `396` extends StObject {
  
  var c: js.Array[MH]
  
  var u: `720`
}
object `396` {
  
  inline def apply(c: js.Array[MH]): `396` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 720)
    __obj.asInstanceOf[`396`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `396`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[MH]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: MH*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `720`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
