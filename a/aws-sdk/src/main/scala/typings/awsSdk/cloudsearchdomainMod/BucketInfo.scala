package typings.awsSdk.cloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketInfo extends js.Object {
  /**
    * A list of the calculated facet values and counts.
    */
  var buckets: js.UndefOr[BucketList] = js.native
}

object BucketInfo {
  @scala.inline
  def apply(): BucketInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketInfo]
  }
  @scala.inline
  implicit class BucketInfoOps[Self <: BucketInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBucketsVarargs(value: Bucket*): Self = this.set("buckets", js.Array(value :_*))
    @scala.inline
    def setBuckets(value: BucketList): Self = this.set("buckets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuckets: Self = this.set("buckets", js.undefined)
  }
  
}

