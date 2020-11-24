package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportToS3Task extends js.Object {
  
  /**
    * The container format used to combine disk images with metadata (such as OVF). If absent, only the disk image is exported.
    */
  var ContainerFormat: js.UndefOr[typings.awsSdk.ec2Mod.ContainerFormat] = js.native
  
  /**
    * The format for the exported image.
    */
  var DiskImageFormat: js.UndefOr[typings.awsSdk.ec2Mod.DiskImageFormat] = js.native
  
  /**
    * The Amazon S3 bucket for the destination image. The destination bucket must exist and grant WRITE and READ_ACP permissions to the AWS account vm-import-export@amazon.com.
    */
  var S3Bucket: js.UndefOr[String] = js.native
  
  /**
    * The encryption key for your S3 bucket.
    */
  var S3Key: js.UndefOr[String] = js.native
}
object ExportToS3Task {
  
  @scala.inline
  def apply(): ExportToS3Task = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportToS3Task]
  }
  
  @scala.inline
  implicit class ExportToS3TaskOps[Self <: ExportToS3Task] (val x: Self) extends AnyVal {
    
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
    def setContainerFormat(value: ContainerFormat): Self = this.set("ContainerFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerFormat: Self = this.set("ContainerFormat", js.undefined)
    
    @scala.inline
    def setDiskImageFormat(value: DiskImageFormat): Self = this.set("DiskImageFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskImageFormat: Self = this.set("DiskImageFormat", js.undefined)
    
    @scala.inline
    def setS3Bucket(value: String): Self = this.set("S3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Bucket: Self = this.set("S3Bucket", js.undefined)
    
    @scala.inline
    def setS3Key(value: String): Self = this.set("S3Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Key: Self = this.set("S3Key", js.undefined)
  }
}
