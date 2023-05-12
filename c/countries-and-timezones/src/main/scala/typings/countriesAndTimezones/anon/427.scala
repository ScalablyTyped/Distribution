package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashDetroit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `427` extends StObject {
  
  var a: AmericaSlashDetroit
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `427` {
  
  inline def apply(): `427` = {
    val __obj = js.Dynamic.literal(a = "America/Detroit", r = 1)
    __obj.asInstanceOf[`427`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `427`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AmericaSlashDetroit): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
