package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListIndexResponse extends js.Object {
  
  /**
    * The objects and indexed values attached to the index.
    */
  var IndexAttachments: js.UndefOr[IndexAttachmentList] = js.native
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.native
}
object ListIndexResponse {
  
  @scala.inline
  def apply(): ListIndexResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIndexResponse]
  }
  
  @scala.inline
  implicit class ListIndexResponseOps[Self <: ListIndexResponse] (val x: Self) extends AnyVal {
    
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
    def setIndexAttachmentsVarargs(value: IndexAttachment*): Self = this.set("IndexAttachments", js.Array(value :_*))
    
    @scala.inline
    def setIndexAttachments(value: IndexAttachmentList): Self = this.set("IndexAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexAttachments: Self = this.set("IndexAttachments", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
