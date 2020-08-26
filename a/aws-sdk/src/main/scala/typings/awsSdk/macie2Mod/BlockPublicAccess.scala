package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockPublicAccess extends js.Object {
  /**
    * Specifies whether Amazon S3 blocks public access control lists (ACLs) for the bucket and objects in the bucket.
    */
  var blockPublicAcls: js.UndefOr[boolean] = js.native
  /**
    * Specifies whether Amazon S3 blocks public bucket policies for the bucket.
    */
  var blockPublicPolicy: js.UndefOr[boolean] = js.native
  /**
    * Specifies whether Amazon S3 ignores public ACLs for the bucket and objects in the bucket.
    */
  var ignorePublicAcls: js.UndefOr[boolean] = js.native
  /**
    * Specifies whether Amazon S3 restricts public bucket policies for the bucket.
    */
  var restrictPublicBuckets: js.UndefOr[boolean] = js.native
}

object BlockPublicAccess {
  @scala.inline
  def apply(): BlockPublicAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockPublicAccess]
  }
  @scala.inline
  implicit class BlockPublicAccessOps[Self <: BlockPublicAccess] (val x: Self) extends AnyVal {
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
    def setBlockPublicAcls(value: boolean): Self = this.set("blockPublicAcls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockPublicAcls: Self = this.set("blockPublicAcls", js.undefined)
    @scala.inline
    def setBlockPublicPolicy(value: boolean): Self = this.set("blockPublicPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockPublicPolicy: Self = this.set("blockPublicPolicy", js.undefined)
    @scala.inline
    def setIgnorePublicAcls(value: boolean): Self = this.set("ignorePublicAcls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnorePublicAcls: Self = this.set("ignorePublicAcls", js.undefined)
    @scala.inline
    def setRestrictPublicBuckets(value: boolean): Self = this.set("restrictPublicBuckets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestrictPublicBuckets: Self = this.set("restrictPublicBuckets", js.undefined)
  }
  
}

