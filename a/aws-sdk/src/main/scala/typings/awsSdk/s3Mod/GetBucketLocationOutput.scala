package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketLocationOutput extends js.Object {
  /**
    * Specifies the Region where the bucket resides. For a list of all the Amazon S3 supported location constraints by Region, see Regions and Endpoints. Buckets in Region us-east-1 have a LocationConstraint of null.
    */
  var LocationConstraint: js.UndefOr[BucketLocationConstraint] = js.native
}

object GetBucketLocationOutput {
  @scala.inline
  def apply(): GetBucketLocationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketLocationOutput]
  }
  @scala.inline
  implicit class GetBucketLocationOutputOps[Self <: GetBucketLocationOutput] (val x: Self) extends AnyVal {
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
    def setLocationConstraint(value: BucketLocationConstraint): Self = this.set("LocationConstraint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationConstraint: Self = this.set("LocationConstraint", js.undefined)
  }
  
}

