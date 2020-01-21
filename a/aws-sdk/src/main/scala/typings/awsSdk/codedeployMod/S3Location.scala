package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Location extends js.Object {
  /**
    * The name of the Amazon S3 bucket where the application revision is stored.
    */
  var bucket: js.UndefOr[S3Bucket] = js.native
  /**
    * The file type of the application revision. Must be one of the following:   tar: A tar archive file.   tgz: A compressed tar archive file.   zip: A zip archive file.  
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
  def apply(
    bucket: S3Bucket = null,
    bundleType: BundleType = null,
    eTag: ETag = null,
    key: S3Key = null,
    version: VersionId = null
  ): S3Location = {
    val __obj = js.Dynamic.literal()
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (bundleType != null) __obj.updateDynamic("bundleType")(bundleType.asInstanceOf[js.Any])
    if (eTag != null) __obj.updateDynamic("eTag")(eTag.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Location]
  }
}

