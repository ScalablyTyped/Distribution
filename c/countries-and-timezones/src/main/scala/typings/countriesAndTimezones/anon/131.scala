package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`-360`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.HN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `131` extends StObject {
  
  var c: js.Array[HN]
  
  var u: `-360`
}
object `131` {
  
  inline def apply(c: js.Array[HN]): `131` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -360)
    __obj.asInstanceOf[`131`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `131`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[HN]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: HN*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `-360`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
