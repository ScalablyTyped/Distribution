package typings.awsSdkClientS3Node.typesAnalyticsExportDestinationMod

import typings.awsSdkClientS3Node.typesAnalyticsS3BucketDestinationMod.UnmarshalledAnalyticsS3BucketDestination
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledAnalyticsExportDestination extends AnalyticsExportDestination {
  /**
    * <p>A destination signifying output to an S3 bucket.</p>
    */
  @JSName("S3BucketDestination")
  var S3BucketDestination_UnmarshalledAnalyticsExportDestination: UnmarshalledAnalyticsS3BucketDestination
}

object UnmarshalledAnalyticsExportDestination {
  @scala.inline
  def apply(S3BucketDestination: UnmarshalledAnalyticsS3BucketDestination): UnmarshalledAnalyticsExportDestination = {
    val __obj = js.Dynamic.literal(S3BucketDestination = S3BucketDestination.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnmarshalledAnalyticsExportDestination]
  }
}

