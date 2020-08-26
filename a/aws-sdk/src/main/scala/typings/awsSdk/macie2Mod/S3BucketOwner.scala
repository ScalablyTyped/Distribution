package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3BucketOwner extends js.Object {
  /**
    * The display name of the user who owns the bucket.
    */
  var displayName: js.UndefOr[string] = js.native
  /**
    * The AWS account ID for the user who owns the bucket.
    */
  var id: js.UndefOr[string] = js.native
}

object S3BucketOwner {
  @scala.inline
  def apply(): S3BucketOwner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3BucketOwner]
  }
  @scala.inline
  implicit class S3BucketOwnerOps[Self <: S3BucketOwner] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: string): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setId(value: string): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

