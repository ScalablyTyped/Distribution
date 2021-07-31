package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiplexProgramServiceDescriptor extends StObject {
  
  /**
    * Name of the provider.
    */
  var ProviderName: stringMax256
  
  /**
    * Name of the service.
    */
  var ServiceName: stringMax256
}
object MultiplexProgramServiceDescriptor {
  
  @scala.inline
  def apply(ProviderName: stringMax256, ServiceName: stringMax256): MultiplexProgramServiceDescriptor = {
    val __obj = js.Dynamic.literal(ProviderName = ProviderName.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiplexProgramServiceDescriptor]
  }
  
  @scala.inline
  implicit class MultiplexProgramServiceDescriptorMutableBuilder[Self <: MultiplexProgramServiceDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProviderName(value: stringMax256): Self = StObject.set(x, "ProviderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceName(value: stringMax256): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
  }
}
