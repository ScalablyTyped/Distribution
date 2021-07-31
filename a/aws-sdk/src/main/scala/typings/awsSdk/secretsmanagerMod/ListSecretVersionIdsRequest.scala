package typings.awsSdk.secretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSecretVersionIdsRequest extends StObject {
  
  /**
    * (Optional) Specifies that you want the results to include versions that do not have any staging labels attached to them. Such versions are considered deprecated and are subject to deletion by Secrets Manager as needed.
    */
  var IncludeDeprecated: js.UndefOr[BooleanType] = js.undefined
  
  /**
    * (Optional) Limits the number of results you want to include in the response. If you don't include this parameter, it defaults to a value that's specific to the operation. If additional items exist beyond the maximum you specify, the NextToken response element is present and has a value (isn't null). Include that value as the NextToken request parameter in the next call to the operation to get the next part of the results. Note that Secrets Manager might return fewer results than the maximum even when there are more results available. You should check NextToken after every operation to ensure that you receive all of the results.
    */
  var MaxResults: js.UndefOr[MaxResultsType] = js.undefined
  
  /**
    * (Optional) Use this parameter in a request if you receive a NextToken response in a previous request indicating there's more output available. In a subsequent call, set it to the value of the previous call NextToken response to indicate where the output should continue from.
    */
  var NextToken: js.UndefOr[NextTokenType] = js.undefined
  
  /**
    * The identifier for the secret containing the versions you want to list. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.  If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters. If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you must not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a ResourceNotFoundException or an AccessDeniedException error, depending on your permissions. 
    */
  var SecretId: SecretIdType
}
object ListSecretVersionIdsRequest {
  
  @scala.inline
  def apply(SecretId: SecretIdType): ListSecretVersionIdsRequest = {
    val __obj = js.Dynamic.literal(SecretId = SecretId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSecretVersionIdsRequest]
  }
  
  @scala.inline
  implicit class ListSecretVersionIdsRequestMutableBuilder[Self <: ListSecretVersionIdsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeDeprecated(value: BooleanType): Self = StObject.set(x, "IncludeDeprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDeprecatedUndefined: Self = StObject.set(x, "IncludeDeprecated", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResultsType): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextTokenType): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSecretId(value: SecretIdType): Self = StObject.set(x, "SecretId", value.asInstanceOf[js.Any])
  }
}
