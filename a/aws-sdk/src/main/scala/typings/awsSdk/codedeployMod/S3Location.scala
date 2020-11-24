package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3Location extends js.Object {
  
  /**
    * The name of the Amazon S3 bucket where the application revision is stored.
    */
  var bucket: js.UndefOr[S3Bucket] = js.native
  
  /**
    * The file type of the application revision. Must be one of the following:    tar: A tar archive file.    tgz: A compressed tar archive file.    zip: A zip archive file.  
    */
  var bundleType: js.UndefOr[BundleType] = js.native
  
  /**
    * The ETag of the Amazon S3 object that represents the bundled artifacts for the application revision. If the ETag is not specified as an input parameter, ETag validation of the object is skipped.
    */
  var eTag: js.UndefOr[ETag] = js.native
  
  /**
    * The name of the Amazon S3 object that represents the bundled artifacts for the application revision.
    */
  var key: js.UndefOr[S3Key] = js.native
  
  /**
    * A specific version of the Amazon S3 object that represents the bundled artifacts for the application revision. If the version is not specified, the system uses the most recent version by default.
    */
  var version: js.UndefOr[VersionId] = js.native
}
object S3Location {
  
  @scala.inline
  def apply(): S3Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Location]
  }
  
  @scala.inline
  implicit class S3LocationOps[Self <: S3Location] (val x: Self) extends AnyVal {
    
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
    def setBucket(value: S3Bucket): Self = this.set("bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucket: Self = this.set("bucket", js.undefined)
    
    @scala.inline
    def setBundleType(value: BundleType): Self = this.set("bundleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBundleType: Self = this.set("bundleType", js.undefined)
    
    @scala.inline
    def setETag(value: ETag): Self = this.set("eTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteETag: Self = this.set("eTag", js.undefined)
    
    @scala.inline
    def setKey(value: S3Key): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setVersion(value: VersionId): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
