package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RebootBrokerRequest extends StObject {
  
  /**
    * 
    The list of broker IDs to be rebooted. The reboot-broker operation supports rebooting one broker at a time.
    
    */
  var BrokerIds: listOfString
  
  /**
    * 
    The Amazon Resource Name (ARN) of the cluster to be updated.
    
    */
  var ClusterArn: string
}
object RebootBrokerRequest {
  
  @scala.inline
  def apply(BrokerIds: listOfString, ClusterArn: string): RebootBrokerRequest = {
    val __obj = js.Dynamic.literal(BrokerIds = BrokerIds.asInstanceOf[js.Any], ClusterArn = ClusterArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebootBrokerRequest]
  }
  
  @scala.inline
  implicit class RebootBrokerRequestMutableBuilder[Self <: RebootBrokerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrokerIds(value: listOfString): Self = StObject.set(x, "BrokerIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrokerIdsVarargs(value: string*): Self = StObject.set(x, "BrokerIds", js.Array(value :_*))
    
    @scala.inline
    def setClusterArn(value: string): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
  }
}
