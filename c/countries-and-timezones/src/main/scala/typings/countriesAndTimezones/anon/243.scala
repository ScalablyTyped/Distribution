package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashAdelaide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `243` extends StObject {
  
  var a: AustraliaSlashAdelaide
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `243` {
  
  inline def apply(): `243` = {
    val __obj = js.Dynamic.literal(a = "Australia/Adelaide", r = 1)
    __obj.asInstanceOf[`243`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `243`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AustraliaSlashAdelaide): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
