package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopConfigurationRecorderRequest extends StObject {
  
  /**
    * The name of the recorder object that records each configuration change made to the resources.
    */
  var ConfigurationRecorderName: RecorderName = js.native
}
object StopConfigurationRecorderRequest {
  
  @scala.inline
  def apply(ConfigurationRecorderName: RecorderName): StopConfigurationRecorderRequest = {
    val __obj = js.Dynamic.literal(ConfigurationRecorderName = ConfigurationRecorderName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopConfigurationRecorderRequest]
  }
  
  @scala.inline
  implicit class StopConfigurationRecorderRequestMutableBuilder[Self <: StopConfigurationRecorderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationRecorderName(value: RecorderName): Self = StObject.set(x, "ConfigurationRecorderName", value.asInstanceOf[js.Any])
  }
}
