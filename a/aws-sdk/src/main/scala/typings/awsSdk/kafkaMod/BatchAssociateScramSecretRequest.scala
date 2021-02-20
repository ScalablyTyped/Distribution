package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchAssociateScramSecretRequest extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) of the cluster to be updated.
    
    */
  var ClusterArn: string = js.native
  
  /**
    * 
    List of AWS Secrets Manager secret ARNs.
    
    */
  var SecretArnList: listOfString = js.native
}
object BatchAssociateScramSecretRequest {
  
  @scala.inline
  def apply(ClusterArn: string, SecretArnList: listOfString): BatchAssociateScramSecretRequest = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn.asInstanceOf[js.Any], SecretArnList = SecretArnList.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAssociateScramSecretRequest]
  }
  
  @scala.inline
  implicit class BatchAssociateScramSecretRequestMutableBuilder[Self <: BatchAssociateScramSecretRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterArn(value: string): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretArnList(value: listOfString): Self = StObject.set(x, "SecretArnList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretArnListVarargs(value: string*): Self = StObject.set(x, "SecretArnList", js.Array(value :_*))
  }
}
