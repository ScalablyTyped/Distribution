package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`600`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.GU
import typings.countriesAndTimezones.countriesAndTimezonesStrings.MP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `390` extends StObject {
  
  var c: js.Tuple2[GU, MP]
  
  var u: `600`
}
object `390` {
  
  inline def apply(c: js.Tuple2[GU, MP]): `390` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 600)
    __obj.asInstanceOf[`390`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `390`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Tuple2[GU, MP]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setU(value: `600`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
