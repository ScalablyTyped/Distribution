package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateElasticIpRequest extends StObject {
  
  /**
    * The Elastic IP address.
    */
  var ElasticIp: String
}
object DisassociateElasticIpRequest {
  
  @scala.inline
  def apply(ElasticIp: String): DisassociateElasticIpRequest = {
    val __obj = js.Dynamic.literal(ElasticIp = ElasticIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateElasticIpRequest]
  }
  
  @scala.inline
  implicit class DisassociateElasticIpRequestMutableBuilder[Self <: DisassociateElasticIpRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElasticIp(value: String): Self = StObject.set(x, "ElasticIp", value.asInstanceOf[js.Any])
  }
}
