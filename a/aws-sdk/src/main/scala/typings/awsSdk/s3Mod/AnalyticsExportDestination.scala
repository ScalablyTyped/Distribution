package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsExportDestination extends StObject {
  
  /**
    * A destination signifying output to an S3 bucket.
    */
  var S3BucketDestination: AnalyticsS3BucketDestination
}
object AnalyticsExportDestination {
  
  @scala.inline
  def apply(S3BucketDestination: AnalyticsS3BucketDestination): AnalyticsExportDestination = {
    val __obj = js.Dynamic.literal(S3BucketDestination = S3BucketDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsExportDestination]
  }
  
  @scala.inline
  implicit class AnalyticsExportDestinationMutableBuilder[Self <: AnalyticsExportDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3BucketDestination(value: AnalyticsS3BucketDestination): Self = StObject.set(x, "S3BucketDestination", value.asInstanceOf[js.Any])
  }
}
