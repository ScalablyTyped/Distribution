package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsS3BucketBucketLifecycleConfigurationDetails extends StObject {
  
  /**
    * The lifecycle rules.
    */
  var Rules: js.UndefOr[AwsS3BucketBucketLifecycleConfigurationRulesList] = js.undefined
}
object AwsS3BucketBucketLifecycleConfigurationDetails {
  
  inline def apply(): AwsS3BucketBucketLifecycleConfigurationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3BucketBucketLifecycleConfigurationDetails]
  }
  
  extension [Self <: AwsS3BucketBucketLifecycleConfigurationDetails](x: Self) {
    
    inline def setRules(value: AwsS3BucketBucketLifecycleConfigurationRulesList): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    inline def setRulesVarargs(value: AwsS3BucketBucketLifecycleConfigurationRulesDetails*): Self = StObject.set(x, "Rules", js.Array(value*))
  }
}
