package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteServiceRequest extends StObject {
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service to delete. If you do not specify a cluster, the default cluster is assumed.
    */
  var cluster: js.UndefOr[String] = js.undefined
  
  /**
    * If true, allows you to delete a service even if it has not been scaled down to zero tasks. It is only necessary to use this if the service is using the REPLICA scheduling strategy.
    */
  var force: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * The name of the service to delete.
    */
  var service: String
}
object DeleteServiceRequest {
  
  @scala.inline
  def apply(service: String): DeleteServiceRequest = {
    val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteServiceRequest]
  }
  
  @scala.inline
  implicit class DeleteServiceRequestMutableBuilder[Self <: DeleteServiceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    @scala.inline
    def setForce(value: BoxedBoolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
  }
}
