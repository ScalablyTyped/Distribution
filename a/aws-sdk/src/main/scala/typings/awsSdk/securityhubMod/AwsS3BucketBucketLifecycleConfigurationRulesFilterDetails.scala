package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsS3BucketBucketLifecycleConfigurationRulesFilterDetails extends StObject {
  
  /**
    * The configuration for the filter.
    */
  var Predicate: js.UndefOr[AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetails] = js.undefined
}
object AwsS3BucketBucketLifecycleConfigurationRulesFilterDetails {
  
  inline def apply(): AwsS3BucketBucketLifecycleConfigurationRulesFilterDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3BucketBucketLifecycleConfigurationRulesFilterDetails]
  }
  
  extension [Self <: AwsS3BucketBucketLifecycleConfigurationRulesFilterDetails](x: Self) {
    
    inline def setPredicate(value: AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetails): Self = StObject.set(x, "Predicate", value.asInstanceOf[js.Any])
    
    inline def setPredicateUndefined: Self = StObject.set(x, "Predicate", js.undefined)
  }
}
