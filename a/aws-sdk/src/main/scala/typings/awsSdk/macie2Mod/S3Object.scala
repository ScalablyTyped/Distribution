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
  def apply(): S3Object = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Object]
  }
  @scala.inline
  implicit class S3ObjectOps[Self <: S3Object] (val x: Self) extends AnyVal {
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
    def setBucketArn(value: string): Self = this.set("bucketArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucketArn: Self = this.set("bucketArn", js.undefined)
    @scala.inline
    def setETag(value: string): Self = this.set("eTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteETag: Self = this.set("eTag", js.undefined)
    @scala.inline
    def setExtension(value: string): Self = this.set("extension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
    @scala.inline
    def setKey(value: string): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLastModified(value: timestampIso8601): Self = this.set("lastModified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModified: Self = this.set("lastModified", js.undefined)
    @scala.inline
    def setPath(value: string): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPublicAccess(value: boolean): Self = this.set("publicAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicAccess: Self = this.set("publicAccess", js.undefined)
    @scala.inline
    def setServerSideEncryption(value: ServerSideEncryption): Self = this.set("serverSideEncryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerSideEncryption: Self = this.set("serverSideEncryption", js.undefined)
    @scala.inline
    def setSize(value: long): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStorageClass(value: StorageClass): Self = this.set("storageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageClass: Self = this.set("storageClass", js.undefined)
    @scala.inline
    def setTagsVarargs(value: KeyValuePair*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: KeyValuePairList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setVersionId(value: string): Self = this.set("versionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionId: Self = this.set("versionId", js.undefined)
  }
  
}

