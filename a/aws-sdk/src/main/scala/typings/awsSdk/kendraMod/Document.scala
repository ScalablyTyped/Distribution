package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Document extends js.Object {
  
  /**
    * Information to use for user context filtering.
    */
  var AccessControlList: js.UndefOr[PrincipalList] = js.native
  
  /**
    * Custom attributes to apply to the document. Use the custom attributes to provide additional information for searching, to provide facets for refining searches, and to provide additional information in the query response.
    */
  var Attributes: js.UndefOr[DocumentAttributeList] = js.native
  
  /**
    * The contents of the document.  Documents passed to the Blob parameter must be base64 encoded. Your code might not need to encode the document file bytes if you're using an AWS SDK to call Amazon Kendra operations. If you are calling the Amazon Kendra endpoint directly using REST, you must base64 encode the contents before sending.
    */
  var Blob: js.UndefOr[_Blob] = js.native
  
  /**
    * The file type of the document in the Blob field.
    */
  var ContentType: js.UndefOr[typings.awsSdk.kendraMod.ContentType] = js.native
  
  /**
    * A unique identifier of the document in the index.
    */
  var Id: DocumentId = js.native
  
  var S3Path: js.UndefOr[typings.awsSdk.kendraMod.S3Path] = js.native
  
  /**
    * The title of the document.
    */
  var Title: js.UndefOr[typings.awsSdk.kendraMod.Title] = js.native
}
object Document {
  
  @scala.inline
  def apply(Id: DocumentId): Document = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
  
  @scala.inline
  implicit class DocumentOps[Self <: Document] (val x: Self) extends AnyVal {
    
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
    def setId(value: DocumentId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessControlListVarargs(value: Principal*): Self = this.set("AccessControlList", js.Array(value :_*))
    
    @scala.inline
    def setAccessControlList(value: PrincipalList): Self = this.set("AccessControlList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessControlList: Self = this.set("AccessControlList", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: DocumentAttribute*): Self = this.set("Attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: DocumentAttributeList): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
    
    @scala.inline
    def setBlob(value: _Blob): Self = this.set("Blob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlob: Self = this.set("Blob", js.undefined)
    
    @scala.inline
    def setContentType(value: ContentType): Self = this.set("ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("ContentType", js.undefined)
    
    @scala.inline
    def setS3Path(value: S3Path): Self = this.set("S3Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Path: Self = this.set("S3Path", js.undefined)
    
    @scala.inline
    def setTitle(value: Title): Self = this.set("Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("Title", js.undefined)
  }
}
