package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AtlanticSlashFaroe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `225` extends StObject {
  
  var a: AtlanticSlashFaroe
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `225` {
  
  inline def apply(): `225` = {
    val __obj = js.Dynamic.literal(a = "Atlantic/Faroe", r = 1)
    __obj.asInstanceOf[`225`]
  }
  
  extension [Self <: `225`](x: Self) {
    
    inline def setA(value: AtlanticSlashFaroe): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
