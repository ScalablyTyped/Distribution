package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutLoggingConfigurationRequest extends StObject {
  
  /**
    * 
    */
  var LoggingConfiguration: typings.awsSdk.wafv2Mod.LoggingConfiguration = js.native
}
object PutLoggingConfigurationRequest {
  
  @scala.inline
  def apply(LoggingConfiguration: LoggingConfiguration): PutLoggingConfigurationRequest = {
    val __obj = js.Dynamic.literal(LoggingConfiguration = LoggingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutLoggingConfigurationRequest]
  }
  
  @scala.inline
  implicit class PutLoggingConfigurationRequestMutableBuilder[Self <: PutLoggingConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoggingConfiguration(value: LoggingConfiguration): Self = StObject.set(x, "LoggingConfiguration", value.asInstanceOf[js.Any])
  }
}
