package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`-120`
import typings.countriesAndTimezones.countriesAndTimezonesInts.`-180`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.PM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `102` extends StObject {
  
  var c: js.Array[PM]
  
  var d: `-120`
  
  var u: `-180`
}
object `102` {
  
  inline def apply(c: js.Array[PM]): `102` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = -120, u = -180)
    __obj.asInstanceOf[`102`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `102`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[PM]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: PM*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: `-120`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: `-180`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
