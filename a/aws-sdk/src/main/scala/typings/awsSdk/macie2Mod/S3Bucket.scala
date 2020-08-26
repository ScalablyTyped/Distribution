package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Bucket extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the bucket.
    */
  var arn: js.UndefOr[string] = js.native
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the bucket was created.
    */
  var createdAt: js.UndefOr[timestampIso8601] = js.native
  /**
    * The server-side encryption settings for the bucket.
    */
  var defaultServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.native
  /**
    * The name of the bucket.
    */
  var name: js.UndefOr[string] = js.native
  /**
    * The display name and account identifier for the user who owns the bucket.
    */
  var owner: js.UndefOr[S3BucketOwner] = js.native
  /**
    * The permissions settings that determine whether the bucket is publicly accessible.
    */
  var publicAccess: js.UndefOr[BucketPublicAccess] = js.native
  /**
    * The tags that are associated with the bucket.
    */
  var tags: js.UndefOr[KeyValuePairList] = js.native
}

object S3Bucket {
  @scala.inline
  def apply(): S3Bucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Bucket]
  }
  @scala.inline
  implicit class S3BucketOps[Self <: S3Bucket] (val x: Self) extends AnyVal {
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
    def setArn(value: string): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setCreatedAt(value: timestampIso8601): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    @scala.inline
    def setDefaultServerSideEncryption(value: ServerSideEncryption): Self = this.set("defaultServerSideEncryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultServerSideEncryption: Self = this.set("defaultServerSideEncryption", js.undefined)
    @scala.inline
    def setName(value: string): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOwner(value: S3BucketOwner): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setPublicAccess(value: BucketPublicAccess): Self = this.set("publicAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicAccess: Self = this.set("publicAccess", js.undefined)
    @scala.inline
    def setTagsVarargs(value: KeyValuePair*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: KeyValuePairList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

