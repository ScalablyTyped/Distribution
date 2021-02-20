package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartConfigurationRecorderRequest extends StObject {
  
  /**
    * The name of the recorder object that records each configuration change made to the resources.
    */
  var ConfigurationRecorderName: RecorderName = js.native
}
object StartConfigurationRecorderRequest {
  
  @scala.inline
  def apply(ConfigurationRecorderName: RecorderName): StartConfigurationRecorderRequest = {
    val __obj = js.Dynamic.literal(ConfigurationRecorderName = ConfigurationRecorderName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartConfigurationRecorderRequest]
  }
  
  @scala.inline
  implicit class StartConfigurationRecorderRequestMutableBuilder[Self <: StartConfigurationRecorderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationRecorderName(value: RecorderName): Self = StObject.set(x, "ConfigurationRecorderName", value.asInstanceOf[js.Any])
  }
}
