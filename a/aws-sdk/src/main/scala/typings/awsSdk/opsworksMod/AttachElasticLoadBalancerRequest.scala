package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachElasticLoadBalancerRequest extends StObject {
  
  /**
    * The Elastic Load Balancing instance's name.
    */
  var ElasticLoadBalancerName: String
  
  /**
    * The ID of the layer to which the Elastic Load Balancing instance is to be attached.
    */
  var LayerId: String
}
object AttachElasticLoadBalancerRequest {
  
  @scala.inline
  def apply(ElasticLoadBalancerName: String, LayerId: String): AttachElasticLoadBalancerRequest = {
    val __obj = js.Dynamic.literal(ElasticLoadBalancerName = ElasticLoadBalancerName.asInstanceOf[js.Any], LayerId = LayerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachElasticLoadBalancerRequest]
  }
  
  @scala.inline
  implicit class AttachElasticLoadBalancerRequestMutableBuilder[Self <: AttachElasticLoadBalancerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElasticLoadBalancerName(value: String): Self = StObject.set(x, "ElasticLoadBalancerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerId(value: String): Self = StObject.set(x, "LayerId", value.asInstanceOf[js.Any])
  }
}
