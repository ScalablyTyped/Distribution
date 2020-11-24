package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportInstanceRequest extends js.Object {
  
  /**
    * A description for the instance being imported.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The disk image.
    */
  var DiskImages: js.UndefOr[DiskImageList] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The launch specification.
    */
  var LaunchSpecification: js.UndefOr[ImportInstanceLaunchSpecification] = js.native
  
  /**
    * The instance operating system.
    */
  var Platform: PlatformValues = js.native
}
object ImportInstanceRequest {
  
  @scala.inline
  def apply(Platform: PlatformValues): ImportInstanceRequest = {
    val __obj = js.Dynamic.literal(Platform = Platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportInstanceRequest]
  }
  
  @scala.inline
  implicit class ImportInstanceRequestOps[Self <: ImportInstanceRequest] (val x: Self) extends AnyVal {
    
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
    def setPlatform(value: PlatformValues): Self = this.set("Platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setDiskImagesVarargs(value: DiskImage*): Self = this.set("DiskImages", js.Array(value :_*))
    
    @scala.inline
    def setDiskImages(value: DiskImageList): Self = this.set("DiskImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskImages: Self = this.set("DiskImages", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setLaunchSpecification(value: ImportInstanceLaunchSpecification): Self = this.set("LaunchSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchSpecification: Self = this.set("LaunchSpecification", js.undefined)
  }
}
