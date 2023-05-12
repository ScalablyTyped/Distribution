package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`-150`
import typings.countriesAndTimezones.countriesAndTimezonesInts.`-210`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.CA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `126` extends StObject {
  
  var c: js.Array[CA]
  
  var d: `-150`
  
  var u: `-210`
}
object `126` {
  
  inline def apply(c: js.Array[CA]): `126` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = -150, u = -210)
    __obj.asInstanceOf[`126`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `126`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[CA]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: CA*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: `-150`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: `-210`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
