package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchMetrics extends StObject {
  
  /**
    * A container that indicates whether CloudWatch publishing for S3 Storage Lens metrics is enabled. A value of true indicates that CloudWatch publishing for S3 Storage Lens metrics is enabled.
    */
  var IsEnabled: typings.awsSdk.s3controlMod.IsEnabled
}
object CloudWatchMetrics {
  
  inline def apply(IsEnabled: IsEnabled): CloudWatchMetrics = {
    val __obj = js.Dynamic.literal(IsEnabled = IsEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchMetrics]
  }
  
  extension [Self <: CloudWatchMetrics](x: Self) {
    
    inline def setIsEnabled(value: IsEnabled): Self = StObject.set(x, "IsEnabled", value.asInstanceOf[js.Any])
  }
}
