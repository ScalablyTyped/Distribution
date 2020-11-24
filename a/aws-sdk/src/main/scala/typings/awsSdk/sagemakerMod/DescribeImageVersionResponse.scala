package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeImageVersionResponse extends js.Object {
  
  /**
    * The registry path of the container image on which this image version is based.
    */
  var BaseImage: js.UndefOr[ImageBaseImage] = js.native
  
  /**
    * The registry path of the container image that contains this image version.
    */
  var ContainerImage: js.UndefOr[ImageContainerImage] = js.native
  
  /**
    * When the version was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * When a create or delete operation fails, the reason for the failure.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.sagemakerMod.FailureReason] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the image the version is based on.
    */
  var ImageArn: js.UndefOr[typings.awsSdk.sagemakerMod.ImageArn] = js.native
  
  /**
    * The ARN of the version.
    */
  var ImageVersionArn: js.UndefOr[typings.awsSdk.sagemakerMod.ImageVersionArn] = js.native
  
  /**
    * The status of the version.
    */
  var ImageVersionStatus: js.UndefOr[typings.awsSdk.sagemakerMod.ImageVersionStatus] = js.native
  
  /**
    * When the version was last modified.
    */
  var LastModifiedTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The version number.
    */
  var Version: js.UndefOr[ImageVersionNumber] = js.native
}
object DescribeImageVersionResponse {
  
  @scala.inline
  def apply(): DescribeImageVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImageVersionResponse]
  }
  
  @scala.inline
  implicit class DescribeImageVersionResponseOps[Self <: DescribeImageVersionResponse] (val x: Self) extends AnyVal {
    
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
    def setBaseImage(value: ImageBaseImage): Self = this.set("BaseImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseImage: Self = this.set("BaseImage", js.undefined)
    
    @scala.inline
    def setContainerImage(value: ImageContainerImage): Self = this.set("ContainerImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerImage: Self = this.set("ContainerImage", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = this.set("FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureReason: Self = this.set("FailureReason", js.undefined)
    
    @scala.inline
    def setImageArn(value: ImageArn): Self = this.set("ImageArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageArn: Self = this.set("ImageArn", js.undefined)
    
    @scala.inline
    def setImageVersionArn(value: ImageVersionArn): Self = this.set("ImageVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageVersionArn: Self = this.set("ImageVersionArn", js.undefined)
    
    @scala.inline
    def setImageVersionStatus(value: ImageVersionStatus): Self = this.set("ImageVersionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageVersionStatus: Self = this.set("ImageVersionStatus", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: Timestamp): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("LastModifiedTime", js.undefined)
    
    @scala.inline
    def setVersion(value: ImageVersionNumber): Self = this.set("Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
}
