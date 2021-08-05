package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDisassociateScramSecretResponse extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) of the cluster.
    
    */
  var ClusterArn: js.UndefOr[string] = js.undefined
  
  /**
    * 
    List of errors when disassociating secrets to cluster.
    
    */
  var UnprocessedScramSecrets: js.UndefOr[listOfUnprocessedScramSecret] = js.undefined
}
object BatchDisassociateScramSecretResponse {
  
  inline def apply(): BatchDisassociateScramSecretResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDisassociateScramSecretResponse]
  }
  
  extension [Self <: BatchDisassociateScramSecretResponse](x: Self) {
    
    inline def setClusterArn(value: string): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    inline def setClusterArnUndefined: Self = StObject.set(x, "ClusterArn", js.undefined)
    
    inline def setUnprocessedScramSecrets(value: listOfUnprocessedScramSecret): Self = StObject.set(x, "UnprocessedScramSecrets", value.asInstanceOf[js.Any])
    
    inline def setUnprocessedScramSecretsUndefined: Self = StObject.set(x, "UnprocessedScramSecrets", js.undefined)
    
    inline def setUnprocessedScramSecretsVarargs(value: UnprocessedScramSecret*): Self = StObject.set(x, "UnprocessedScramSecrets", js.Array(value :_*))
  }
}
