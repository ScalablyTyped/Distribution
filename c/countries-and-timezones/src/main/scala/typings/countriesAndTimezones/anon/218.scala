package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashUlaanbaatar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `218` extends StObject {
  
  var a: AsiaSlashUlaanbaatar
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `218` {
  
  inline def apply(): `218` = {
    val __obj = js.Dynamic.literal(a = "Asia/Ulaanbaatar", r = 1)
    __obj.asInstanceOf[`218`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `218`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AsiaSlashUlaanbaatar): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
