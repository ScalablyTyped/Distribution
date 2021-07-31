package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLoggingConfigurationResponse extends StObject {
  
  /**
    * The LoggingConfiguration for the specified web ACL.
    */
  var LoggingConfiguration: js.UndefOr[typings.awsSdk.wafregionalMod.LoggingConfiguration] = js.undefined
}
object GetLoggingConfigurationResponse {
  
  @scala.inline
  def apply(): GetLoggingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLoggingConfigurationResponse]
  }
  
  @scala.inline
  implicit class GetLoggingConfigurationResponseMutableBuilder[Self <: GetLoggingConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoggingConfiguration(value: LoggingConfiguration): Self = StObject.set(x, "LoggingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingConfigurationUndefined: Self = StObject.set(x, "LoggingConfiguration", js.undefined)
  }
}
