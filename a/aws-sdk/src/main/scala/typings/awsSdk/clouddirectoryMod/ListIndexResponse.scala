package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIndexResponse extends StObject {
  
  /**
    * The objects and indexed values attached to the index.
    */
  var IndexAttachments: js.UndefOr[IndexAttachmentList] = js.undefined
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.undefined
}
object ListIndexResponse {
  
  @scala.inline
  def apply(): ListIndexResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIndexResponse]
  }
  
  @scala.inline
  implicit class ListIndexResponseMutableBuilder[Self <: ListIndexResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexAttachments(value: IndexAttachmentList): Self = StObject.set(x, "IndexAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexAttachmentsUndefined: Self = StObject.set(x, "IndexAttachments", js.undefined)
    
    @scala.inline
    def setIndexAttachmentsVarargs(value: IndexAttachment*): Self = StObject.set(x, "IndexAttachments", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
