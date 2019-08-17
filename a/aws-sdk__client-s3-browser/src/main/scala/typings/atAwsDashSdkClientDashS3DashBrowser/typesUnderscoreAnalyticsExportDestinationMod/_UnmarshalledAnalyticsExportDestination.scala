package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreAnalyticsExportDestinationMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreAnalyticsS3BucketDestinationMod._UnmarshalledAnalyticsS3BucketDestination
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledAnalyticsExportDestination extends _AnalyticsExportDestination {
  /**
    * <p>A destination signifying output to an S3 bucket.</p>
    */
  @JSName("S3BucketDestination")
  var S3BucketDestination__UnmarshalledAnalyticsExportDestination: _UnmarshalledAnalyticsS3BucketDestination
}

object _UnmarshalledAnalyticsExportDestination {
  @scala.inline
  def apply(S3BucketDestination: _UnmarshalledAnalyticsS3BucketDestination): _UnmarshalledAnalyticsExportDestination = {
    val __obj = js.Dynamic.literal(S3BucketDestination = S3BucketDestination)
  
    __obj.asInstanceOf[_UnmarshalledAnalyticsExportDestination]
  }
}

