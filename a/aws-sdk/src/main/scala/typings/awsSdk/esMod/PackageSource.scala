package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PackageSource extends js.Object {
  
  /**
    * Name of the bucket containing the package.
    */
  var S3BucketName: js.UndefOr[typings.awsSdk.esMod.S3BucketName] = js.native
  
  /**
    * Key (file name) of the package.
    */
  var S3Key: js.UndefOr[typings.awsSdk.esMod.S3Key] = js.native
}
object PackageSource {
  
  @scala.inline
  def apply(): PackageSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackageSource]
  }
  
  @scala.inline
  implicit class PackageSourceOps[Self <: PackageSource] (val x: Self) extends AnyVal {
    
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
    def setS3BucketName(value: S3BucketName): Self = this.set("S3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3BucketName: Self = this.set("S3BucketName", js.undefined)
    
    @scala.inline
    def setS3Key(value: S3Key): Self = this.set("S3Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Key: Self = this.set("S3Key", js.undefined)
  }
}
