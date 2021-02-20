package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetachElasticLoadBalancerRequest extends StObject {
  
  /**
    * The Elastic Load Balancing instance's name.
    */
  var ElasticLoadBalancerName: String = js.native
  
  /**
    * The ID of the layer that the Elastic Load Balancing instance is attached to.
    */
  var LayerId: String = js.native
}
object DetachElasticLoadBalancerRequest {
  
  @scala.inline
  def apply(ElasticLoadBalancerName: String, LayerId: String): DetachElasticLoadBalancerRequest = {
    val __obj = js.Dynamic.literal(ElasticLoadBalancerName = ElasticLoadBalancerName.asInstanceOf[js.Any], LayerId = LayerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachElasticLoadBalancerRequest]
  }
  
  @scala.inline
  implicit class DetachElasticLoadBalancerRequestMutableBuilder[Self <: DetachElasticLoadBalancerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElasticLoadBalancerName(value: String): Self = StObject.set(x, "ElasticLoadBalancerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerId(value: String): Self = StObject.set(x, "LayerId", value.asInstanceOf[js.Any])
  }
}
