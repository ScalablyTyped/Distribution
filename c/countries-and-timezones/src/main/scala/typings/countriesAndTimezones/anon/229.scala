package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`-120`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.GS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `229` extends StObject {
  
  var c: js.Array[GS]
  
  var u: `-120`
}
object `229` {
  
  inline def apply(c: js.Array[GS]): `229` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -120)
    __obj.asInstanceOf[`229`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `229`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[GS]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: GS*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `-120`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
