package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDisassociateScramSecretResponse extends js.Object {
  
  /**
    * 
    The Amazon Resource Name (ARN) of the cluster.
    
    */
  var ClusterArn: js.UndefOr[string] = js.native
  
  /**
    * 
    List of errors when disassociating secrets to cluster.
    
    */
  var UnprocessedScramSecrets: js.UndefOr[listOfUnprocessedScramSecret] = js.native
}
object BatchDisassociateScramSecretResponse {
  
  @scala.inline
  def apply(): BatchDisassociateScramSecretResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDisassociateScramSecretResponse]
  }
  
  @scala.inline
  implicit class BatchDisassociateScramSecretResponseOps[Self <: BatchDisassociateScramSecretResponse] (val x: Self) extends AnyVal {
    
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
    def deleteClusterArn: Self = this.set("ClusterArn", js.undefined)
    
    @scala.inline
    def setUnprocessedScramSecretsVarargs(value: UnprocessedScramSecret*): Self = this.set("UnprocessedScramSecrets", js.Array(value :_*))
    
    @scala.inline
    def setUnprocessedScramSecrets(value: listOfUnprocessedScramSecret): Self = this.set("UnprocessedScramSecrets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnprocessedScramSecrets: Self = this.set("UnprocessedScramSecrets", js.undefined)
  }
}
