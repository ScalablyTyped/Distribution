package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateVersionsResponse extends js.Object {
  
  /**
    * An array of responses, one for each version of the message template.
    */
  var Item: ListOfTemplateVersionResponse = js.native
  
  /**
    * The message that's returned from the API for the request to retrieve information about all the versions of the message template.
    */
  var Message: js.UndefOr[string] = js.native
  
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var NextToken: js.UndefOr[string] = js.native
  
  /**
    * The unique identifier for the request to retrieve information about all the versions of the message template.
    */
  var RequestID: js.UndefOr[string] = js.native
}
object TemplateVersionsResponse {
  
  @scala.inline
  def apply(Item: ListOfTemplateVersionResponse): TemplateVersionsResponse = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateVersionsResponse]
  }
  
  @scala.inline
  implicit class TemplateVersionsResponseOps[Self <: TemplateVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setItemVarargs(value: TemplateVersionResponse*): Self = this.set("Item", js.Array(value :_*))
    
    @scala.inline
    def setItem(value: ListOfTemplateVersionResponse): Self = this.set("Item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: string): Self = this.set("Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setRequestID(value: string): Self = this.set("RequestID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestID: Self = this.set("RequestID", js.undefined)
  }
}
