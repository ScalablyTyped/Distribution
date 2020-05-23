package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Object extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the bucket that contains the object.
    */
  var bucketArn: js.UndefOr[string] = js.native
  /**
    * The entity tag (ETag) that identifies the affected version of the object. If the object was overwritten or changed after Amazon Macie produced the finding, this value might be different from the current ETag for the object.
    */
  var eTag: js.UndefOr[string] = js.native
  /**
    * The file extension of the object. If the object doesn't have a file extension, this value is "".
    */
  var extension: js.UndefOr[string] = js.native
  /**
    * The full key (name) that's assigned to the object.
    */
  var key: js.UndefOr[string] = js.native
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the object was last modified.
    */
  var lastModified: js.UndefOr[timestampIso8601] = js.native
  /**
    * The path to the object, including the full key (name).
    */
  var path: js.UndefOr[string] = js.native
  /**
    * Specifies whether the object is publicly accessible due to the combination of permissions settings that apply to the object.
    */
  var publicAccess: js.UndefOr[boolean] = js.native
  /**
    * The server-side encryption settings for the object.
    */
  var serverSideEncryption: js.UndefOr[ServerSideEncryption] = js.native
  /**
    * The total storage size, in bytes, of the object.
    */
  var size: js.UndefOr[long] = js.native
  /**
    * The storage class of the object.
    */
  var storageClass: js.UndefOr[StorageClass] = js.native
  /**
    * The tags that are associated with the object.
    */
  var tags: js.UndefOr[KeyValuePairList] = js.native
  /**
    * The identifier for the affected version of the object.
    */
  var versionId: js.UndefOr[string] = js.native
}

object S3Object {
  @scala.inline
  def apply(
    bucketArn: string = null,
    eTag: string = null,
    extension: string = null,
    key: string = null,
    lastModified: timestampIso8601 = null,
    path: string = null,
    publicAccess: js.UndefOr[boolean] = js.undefined,
    serverSideEncryption: ServerSideEncryption = null,
    size: js.UndefOr[long] = js.undefined,
    storageClass: StorageClass = null,
    tags: KeyValuePairList = null,
    versionId: string = null
  ): S3Object = {
    val __obj = js.Dynamic.literal()
    if (bucketArn != null) __obj.updateDynamic("bucketArn")(bucketArn.asInstanceOf[js.Any])
    if (eTag != null) __obj.updateDynamic("eTag")(eTag.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (lastModified != null) __obj.updateDynamic("lastModified")(lastModified.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(publicAccess)) __obj.updateDynamic("publicAccess")(publicAccess.get.asInstanceOf[js.Any])
    if (serverSideEncryption != null) __obj.updateDynamic("serverSideEncryption")(serverSideEncryption.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (storageClass != null) __obj.updateDynamic("storageClass")(storageClass.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (versionId != null) __obj.updateDynamic("versionId")(versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Object]
  }
}

