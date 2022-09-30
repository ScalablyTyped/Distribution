package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashKentuckySlashLouisville
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `95` extends StObject {
  
  var a: AmericaSlashKentuckySlashLouisville
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `95` {
  
  inline def apply(): `95` = {
    val __obj = js.Dynamic.literal(a = "America/Kentucky/Louisville", r = 1)
    __obj.asInstanceOf[`95`]
  }
  
  extension [Self <: `95`](x: Self) {
    
    inline def setA(value: AmericaSlashKentuckySlashLouisville): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
