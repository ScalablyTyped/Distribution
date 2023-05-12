package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.IR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `212` extends StObject {
  
  var c: js.Array[IR]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`210`
}
object `212` {
  
  inline def apply(c: js.Array[IR]): `212` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 210)
    __obj.asInstanceOf[`212`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `212`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[IR]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: IR*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`210`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
