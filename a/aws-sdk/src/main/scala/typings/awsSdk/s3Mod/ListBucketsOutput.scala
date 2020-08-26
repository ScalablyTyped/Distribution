package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBucketsOutput extends js.Object {
  /**
    * The list of buckets owned by the requestor.
    */
  var Buckets: js.UndefOr[typings.awsSdk.s3Mod.Buckets] = js.native
  /**
    * The owner of the buckets listed.
    */
  var Owner: js.UndefOr[typings.awsSdk.s3Mod.Owner] = js.native
}

object ListBucketsOutput {
  @scala.inline
  def apply(): ListBucketsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBucketsOutput]
  }
  @scala.inline
  implicit class ListBucketsOutputOps[Self <: ListBucketsOutput] (val x: Self) extends AnyVal {
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
    def setBucketsVarargs(value: Bucket*): Self = this.set("Buckets", js.Array(value :_*))
    @scala.inline
    def setBuckets(value: Buckets): Self = this.set("Buckets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuckets: Self = this.set("Buckets", js.undefined)
    @scala.inline
    def setOwner(value: Owner): Self = this.set("Owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("Owner", js.undefined)
  }
  
}

