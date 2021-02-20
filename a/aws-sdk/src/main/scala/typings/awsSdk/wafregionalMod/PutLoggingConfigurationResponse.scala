package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutLoggingConfigurationResponse extends StObject {
  
  /**
    * The LoggingConfiguration that you submitted in the request.
    */
  var LoggingConfiguration: js.UndefOr[typings.awsSdk.wafregionalMod.LoggingConfiguration] = js.native
}
object PutLoggingConfigurationResponse {
  
  @scala.inline
  def apply(): PutLoggingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutLoggingConfigurationResponse]
  }
  
  @scala.inline
  implicit class PutLoggingConfigurationResponseMutableBuilder[Self <: PutLoggingConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoggingConfiguration(value: LoggingConfiguration): Self = StObject.set(x, "LoggingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingConfigurationUndefined: Self = StObject.set(x, "LoggingConfiguration", js.undefined)
  }
}
