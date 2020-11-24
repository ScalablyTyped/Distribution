package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentVersionMetadata extends js.Object {
  
  /**
    * The timestamp when the content of the document was originally created.
    */
  var ContentCreatedTimestamp: js.UndefOr[TimestampType] = js.native
  
  /**
    * The timestamp when the content of the document was modified.
    */
  var ContentModifiedTimestamp: js.UndefOr[TimestampType] = js.native
  
  /**
    * The content type of the document.
    */
  var ContentType: js.UndefOr[DocumentContentType] = js.native
  
  /**
    * The timestamp when the document was first uploaded.
    */
  var CreatedTimestamp: js.UndefOr[TimestampType] = js.native
  
  /**
    * The ID of the creator.
    */
  var CreatorId: js.UndefOr[IdType] = js.native
  
  /**
    * The ID of the version.
    */
  var Id: js.UndefOr[DocumentVersionIdType] = js.native
  
  /**
    * The timestamp when the document was last uploaded.
    */
  var ModifiedTimestamp: js.UndefOr[TimestampType] = js.native
  
  /**
    * The name of the version.
    */
  var Name: js.UndefOr[ResourceNameType] = js.native
  
  /**
    * The signature of the document.
    */
  var Signature: js.UndefOr[HashType] = js.native
  
  /**
    * The size of the document, in bytes.
    */
  var Size: js.UndefOr[SizeType] = js.native
  
  /**
    * The source of the document.
    */
  var Source: js.UndefOr[DocumentSourceUrlMap] = js.native
  
  /**
    * The status of the document.
    */
  var Status: js.UndefOr[DocumentStatusType] = js.native
  
  /**
    * The thumbnail of the document.
    */
  var Thumbnail: js.UndefOr[DocumentThumbnailUrlMap] = js.native
}
object DocumentVersionMetadata {
  
  @scala.inline
  def apply(): DocumentVersionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentVersionMetadata]
  }
  
  @scala.inline
  implicit class DocumentVersionMetadataOps[Self <: DocumentVersionMetadata] (val x: Self) extends AnyVal {
    
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
    def setContentCreatedTimestamp(value: TimestampType): Self = this.set("ContentCreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentCreatedTimestamp: Self = this.set("ContentCreatedTimestamp", js.undefined)
    
    @scala.inline
    def setContentModifiedTimestamp(value: TimestampType): Self = this.set("ContentModifiedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentModifiedTimestamp: Self = this.set("ContentModifiedTimestamp", js.undefined)
    
    @scala.inline
    def setContentType(value: DocumentContentType): Self = this.set("ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("ContentType", js.undefined)
    
    @scala.inline
    def setCreatedTimestamp(value: TimestampType): Self = this.set("CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTimestamp: Self = this.set("CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setCreatorId(value: IdType): Self = this.set("CreatorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatorId: Self = this.set("CreatorId", js.undefined)
    
    @scala.inline
    def setId(value: DocumentVersionIdType): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setModifiedTimestamp(value: TimestampType): Self = this.set("ModifiedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedTimestamp: Self = this.set("ModifiedTimestamp", js.undefined)
    
    @scala.inline
    def setName(value: ResourceNameType): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setSignature(value: HashType): Self = this.set("Signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignature: Self = this.set("Signature", js.undefined)
    
    @scala.inline
    def setSize(value: SizeType): Self = this.set("Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("Size", js.undefined)
    
    @scala.inline
    def setSource(value: DocumentSourceUrlMap): Self = this.set("Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("Source", js.undefined)
    
    @scala.inline
    def setStatus(value: DocumentStatusType): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setThumbnail(value: DocumentThumbnailUrlMap): Self = this.set("Thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnail: Self = this.set("Thumbnail", js.undefined)
  }
}
