package typings.awsSdk.lexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseCard extends js.Object {
  
  /**
    * The content type of the response.
    */
  var contentType: js.UndefOr[ContentType] = js.native
  
  /**
    * An array of attachment objects representing options.
    */
  var genericAttachments: js.UndefOr[genericAttachmentList] = js.native
  
  /**
    * The version of the response card format.
    */
  var version: js.UndefOr[String] = js.native
}
object ResponseCard {
  
  @scala.inline
  def apply(): ResponseCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseCard]
  }
  
  @scala.inline
  implicit class ResponseCardOps[Self <: ResponseCard] (val x: Self) extends AnyVal {
    
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
    def setContentType(value: ContentType): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setGenericAttachmentsVarargs(value: GenericAttachment*): Self = this.set("genericAttachments", js.Array(value :_*))
    
    @scala.inline
    def setGenericAttachments(value: genericAttachmentList): Self = this.set("genericAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenericAttachments: Self = this.set("genericAttachments", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
