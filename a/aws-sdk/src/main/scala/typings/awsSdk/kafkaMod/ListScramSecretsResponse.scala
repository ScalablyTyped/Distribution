package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListScramSecretsResponse extends StObject {
  
  /**
    * 
    Paginated results marker.
    
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * 
    The list of scram secrets associated with the cluster.
    
    */
  var SecretArnList: js.UndefOr[listOfString] = js.undefined
}
object ListScramSecretsResponse {
  
  inline def apply(): ListScramSecretsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListScramSecretsResponse]
  }
  
  extension [Self <: ListScramSecretsResponse](x: Self) {
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSecretArnList(value: listOfString): Self = StObject.set(x, "SecretArnList", value.asInstanceOf[js.Any])
    
    inline def setSecretArnListUndefined: Self = StObject.set(x, "SecretArnList", js.undefined)
    
    inline def setSecretArnListVarargs(value: string*): Self = StObject.set(x, "SecretArnList", js.Array(value :_*))
  }
}
