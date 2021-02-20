package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeregisterElasticIpRequest extends StObject {
  
  /**
    * The Elastic IP address.
    */
  var ElasticIp: String = js.native
}
object DeregisterElasticIpRequest {
  
  @scala.inline
  def apply(ElasticIp: String): DeregisterElasticIpRequest = {
    val __obj = js.Dynamic.literal(ElasticIp = ElasticIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterElasticIpRequest]
  }
  
  @scala.inline
  implicit class DeregisterElasticIpRequestMutableBuilder[Self <: DeregisterElasticIpRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElasticIp(value: String): Self = StObject.set(x, "ElasticIp", value.asInstanceOf[js.Any])
  }
}
