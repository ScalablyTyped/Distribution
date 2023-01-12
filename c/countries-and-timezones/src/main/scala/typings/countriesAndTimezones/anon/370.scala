package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.NZ
import typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashAuckland
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `370` extends StObject {
  
  var a: PacificSlashAuckland
  
  var c: js.Array[NZ]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `370` {
  
  inline def apply(c: js.Array[NZ]): `370` = {
    val __obj = js.Dynamic.literal(a = "Pacific/Auckland", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`370`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `370`] (val x: Self) extends AnyVal {
    
    inline def setA(value: PacificSlashAuckland): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[NZ]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: NZ*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
