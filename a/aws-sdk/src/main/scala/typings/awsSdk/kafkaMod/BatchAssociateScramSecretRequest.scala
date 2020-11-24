package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchAssociateScramSecretRequest extends js.Object {
  
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
  implicit class BatchAssociateScramSecretRequestOps[Self <: BatchAssociateScramSecretRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClusterArn(value: string): Self = this.set("ClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretArnListVarargs(value: string*): Self = this.set("SecretArnList", js.Array(value :_*))
    
    @scala.inline
    def setSecretArnList(value: listOfString): Self = this.set("SecretArnList", value.asInstanceOf[js.Any])
  }
}
