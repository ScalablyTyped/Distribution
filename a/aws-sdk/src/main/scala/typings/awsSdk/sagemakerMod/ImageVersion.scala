package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageVersion extends js.Object {
  
  /**
    * When the version was created.
    */
  var CreationTime: Timestamp = js.native
  
  /**
    * When a create or delete operation fails, the reason for the failure.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.sagemakerMod.FailureReason] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the image the version is based on.
    */
  var ImageArn: typings.awsSdk.sagemakerMod.ImageArn = js.native
  
  /**
    * The ARN of the version.
    */
  var ImageVersionArn: typings.awsSdk.sagemakerMod.ImageVersionArn = js.native
  
  /**
    * The status of the version.
    */
  var ImageVersionStatus: typings.awsSdk.sagemakerMod.ImageVersionStatus = js.native
  
  /**
    * When the version was last modified.
    */
  var LastModifiedTime: Timestamp = js.native
  
  /**
    * The version number.
    */
  var Version: ImageVersionNumber = js.native
}
object ImageVersion {
  
  @scala.inline
  def apply(
    CreationTime: Timestamp,
    ImageArn: ImageArn,
    ImageVersionArn: ImageVersionArn,
    ImageVersionStatus: ImageVersionStatus,
    LastModifiedTime: Timestamp,
    Version: ImageVersionNumber
  ): ImageVersion = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], ImageArn = ImageArn.asInstanceOf[js.Any], ImageVersionArn = ImageVersionArn.asInstanceOf[js.Any], ImageVersionStatus = ImageVersionStatus.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageVersion]
  }
  
  @scala.inline
  implicit class ImageVersionOps[Self <: ImageVersion] (val x: Self) extends AnyVal {
    
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
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageArn(value: ImageArn): Self = this.set("ImageArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageVersionArn(value: ImageVersionArn): Self = this.set("ImageVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageVersionStatus(value: ImageVersionStatus): Self = this.set("ImageVersionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTime(value: Timestamp): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: ImageVersionNumber): Self = this.set("Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = this.set("FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureReason: Self = this.set("FailureReason", js.undefined)
  }
}
