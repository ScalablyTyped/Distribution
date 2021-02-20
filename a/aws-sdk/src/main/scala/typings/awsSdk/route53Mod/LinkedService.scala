package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkedService extends StObject {
  
  /**
    * If the health check or hosted zone was created by another service, an optional description that can be provided by the other service. When a resource is created by another service, you can't edit or delete it using Amazon Route 53. 
    */
  var Description: js.UndefOr[ResourceDescription] = js.native
  
  /**
    * If the health check or hosted zone was created by another service, the service that created the resource. When a resource is created by another service, you can't edit or delete it using Amazon Route 53. 
    */
  var ServicePrincipal: js.UndefOr[typings.awsSdk.route53Mod.ServicePrincipal] = js.native
}
object LinkedService {
  
  @scala.inline
  def apply(): LinkedService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkedService]
  }
  
  @scala.inline
  implicit class LinkedServiceMutableBuilder[Self <: LinkedService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: ResourceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setServicePrincipal(value: ServicePrincipal): Self = StObject.set(x, "ServicePrincipal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicePrincipalUndefined: Self = StObject.set(x, "ServicePrincipal", js.undefined)
  }
}
