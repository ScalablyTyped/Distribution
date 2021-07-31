package typings.awsSdk.lexruntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseCard extends StObject {
  
  /**
    * The content type of the response.
    */
  var contentType: js.UndefOr[ContentType] = js.undefined
  
  /**
    * An array of attachment objects representing options.
    */
  var genericAttachments: js.UndefOr[genericAttachmentList] = js.undefined
  
  /**
    * The version of the response card format.
    */
  var version: js.UndefOr[String] = js.undefined
}
object ResponseCard {
  
  @scala.inline
  def apply(): ResponseCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseCard]
  }
  
  @scala.inline
  implicit class ResponseCardMutableBuilder[Self <: ResponseCard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: ContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setGenericAttachments(value: genericAttachmentList): Self = StObject.set(x, "genericAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenericAttachmentsUndefined: Self = StObject.set(x, "genericAttachments", js.undefined)
    
    @scala.inline
    def setGenericAttachmentsVarargs(value: GenericAttachment*): Self = StObject.set(x, "genericAttachments", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
