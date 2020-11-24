package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FolderMetadata extends js.Object {
  
  /**
    * The time when the folder was created.
    */
  var CreatedTimestamp: js.UndefOr[TimestampType] = js.native
  
  /**
    * The ID of the creator.
    */
  var CreatorId: js.UndefOr[IdType] = js.native
  
  /**
    * The ID of the folder.
    */
  var Id: js.UndefOr[ResourceIdType] = js.native
  
  /**
    * List of labels on the folder.
    */
  var Labels: js.UndefOr[SharedLabels] = js.native
  
  /**
    * The size of the latest version of the folder metadata.
    */
  var LatestVersionSize: js.UndefOr[SizeType] = js.native
  
  /**
    * The time when the folder was updated.
    */
  var ModifiedTimestamp: js.UndefOr[TimestampType] = js.native
  
  /**
    * The name of the folder.
    */
  var Name: js.UndefOr[ResourceNameType] = js.native
  
  /**
    * The ID of the parent folder.
    */
  var ParentFolderId: js.UndefOr[ResourceIdType] = js.native
  
  /**
    * The resource state of the folder.
    */
  var ResourceState: js.UndefOr[ResourceStateType] = js.native
  
  /**
    * The unique identifier created from the subfolders and documents of the folder.
    */
  var Signature: js.UndefOr[HashType] = js.native
  
  /**
    * The size of the folder metadata.
    */
  var Size: js.UndefOr[SizeType] = js.native
}
object FolderMetadata {
  
  @scala.inline
  def apply(): FolderMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FolderMetadata]
  }
  
  @scala.inline
  implicit class FolderMetadataOps[Self <: FolderMetadata] (val x: Self) extends AnyVal {
    
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
    def setCreatedTimestamp(value: TimestampType): Self = this.set("CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTimestamp: Self = this.set("CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setCreatorId(value: IdType): Self = this.set("CreatorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatorId: Self = this.set("CreatorId", js.undefined)
    
    @scala.inline
    def setId(value: ResourceIdType): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: SharedLabel*): Self = this.set("Labels", js.Array(value :_*))
    
    @scala.inline
    def setLabels(value: SharedLabels): Self = this.set("Labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("Labels", js.undefined)
    
    @scala.inline
    def setLatestVersionSize(value: SizeType): Self = this.set("LatestVersionSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestVersionSize: Self = this.set("LatestVersionSize", js.undefined)
    
    @scala.inline
    def setModifiedTimestamp(value: TimestampType): Self = this.set("ModifiedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedTimestamp: Self = this.set("ModifiedTimestamp", js.undefined)
    
    @scala.inline
    def setName(value: ResourceNameType): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setParentFolderId(value: ResourceIdType): Self = this.set("ParentFolderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentFolderId: Self = this.set("ParentFolderId", js.undefined)
    
    @scala.inline
    def setResourceState(value: ResourceStateType): Self = this.set("ResourceState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceState: Self = this.set("ResourceState", js.undefined)
    
    @scala.inline
    def setSignature(value: HashType): Self = this.set("Signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignature: Self = this.set("Signature", js.undefined)
    
    @scala.inline
    def setSize(value: SizeType): Self = this.set("Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("Size", js.undefined)
  }
}
