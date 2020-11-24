package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachmentContent extends js.Object {
  
  /**
    * The cryptographic hash value of the document content.
    */
  var Hash: js.UndefOr[AttachmentHash] = js.native
  
  /**
    * The hash algorithm used to calculate the hash value.
    */
  var HashType: js.UndefOr[AttachmentHashType] = js.native
  
  /**
    * The name of an attachment.
    */
  var Name: js.UndefOr[AttachmentName] = js.native
  
  /**
    * The size of an attachment in bytes.
    */
  var Size: js.UndefOr[ContentLength] = js.native
  
  /**
    * The URL location of the attachment content.
    */
  var Url: js.UndefOr[AttachmentUrl] = js.native
}
object AttachmentContent {
  
  @scala.inline
  def apply(): AttachmentContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentContent]
  }
  
  @scala.inline
  implicit class AttachmentContentOps[Self <: AttachmentContent] (val x: Self) extends AnyVal {
    
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
    def setHash(value: AttachmentHash): Self = this.set("Hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHash: Self = this.set("Hash", js.undefined)
    
    @scala.inline
    def setHashType(value: AttachmentHashType): Self = this.set("HashType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashType: Self = this.set("HashType", js.undefined)
    
    @scala.inline
    def setName(value: AttachmentName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setSize(value: ContentLength): Self = this.set("Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("Size", js.undefined)
    
    @scala.inline
    def setUrl(value: AttachmentUrl): Self = this.set("Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("Url", js.undefined)
  }
}
