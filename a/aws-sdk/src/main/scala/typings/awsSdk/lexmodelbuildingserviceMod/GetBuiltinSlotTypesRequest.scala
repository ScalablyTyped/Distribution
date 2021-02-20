package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBuiltinSlotTypesRequest extends StObject {
  
  /**
    * A list of locales that the slot type supports.
    */
  var locale: js.UndefOr[Locale] = js.native
  
  /**
    * The maximum number of slot types to return in the response. The default is 10.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    * A pagination token that fetches the next page of slot types. If the response to this API call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of slot types, specify the pagination token in the next request.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * Substring to match in built-in slot type signatures. A slot type will be returned if any part of its signature matches the substring. For example, "xyz" matches both "xyzabc" and "abcxyz."
    */
  var signatureContains: js.UndefOr[String] = js.native
}
object GetBuiltinSlotTypesRequest {
  
  @scala.inline
  def apply(): GetBuiltinSlotTypesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBuiltinSlotTypesRequest]
  }
  
  @scala.inline
  implicit class GetBuiltinSlotTypesRequestMutableBuilder[Self <: GetBuiltinSlotTypesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSignatureContains(value: String): Self = StObject.set(x, "signatureContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureContainsUndefined: Self = StObject.set(x, "signatureContains", js.undefined)
  }
}
