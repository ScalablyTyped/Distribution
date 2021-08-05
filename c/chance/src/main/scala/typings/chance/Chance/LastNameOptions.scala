package typings.chance.Chance

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastNameOptions extends StObject {
  
  var nationality: LastNameNationalities
}
object LastNameOptions {
  
  inline def apply(nationality: LastNameNationalities): LastNameOptions = {
    val __obj = js.Dynamic.literal(nationality = nationality.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastNameOptions]
  }
  
  extension [Self <: LastNameOptions](x: Self) {
    
    inline def setNationality(value: LastNameNationalities): Self = StObject.set(x, "nationality", value.asInstanceOf[js.Any])
  }
}
