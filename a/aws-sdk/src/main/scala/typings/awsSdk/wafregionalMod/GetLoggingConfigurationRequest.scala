package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLoggingConfigurationRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the web ACL for which you want to get the LoggingConfiguration.
    */
  var ResourceArn: typings.awsSdk.wafregionalMod.ResourceArn
}
object GetLoggingConfigurationRequest {
  
  @scala.inline
  def apply(ResourceArn: ResourceArn): GetLoggingConfigurationRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoggingConfigurationRequest]
  }
  
  @scala.inline
  implicit class GetLoggingConfigurationRequestMutableBuilder[Self <: GetLoggingConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
