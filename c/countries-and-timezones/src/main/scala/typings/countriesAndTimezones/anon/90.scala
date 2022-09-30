package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashIndianaSlashKnox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `90` extends StObject {
  
  var a: AmericaSlashIndianaSlashKnox
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `90` {
  
  inline def apply(): `90` = {
    val __obj = js.Dynamic.literal(a = "America/Indiana/Knox", r = 1)
    __obj.asInstanceOf[`90`]
  }
  
  extension [Self <: `90`](x: Self) {
    
    inline def setA(value: AmericaSlashIndianaSlashKnox): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
