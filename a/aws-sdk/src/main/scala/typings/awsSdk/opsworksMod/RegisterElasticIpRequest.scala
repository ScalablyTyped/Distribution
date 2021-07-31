package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterElasticIpRequest extends StObject {
  
  /**
    * The Elastic IP address.
    */
  var ElasticIp: String
  
  /**
    * The stack ID.
    */
  var StackId: String
}
object RegisterElasticIpRequest {
  
  @scala.inline
  def apply(ElasticIp: String, StackId: String): RegisterElasticIpRequest = {
    val __obj = js.Dynamic.literal(ElasticIp = ElasticIp.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterElasticIpRequest]
  }
  
  @scala.inline
  implicit class RegisterElasticIpRequestMutableBuilder[Self <: RegisterElasticIpRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElasticIp(value: String): Self = StObject.set(x, "ElasticIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
  }
}
