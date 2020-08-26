package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketCountByEffectivePermission extends js.Object {
  /**
    * The total number of buckets that allow the general public to have read or write access to the bucket.
    */
  var publiclyAccessible: js.UndefOr[long] = js.native
  /**
    * The total number of buckets that allow the general public to have read access to the bucket.
    */
  var publiclyReadable: js.UndefOr[long] = js.native
  /**
    * The total number of buckets that allow the general public to have write access to the bucket.
    */
  var publiclyWritable: js.UndefOr[long] = js.native
}

object BucketCountByEffectivePermission {
  @scala.inline
  def apply(): BucketCountByEffectivePermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketCountByEffectivePermission]
  }
  @scala.inline
  implicit class BucketCountByEffectivePermissionOps[Self <: BucketCountByEffectivePermission] (val x: Self) extends AnyVal {
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
    def setPubliclyAccessible(value: long): Self = this.set("publiclyAccessible", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePubliclyAccessible: Self = this.set("publiclyAccessible", js.undefined)
    @scala.inline
    def setPubliclyReadable(value: long): Self = this.set("publiclyReadable", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePubliclyReadable: Self = this.set("publiclyReadable", js.undefined)
    @scala.inline
    def setPubliclyWritable(value: long): Self = this.set("publiclyWritable", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePubliclyWritable: Self = this.set("publiclyWritable", js.undefined)
  }
  
}

