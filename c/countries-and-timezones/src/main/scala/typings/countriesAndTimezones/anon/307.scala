package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.RO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `307` extends StObject {
  
  var c: js.Array[RO]
  
  var d: typings.countriesAndTimezones.countriesAndTimezonesInts.`180`
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`120`
}
object `307` {
  
  inline def apply(c: js.Array[RO]): `307` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 180, u = 120)
    __obj.asInstanceOf[`307`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `307`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[RO]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: RO*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`180`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`120`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
