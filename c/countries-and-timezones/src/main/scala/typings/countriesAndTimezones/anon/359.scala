package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.HM
import typings.countriesAndTimezones.countriesAndTimezonesStrings.IndianSlashMaldives
import typings.countriesAndTimezones.countriesAndTimezonesStrings.TF
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `359` extends StObject {
  
  var a: IndianSlashMaldives
  
  var c: js.Tuple2[TF, HM]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `359` {
  
  inline def apply(c: js.Tuple2[TF, HM]): `359` = {
    val __obj = js.Dynamic.literal(a = "Indian/Maldives", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`359`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `359`] (val x: Self) extends AnyVal {
    
    inline def setA(value: IndianSlashMaldives): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Tuple2[TF, HM]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
