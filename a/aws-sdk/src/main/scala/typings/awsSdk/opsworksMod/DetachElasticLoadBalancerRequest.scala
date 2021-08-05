package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetachElasticLoadBalancerRequest extends StObject {
  
  /**
    * The Elastic Load Balancing instance's name.
    */
  var ElasticLoadBalancerName: String
  
  /**
    * The ID of the layer that the Elastic Load Balancing instance is attached to.
    */
  var LayerId: String
}
object DetachElasticLoadBalancerRequest {
  
  inline def apply(ElasticLoadBalancerName: String, LayerId: String): DetachElasticLoadBalancerRequest = {
    val __obj = js.Dynamic.literal(ElasticLoadBalancerName = ElasticLoadBalancerName.asInstanceOf[js.Any], LayerId = LayerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachElasticLoadBalancerRequest]
  }
  
  extension [Self <: DetachElasticLoadBalancerRequest](x: Self) {
    
    inline def setElasticLoadBalancerName(value: String): Self = StObject.set(x, "ElasticLoadBalancerName", value.asInstanceOf[js.Any])
    
    inline def setLayerId(value: String): Self = StObject.set(x, "LayerId", value.asInstanceOf[js.Any])
  }
}
