package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`660`
import typings.countriesAndTimezones.countriesAndTimezonesInts.`720`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.NF
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `402` extends StObject {
  
  var c: js.Array[NF]
  
  var d: `720`
  
  var u: `660`
}
object `402` {
  
  inline def apply(c: js.Array[NF]): `402` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 720, u = 660)
    __obj.asInstanceOf[`402`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `402`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[NF]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: NF*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: `720`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: `660`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
