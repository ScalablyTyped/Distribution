package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListScramSecretsResponse extends StObject {
  
  /**
    * 
    Paginated results marker.
    
    */
  var NextToken: js.UndefOr[string] = js.native
  
  /**
    * 
    The list of scram secrets associated with the cluster.
    
    */
  var SecretArnList: js.UndefOr[listOfString] = js.native
}
object ListScramSecretsResponse {
  
  @scala.inline
  def apply(): ListScramSecretsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListScramSecretsResponse]
  }
  
  @scala.inline
  implicit class ListScramSecretsResponseMutableBuilder[Self <: ListScramSecretsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSecretArnList(value: listOfString): Self = StObject.set(x, "SecretArnList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretArnListUndefined: Self = StObject.set(x, "SecretArnList", js.undefined)
    
    @scala.inline
    def setSecretArnListVarargs(value: string*): Self = StObject.set(x, "SecretArnList", js.Array(value :_*))
  }
}
