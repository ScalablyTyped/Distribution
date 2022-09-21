package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsS3BucketNotificationConfigurationFilter extends StObject {
  
  /**
    * Details for an Amazon S3 filter.
    */
  var S3KeyFilter: js.UndefOr[AwsS3BucketNotificationConfigurationS3KeyFilter] = js.undefined
}
object AwsS3BucketNotificationConfigurationFilter {
  
  inline def apply(): AwsS3BucketNotificationConfigurationFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3BucketNotificationConfigurationFilter]
  }
  
  extension [Self <: AwsS3BucketNotificationConfigurationFilter](x: Self) {
    
    inline def setS3KeyFilter(value: AwsS3BucketNotificationConfigurationS3KeyFilter): Self = StObject.set(x, "S3KeyFilter", value.asInstanceOf[js.Any])
    
    inline def setS3KeyFilterUndefined: Self = StObject.set(x, "S3KeyFilter", js.undefined)
  }
}
