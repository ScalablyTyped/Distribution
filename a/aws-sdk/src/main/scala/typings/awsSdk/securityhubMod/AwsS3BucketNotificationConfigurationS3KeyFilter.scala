package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsS3BucketNotificationConfigurationS3KeyFilter extends StObject {
  
  /**
    * The filter rules for the filter.
    */
  var FilterRules: js.UndefOr[AwsS3BucketNotificationConfigurationS3KeyFilterRules] = js.undefined
}
object AwsS3BucketNotificationConfigurationS3KeyFilter {
  
  inline def apply(): AwsS3BucketNotificationConfigurationS3KeyFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3BucketNotificationConfigurationS3KeyFilter]
  }
  
  extension [Self <: AwsS3BucketNotificationConfigurationS3KeyFilter](x: Self) {
    
    inline def setFilterRules(value: AwsS3BucketNotificationConfigurationS3KeyFilterRules): Self = StObject.set(x, "FilterRules", value.asInstanceOf[js.Any])
    
    inline def setFilterRulesUndefined: Self = StObject.set(x, "FilterRules", js.undefined)
    
    inline def setFilterRulesVarargs(value: AwsS3BucketNotificationConfigurationS3KeyFilterRule*): Self = StObject.set(x, "FilterRules", js.Array(value*))
  }
}
