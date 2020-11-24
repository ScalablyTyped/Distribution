package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportWorkspaceImageRequest extends js.Object {
  
  /**
    * If specified, the version of Microsoft Office to subscribe to. Valid only for Windows 10 BYOL images. For more information about subscribing to Office for BYOL images, see  Bring Your Own Windows Desktop Licenses.  Although this parameter is an array, only one item is allowed at this time. 
    */
  var Applications: js.UndefOr[ApplicationList] = js.native
  
  /**
    * The identifier of the EC2 image.
    */
  var Ec2ImageId: typings.awsSdk.workspacesMod.Ec2ImageId = js.native
  
  /**
    * The description of the WorkSpace image.
    */
  var ImageDescription: WorkspaceImageDescription = js.native
  
  /**
    * The name of the WorkSpace image.
    */
  var ImageName: WorkspaceImageName = js.native
  
  /**
    * The ingestion process to be used when importing the image. For non-GPU-enabled bundles (bundles other than Graphics or GraphicsPro), specify BYOL_REGULAR.
    */
  var IngestionProcess: WorkspaceImageIngestionProcess = js.native
  
  /**
    * The tags. Each WorkSpaces resource can have a maximum of 50 tags.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object ImportWorkspaceImageRequest {
  
  @scala.inline
  def apply(
    Ec2ImageId: Ec2ImageId,
    ImageDescription: WorkspaceImageDescription,
    ImageName: WorkspaceImageName,
    IngestionProcess: WorkspaceImageIngestionProcess
  ): ImportWorkspaceImageRequest = {
    val __obj = js.Dynamic.literal(Ec2ImageId = Ec2ImageId.asInstanceOf[js.Any], ImageDescription = ImageDescription.asInstanceOf[js.Any], ImageName = ImageName.asInstanceOf[js.Any], IngestionProcess = IngestionProcess.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportWorkspaceImageRequest]
  }
  
  @scala.inline
  implicit class ImportWorkspaceImageRequestOps[Self <: ImportWorkspaceImageRequest] (val x: Self) extends AnyVal {
    
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
    def setEc2ImageId(value: Ec2ImageId): Self = this.set("Ec2ImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageDescription(value: WorkspaceImageDescription): Self = this.set("ImageDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageName(value: WorkspaceImageName): Self = this.set("ImageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngestionProcess(value: WorkspaceImageIngestionProcess): Self = this.set("IngestionProcess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationsVarargs(value: Application*): Self = this.set("Applications", js.Array(value :_*))
    
    @scala.inline
    def setApplications(value: ApplicationList): Self = this.set("Applications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplications: Self = this.set("Applications", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
