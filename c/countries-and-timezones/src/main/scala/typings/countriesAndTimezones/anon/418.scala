package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashLisbon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `418` extends StObject {
  
  var a: EuropeSlashLisbon
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `418` {
  
  inline def apply(): `418` = {
    val __obj = js.Dynamic.literal(a = "Europe/Lisbon", r = 1)
    __obj.asInstanceOf[`418`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `418`] (val x: Self) extends AnyVal {
    
    inline def setA(value: EuropeSlashLisbon): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
