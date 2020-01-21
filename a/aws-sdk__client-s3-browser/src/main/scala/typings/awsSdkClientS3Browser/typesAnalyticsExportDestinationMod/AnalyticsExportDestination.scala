package typings.awsSdkClientS3Browser.typesAnalyticsExportDestinationMod

import typings.awsSdkClientS3Browser.typesAnalyticsS3BucketDestinationMod.AnalyticsS3BucketDestination
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsExportDestination extends js.Object {
  /**
    * <p>A destination signifying output to an S3 bucket.</p>
    */
  var S3BucketDestination: AnalyticsS3BucketDestination
}

object AnalyticsExportDestination {
  @scala.inline
  def apply(S3BucketDestination: AnalyticsS3BucketDestination): AnalyticsExportDestination = {
    val __obj = js.Dynamic.literal(S3BucketDestination = S3BucketDestination.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnalyticsExportDestination]
  }
}

