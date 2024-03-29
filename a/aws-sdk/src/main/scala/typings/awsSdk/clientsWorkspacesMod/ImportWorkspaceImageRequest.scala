package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportWorkspaceImageRequest extends StObject {
  
  /**
    * If specified, the version of Microsoft Office to subscribe to. Valid only for Windows 10 and 11 BYOL images. For more information about subscribing to Office for BYOL images, see  Bring Your Own Windows Desktop Licenses.    Although this parameter is an array, only one item is allowed at this time.   Windows 11 only supports Microsoft_Office_2019.   
    */
  var Applications: js.UndefOr[ApplicationList] = js.undefined
  
  /**
    * The identifier of the EC2 image.
    */
  var Ec2ImageId: typings.awsSdk.clientsWorkspacesMod.Ec2ImageId
  
  /**
    * The description of the WorkSpace image.
    */
  var ImageDescription: WorkspaceImageDescription
  
  /**
    * The name of the WorkSpace image.
    */
  var ImageName: WorkspaceImageName
  
  /**
    * The ingestion process to be used when importing the image, depending on which protocol you want to use for your BYOL Workspace image, either PCoIP, WorkSpaces Streaming Protocol (WSP), or bring your own protocol (BYOP). To use WSP, specify a value that ends in _WSP. To use PCoIP, specify a value that does not end in _WSP. To use BYOP, specify a value that ends in _BYOP. For non-GPU-enabled bundles (bundles other than Graphics or GraphicsPro), specify BYOL_REGULAR, BYOL_REGULAR_WSP, or BYOL_REGULAR_BYOP, depending on the protocol.  The BYOL_REGULAR_BYOP and BYOL_GRAPHICS_G4DN_BYOP values are only supported by Amazon WorkSpaces Core. Contact your account team to be allow-listed to use these values. For more information, see Amazon WorkSpaces Core. 
    */
  var IngestionProcess: WorkspaceImageIngestionProcess
  
  /**
    * The tags. Each WorkSpaces resource can have a maximum of 50 tags.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object ImportWorkspaceImageRequest {
  
  inline def apply(
    Ec2ImageId: Ec2ImageId,
    ImageDescription: WorkspaceImageDescription,
    ImageName: WorkspaceImageName,
    IngestionProcess: WorkspaceImageIngestionProcess
  ): ImportWorkspaceImageRequest = {
    val __obj = js.Dynamic.literal(Ec2ImageId = Ec2ImageId.asInstanceOf[js.Any], ImageDescription = ImageDescription.asInstanceOf[js.Any], ImageName = ImageName.asInstanceOf[js.Any], IngestionProcess = IngestionProcess.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportWorkspaceImageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportWorkspaceImageRequest] (val x: Self) extends AnyVal {
    
    inline def setApplications(value: ApplicationList): Self = StObject.set(x, "Applications", value.asInstanceOf[js.Any])
    
    inline def setApplicationsUndefined: Self = StObject.set(x, "Applications", js.undefined)
    
    inline def setApplicationsVarargs(value: Application*): Self = StObject.set(x, "Applications", js.Array(value*))
    
    inline def setEc2ImageId(value: Ec2ImageId): Self = StObject.set(x, "Ec2ImageId", value.asInstanceOf[js.Any])
    
    inline def setImageDescription(value: WorkspaceImageDescription): Self = StObject.set(x, "ImageDescription", value.asInstanceOf[js.Any])
    
    inline def setImageName(value: WorkspaceImageName): Self = StObject.set(x, "ImageName", value.asInstanceOf[js.Any])
    
    inline def setIngestionProcess(value: WorkspaceImageIngestionProcess): Self = StObject.set(x, "IngestionProcess", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
