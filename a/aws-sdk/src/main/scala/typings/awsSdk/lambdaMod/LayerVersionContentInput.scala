package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerVersionContentInput extends js.Object {
  /**
    * The Amazon S3 bucket of the layer archive.
    */
  var S3Bucket: js.UndefOr[typings.awsSdk.lambdaMod.S3Bucket] = js.native
  /**
    * The Amazon S3 key of the layer archive.
    */
  var S3Key: js.UndefOr[typings.awsSdk.lambdaMod.S3Key] = js.native
  /**
    * For versioned objects, the version of the layer archive object to use.
    */
  var S3ObjectVersion: js.UndefOr[typings.awsSdk.lambdaMod.S3ObjectVersion] = js.native
  /**
    * The base64-encoded contents of the layer archive. AWS SDK and AWS CLI clients handle the encoding for you.
    */
  var ZipFile: js.UndefOr[_Blob] = js.native
}

object LayerVersionContentInput {
  @scala.inline
  def apply(
    S3Bucket: S3Bucket = null,
    S3Key: S3Key = null,
    S3ObjectVersion: S3ObjectVersion = null,
    ZipFile: _Blob = null
  ): LayerVersionContentInput = {
    val __obj = js.Dynamic.literal()
    if (S3Bucket != null) __obj.updateDynamic("S3Bucket")(S3Bucket.asInstanceOf[js.Any])
    if (S3Key != null) __obj.updateDynamic("S3Key")(S3Key.asInstanceOf[js.Any])
    if (S3ObjectVersion != null) __obj.updateDynamic("S3ObjectVersion")(S3ObjectVersion.asInstanceOf[js.Any])
    if (ZipFile != null) __obj.updateDynamic("ZipFile")(ZipFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerVersionContentInput]
  }
}

