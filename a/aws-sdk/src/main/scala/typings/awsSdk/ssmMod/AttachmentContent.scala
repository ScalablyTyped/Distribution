package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachmentContent extends StObject {
  
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
  implicit class AttachmentContentMutableBuilder[Self <: AttachmentContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHash(value: AttachmentHash): Self = StObject.set(x, "Hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashType(value: AttachmentHashType): Self = StObject.set(x, "HashType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashTypeUndefined: Self = StObject.set(x, "HashType", js.undefined)
    
    @scala.inline
    def setHashUndefined: Self = StObject.set(x, "Hash", js.undefined)
    
    @scala.inline
    def setName(value: AttachmentName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setSize(value: ContentLength): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
    
    @scala.inline
    def setUrl(value: AttachmentUrl): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
