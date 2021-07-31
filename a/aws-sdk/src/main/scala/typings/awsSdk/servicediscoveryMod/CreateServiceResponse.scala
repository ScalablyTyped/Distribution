package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServiceResponse extends StObject {
  
  /**
    * A complex type that contains information about the new service.
    */
  var Service: js.UndefOr[typings.awsSdk.servicediscoveryMod.Service] = js.undefined
}
object CreateServiceResponse {
  
  @scala.inline
  def apply(): CreateServiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateServiceResponse]
  }
  
  @scala.inline
  implicit class CreateServiceResponseMutableBuilder[Self <: CreateServiceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setService(value: Service): Self = StObject.set(x, "Service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "Service", js.undefined)
  }
}
