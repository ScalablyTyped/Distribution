package typings.awsSdk.secretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSecretsResponse extends StObject {
  
  /**
    * If present in the response, this value indicates that there's more output available than included in the current response. This can occur even when the response includes no values at all, such as when you ask for a filtered view of a very long list. Use this value in the NextToken request parameter in a subsequent call to the operation to continue processing and get the next part of the output. You should repeat this until the NextToken response element comes back empty (as null).
    */
  var NextToken: js.UndefOr[NextTokenType] = js.native
  
  /**
    * A list of the secrets in the account.
    */
  var SecretList: js.UndefOr[SecretListType] = js.native
}
object ListSecretsResponse {
  
  @scala.inline
  def apply(): ListSecretsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSecretsResponse]
  }
  
  @scala.inline
  implicit class ListSecretsResponseMutableBuilder[Self <: ListSecretsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextTokenType): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSecretList(value: SecretListType): Self = StObject.set(x, "SecretList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretListUndefined: Self = StObject.set(x, "SecretList", js.undefined)
    
    @scala.inline
    def setSecretListVarargs(value: SecretListEntry*): Self = StObject.set(x, "SecretList", js.Array(value :_*))
  }
}
