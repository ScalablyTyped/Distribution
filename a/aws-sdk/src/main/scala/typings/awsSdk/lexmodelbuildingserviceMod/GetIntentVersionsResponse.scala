package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetIntentVersionsResponse extends js.Object {
  
  /**
    * An array of IntentMetadata objects, one for each numbered version of the intent plus one for the $LATEST version.
    */
  var intents: js.UndefOr[IntentMetadataList] = js.native
  
  /**
    * A pagination token for fetching the next page of intent versions. If the response to this call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of versions, specify the pagination token in the next request. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object GetIntentVersionsResponse {
  
  @scala.inline
  def apply(): GetIntentVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIntentVersionsResponse]
  }
  
  @scala.inline
  implicit class GetIntentVersionsResponseOps[Self <: GetIntentVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIntentsVarargs(value: IntentMetadata*): Self = this.set("intents", js.Array(value :_*))
    
    @scala.inline
    def setIntents(value: IntentMetadataList): Self = this.set("intents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntents: Self = this.set("intents", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
