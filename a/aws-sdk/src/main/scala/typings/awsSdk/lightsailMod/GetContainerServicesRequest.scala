package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetContainerServicesRequest extends StObject {
  
  /**
    * The name of the container service for which to return information. When omitted, the response includes all of your container services in the AWS Region where the request is made.
    */
  var serviceName: js.UndefOr[ContainerServiceName] = js.native
}
object GetContainerServicesRequest {
  
  @scala.inline
  def apply(): GetContainerServicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContainerServicesRequest]
  }
  
  @scala.inline
  implicit class GetContainerServicesRequestMutableBuilder[Self <: GetContainerServicesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceName(value: ContainerServiceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
