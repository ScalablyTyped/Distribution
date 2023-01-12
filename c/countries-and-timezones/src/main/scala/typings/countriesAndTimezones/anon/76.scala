package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashIndianaSlashIndianapolis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `76` extends StObject {
  
  var a: AmericaSlashIndianaSlashIndianapolis
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `76` {
  
  inline def apply(): `76` = {
    val __obj = js.Dynamic.literal(a = "America/Indiana/Indianapolis", r = 1)
    __obj.asInstanceOf[`76`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `76`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AmericaSlashIndianaSlashIndianapolis): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
