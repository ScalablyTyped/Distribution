package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DemodulationConfig extends StObject {
  
  /**
    * Unvalidated JSON of a demodulation Config.
    */
  var unvalidatedJSON: JsonString = js.native
}
object DemodulationConfig {
  
  @scala.inline
  def apply(unvalidatedJSON: JsonString): DemodulationConfig = {
    val __obj = js.Dynamic.literal(unvalidatedJSON = unvalidatedJSON.asInstanceOf[js.Any])
    __obj.asInstanceOf[DemodulationConfig]
  }
  
  @scala.inline
  implicit class DemodulationConfigMutableBuilder[Self <: DemodulationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnvalidatedJSON(value: JsonString): Self = StObject.set(x, "unvalidatedJSON", value.asInstanceOf[js.Any])
  }
}
