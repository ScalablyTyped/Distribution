package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsExportDestination extends js.Object {
  /**
    * A destination signifying output to an S3 bucket.
    */
  var S3BucketDestination: AnalyticsS3BucketDestination = js.native
}

object AnalyticsExportDestination {
  @scala.inline
  def apply(S3BucketDestination: AnalyticsS3BucketDestination): AnalyticsExportDestination = {
    val __obj = js.Dynamic.literal(S3BucketDestination = S3BucketDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsExportDestination]
  }
  @scala.inline
  implicit class AnalyticsExportDestinationOps[Self <: AnalyticsExportDestination] (val x: Self) extends AnyVal {
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
    def setS3BucketDestination(value: AnalyticsS3BucketDestination): Self = this.set("S3BucketDestination", value.asInstanceOf[js.Any])
  }
  
}

