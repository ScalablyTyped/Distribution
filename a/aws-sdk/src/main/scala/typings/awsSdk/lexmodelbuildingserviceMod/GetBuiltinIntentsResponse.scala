package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBuiltinIntentsResponse extends StObject {
  
  /**
    * An array of builtinIntentMetadata objects, one for each intent in the response.
    */
  var intents: js.UndefOr[BuiltinIntentMetadataList] = js.undefined
  
  /**
    * A pagination token that fetches the next page of intents. If the response to this API call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of intents, specify the pagination token in the next request.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object GetBuiltinIntentsResponse {
  
  @scala.inline
  def apply(): GetBuiltinIntentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBuiltinIntentsResponse]
  }
  
  @scala.inline
  implicit class GetBuiltinIntentsResponseMutableBuilder[Self <: GetBuiltinIntentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntents(value: BuiltinIntentMetadataList): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
    
    @scala.inline
    def setIntentsVarargs(value: BuiltinIntentMetadata*): Self = StObject.set(x, "intents", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
