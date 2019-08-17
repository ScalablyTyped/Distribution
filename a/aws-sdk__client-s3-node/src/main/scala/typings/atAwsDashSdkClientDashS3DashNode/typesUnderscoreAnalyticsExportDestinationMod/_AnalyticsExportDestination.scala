package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreAnalyticsExportDestinationMod

import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreAnalyticsS3BucketDestinationMod._AnalyticsS3BucketDestination
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _AnalyticsExportDestination extends js.Object {
  /**
    * <p>A destination signifying output to an S3 bucket.</p>
    */
  var S3BucketDestination: _AnalyticsS3BucketDestination
}

object _AnalyticsExportDestination {
  @scala.inline
  def apply(S3BucketDestination: _AnalyticsS3BucketDestination): _AnalyticsExportDestination = {
    val __obj = js.Dynamic.literal(S3BucketDestination = S3BucketDestination)
  
    __obj.asInstanceOf[_AnalyticsExportDestination]
  }
}

