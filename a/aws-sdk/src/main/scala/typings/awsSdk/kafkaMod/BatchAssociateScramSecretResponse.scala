package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchAssociateScramSecretResponse extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) of the cluster.
    
    */
  var ClusterArn: js.UndefOr[string] = js.native
  
  /**
    * 
    List of errors when associating secrets to cluster.
    
    */
  var UnprocessedScramSecrets: js.UndefOr[listOfUnprocessedScramSecret] = js.native
}
object BatchAssociateScramSecretResponse {
  
  @scala.inline
  def apply(): BatchAssociateScramSecretResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchAssociateScramSecretResponse]
  }
  
  @scala.inline
  implicit class BatchAssociateScramSecretResponseMutableBuilder[Self <: BatchAssociateScramSecretResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterArn(value: string): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterArnUndefined: Self = StObject.set(x, "ClusterArn", js.undefined)
    
    @scala.inline
    def setUnprocessedScramSecrets(value: listOfUnprocessedScramSecret): Self = StObject.set(x, "UnprocessedScramSecrets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprocessedScramSecretsUndefined: Self = StObject.set(x, "UnprocessedScramSecrets", js.undefined)
    
    @scala.inline
    def setUnprocessedScramSecretsVarargs(value: UnprocessedScramSecret*): Self = StObject.set(x, "UnprocessedScramSecrets", js.Array(value :_*))
  }
}
