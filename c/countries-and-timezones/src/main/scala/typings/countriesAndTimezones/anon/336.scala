package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.IT
import typings.countriesAndTimezones.countriesAndTimezonesStrings.SM
import typings.countriesAndTimezones.countriesAndTimezonesStrings.VA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `336` extends StObject {
  
  var c: js.Tuple3[IT, SM, VA]
  
  var d: typings.countriesAndTimezones.countriesAndTimezonesInts.`120`
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`60`
}
object `336` {
  
  inline def apply(c: js.Tuple3[IT, SM, VA]): `336` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 120, u = 60)
    __obj.asInstanceOf[`336`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `336`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Tuple3[IT, SM, VA]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setD(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`120`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`60`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
