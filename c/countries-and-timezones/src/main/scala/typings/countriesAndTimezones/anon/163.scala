package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashKolkata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `163` extends StObject {
  
  var a: AsiaSlashKolkata
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `163` {
  
  inline def apply(): `163` = {
    val __obj = js.Dynamic.literal(a = "Asia/Kolkata", r = 1)
    __obj.asInstanceOf[`163`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `163`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AsiaSlashKolkata): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
