package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3Location extends StObject {
  
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
  implicit class S3LocationMutableBuilder[Self <: S3Location] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: S3Bucket): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    @scala.inline
    def setBundleType(value: BundleType): Self = StObject.set(x, "bundleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleTypeUndefined: Self = StObject.set(x, "bundleType", js.undefined)
    
    @scala.inline
    def setETag(value: ETag): Self = StObject.set(x, "eTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETagUndefined: Self = StObject.set(x, "eTag", js.undefined)
    
    @scala.inline
    def setKey(value: S3Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setVersion(value: VersionId): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
