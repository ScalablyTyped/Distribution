package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetIntentsResponse extends js.Object {
  
  /**
    * An array of Intent objects. For more information, see PutBot.
    */
  var intents: js.UndefOr[IntentMetadataList] = js.native
  
  /**
    * If the response is truncated, the response includes a pagination token that you can specify in your next request to fetch the next page of intents. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object GetIntentsResponse {
  
  @scala.inline
  def apply(): GetIntentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIntentsResponse]
  }
  
  @scala.inline
  implicit class GetIntentsResponseOps[Self <: GetIntentsResponse] (val x: Self) extends AnyVal {
    
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
