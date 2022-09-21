package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetails extends StObject {
  
  /**
    * The values to use for the filter.
    */
  var Operands: js.UndefOr[AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsList] = js.undefined
  
  /**
    * A prefix filter.
    */
  var Prefix: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A tag filter.
    */
  var Tag: js.UndefOr[AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateTagDetails] = js.undefined
  
  /**
    * Whether to use AND or OR to join the operands. Valid values are LifecycleAndOperator or LifecycleOrOperator.
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetails {
  
  inline def apply(): AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetails]
  }
  
  extension [Self <: AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetails](x: Self) {
    
    inline def setOperands(value: AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsList): Self = StObject.set(x, "Operands", value.asInstanceOf[js.Any])
    
    inline def setOperandsUndefined: Self = StObject.set(x, "Operands", js.undefined)
    
    inline def setOperandsVarargs(value: AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsDetails*): Self = StObject.set(x, "Operands", js.Array(value*))
    
    inline def setPrefix(value: NonEmptyString): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    inline def setTag(value: AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateTagDetails): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
