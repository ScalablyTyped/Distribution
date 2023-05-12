package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashChatham
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `374` extends StObject {
  
  var a: PacificSlashChatham
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `374` {
  
  inline def apply(): `374` = {
    val __obj = js.Dynamic.literal(a = "Pacific/Chatham", r = 1)
    __obj.asInstanceOf[`374`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `374`] (val x: Self) extends AnyVal {
    
    inline def setA(value: PacificSlashChatham): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
