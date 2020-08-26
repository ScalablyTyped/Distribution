package typings.awsSdkClientS3Browser.typesAnalyticsExportDestinationMod

import typings.awsSdkClientS3Browser.typesAnalyticsS3BucketDestinationMod.UnmarshalledAnalyticsS3BucketDestination
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledAnalyticsExportDestination extends AnalyticsExportDestination {
  /**
    * <p>A destination signifying output to an S3 bucket.</p>
    */
  @JSName("S3BucketDestination")
  var S3BucketDestination_UnmarshalledAnalyticsExportDestination: UnmarshalledAnalyticsS3BucketDestination = js.native
}

object UnmarshalledAnalyticsExportDestination {
  @scala.inline
  def apply(S3BucketDestination: UnmarshalledAnalyticsS3BucketDestination): UnmarshalledAnalyticsExportDestination = {
    val __obj = js.Dynamic.literal(S3BucketDestination = S3BucketDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledAnalyticsExportDestination]
  }
  @scala.inline
  implicit class UnmarshalledAnalyticsExportDestinationOps[Self <: UnmarshalledAnalyticsExportDestination] (val x: Self) extends AnyVal {
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
    def setS3BucketDestination(value: UnmarshalledAnalyticsS3BucketDestination): Self = this.set("S3BucketDestination", value.asInstanceOf[js.Any])
  }
  
}

