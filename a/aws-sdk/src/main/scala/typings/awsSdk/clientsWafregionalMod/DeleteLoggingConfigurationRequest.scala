package typings.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLoggingConfigurationRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the web ACL from which you want to delete the LoggingConfiguration.
    */
  var ResourceArn: typings.awsSdk.clientsWafregionalMod.ResourceArn
}
object DeleteLoggingConfigurationRequest {
  
  inline def apply(ResourceArn: ResourceArn): DeleteLoggingConfigurationRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLoggingConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteLoggingConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
