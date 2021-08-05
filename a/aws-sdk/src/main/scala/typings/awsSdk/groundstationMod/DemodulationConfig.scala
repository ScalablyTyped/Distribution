package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DemodulationConfig extends StObject {
  
  /**
    * Unvalidated JSON of a demodulation Config.
    */
  var unvalidatedJSON: JsonString
}
object DemodulationConfig {
  
  inline def apply(unvalidatedJSON: JsonString): DemodulationConfig = {
    val __obj = js.Dynamic.literal(unvalidatedJSON = unvalidatedJSON.asInstanceOf[js.Any])
    __obj.asInstanceOf[DemodulationConfig]
  }
  
  extension [Self <: DemodulationConfig](x: Self) {
    
    inline def setUnvalidatedJSON(value: JsonString): Self = StObject.set(x, "unvalidatedJSON", value.asInstanceOf[js.Any])
  }
}
