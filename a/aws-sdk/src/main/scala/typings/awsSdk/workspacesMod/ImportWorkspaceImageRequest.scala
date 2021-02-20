package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportWorkspaceImageRequest extends StObject {
  
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
  implicit class ImportWorkspaceImageRequestMutableBuilder[Self <: ImportWorkspaceImageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplications(value: ApplicationList): Self = StObject.set(x, "Applications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationsUndefined: Self = StObject.set(x, "Applications", js.undefined)
    
    @scala.inline
    def setApplicationsVarargs(value: Application*): Self = StObject.set(x, "Applications", js.Array(value :_*))
    
    @scala.inline
    def setEc2ImageId(value: Ec2ImageId): Self = StObject.set(x, "Ec2ImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageDescription(value: WorkspaceImageDescription): Self = StObject.set(x, "ImageDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageName(value: WorkspaceImageName): Self = StObject.set(x, "ImageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngestionProcess(value: WorkspaceImageIngestionProcess): Self = StObject.set(x, "IngestionProcess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
