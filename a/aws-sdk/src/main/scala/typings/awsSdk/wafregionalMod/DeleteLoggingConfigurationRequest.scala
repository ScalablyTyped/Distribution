package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLoggingConfigurationRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the web ACL from which you want to delete the LoggingConfiguration.
    */
  var ResourceArn: typings.awsSdk.wafregionalMod.ResourceArn
}
object DeleteLoggingConfigurationRequest {
  
  inline def apply(ResourceArn: ResourceArn): DeleteLoggingConfigurationRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLoggingConfigurationRequest]
  }
  
  extension [Self <: DeleteLoggingConfigurationRequest](x: Self) {
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
