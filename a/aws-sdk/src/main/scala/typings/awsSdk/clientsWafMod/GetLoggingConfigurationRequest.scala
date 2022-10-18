package typings.awsSdk.clientsWafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLoggingConfigurationRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the web ACL for which you want to get the LoggingConfiguration.
    */
  var ResourceArn: typings.awsSdk.clientsWafMod.ResourceArn
}
object GetLoggingConfigurationRequest {
  
  inline def apply(ResourceArn: ResourceArn): GetLoggingConfigurationRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoggingConfigurationRequest]
  }
  
  extension [Self <: GetLoggingConfigurationRequest](x: Self) {
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
