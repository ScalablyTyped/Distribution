package typings.awsSdk.secretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSecretVersionIdsRequest extends StObject {
  
  /**
    * Specifies whether to include versions of secrets that don't have any staging labels attached to them. Versions without staging labels are considered deprecated and are subject to deletion by Secrets Manager.
    */
  var IncludeDeprecated: js.UndefOr[BooleanType] = js.undefined
  
  /**
    * The number of results to include in the response. If there are more results available, in the response, Secrets Manager includes NextToken. To get the next results, call ListSecretVersionIds again with the value from NextToken. 
    */
  var MaxResults: js.UndefOr[MaxResultsType] = js.undefined
  
  /**
    * A token that indicates where the output should continue from, if a previous call did not show all results. To get the next results, call ListSecretVersionIds again with this value.
    */
  var NextToken: js.UndefOr[NextTokenType] = js.undefined
  
  /**
    * The ARN or name of the secret whose versions you want to list. For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See Finding a secret from a partial ARN.
    */
  var SecretId: SecretIdType
}
object ListSecretVersionIdsRequest {
  
  inline def apply(SecretId: SecretIdType): ListSecretVersionIdsRequest = {
    val __obj = js.Dynamic.literal(SecretId = SecretId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSecretVersionIdsRequest]
  }
  
  extension [Self <: ListSecretVersionIdsRequest](x: Self) {
    
    inline def setIncludeDeprecated(value: BooleanType): Self = StObject.set(x, "IncludeDeprecated", value.asInstanceOf[js.Any])
    
    inline def setIncludeDeprecatedUndefined: Self = StObject.set(x, "IncludeDeprecated", js.undefined)
    
    inline def setMaxResults(value: MaxResultsType): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextTokenType): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSecretId(value: SecretIdType): Self = StObject.set(x, "SecretId", value.asInstanceOf[js.Any])
  }
}
