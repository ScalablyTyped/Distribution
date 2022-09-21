package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QualityCheckStepMetadata extends StObject {
  
  /**
    * The Amazon S3 URI of the baseline constraints file used for the drift check.
    */
  var BaselineUsedForDriftCheckConstraints: js.UndefOr[String1024] = js.undefined
  
  /**
    * The Amazon S3 URI of the baseline statistics file used for the drift check.
    */
  var BaselineUsedForDriftCheckStatistics: js.UndefOr[String1024] = js.undefined
  
  /**
    * The Amazon S3 URI of the newly calculated baseline constraints file.
    */
  var CalculatedBaselineConstraints: js.UndefOr[String1024] = js.undefined
  
  /**
    * The Amazon S3 URI of the newly calculated baseline statistics file.
    */
  var CalculatedBaselineStatistics: js.UndefOr[String1024] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Quality check processing job that was run by this step execution.
    */
  var CheckJobArn: js.UndefOr[String256] = js.undefined
  
  /**
    * The type of the Quality check step.
    */
  var CheckType: js.UndefOr[String256] = js.undefined
  
  /**
    * The model package group name.
    */
  var ModelPackageGroupName: js.UndefOr[String256] = js.undefined
  
  /**
    * This flag indicates if a newly calculated baseline can be accessed through step properties BaselineUsedForDriftCheckConstraints and BaselineUsedForDriftCheckStatistics. If it is set to False, the previous baseline of the configured check type must also be available. These can be accessed through the BaselineUsedForDriftCheckConstraints and  BaselineUsedForDriftCheckStatistics properties. 
    */
  var RegisterNewBaseline: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This flag indicates if the drift check against the previous baseline will be skipped or not. If it is set to False, the previous baseline of the configured check type must be available.
    */
  var SkipCheck: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon S3 URI of violation report if violations are detected.
    */
  var ViolationReport: js.UndefOr[String1024] = js.undefined
}
object QualityCheckStepMetadata {
  
  inline def apply(): QualityCheckStepMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QualityCheckStepMetadata]
  }
  
  extension [Self <: QualityCheckStepMetadata](x: Self) {
    
    inline def setBaselineUsedForDriftCheckConstraints(value: String1024): Self = StObject.set(x, "BaselineUsedForDriftCheckConstraints", value.asInstanceOf[js.Any])
    
    inline def setBaselineUsedForDriftCheckConstraintsUndefined: Self = StObject.set(x, "BaselineUsedForDriftCheckConstraints", js.undefined)
    
    inline def setBaselineUsedForDriftCheckStatistics(value: String1024): Self = StObject.set(x, "BaselineUsedForDriftCheckStatistics", value.asInstanceOf[js.Any])
    
    inline def setBaselineUsedForDriftCheckStatisticsUndefined: Self = StObject.set(x, "BaselineUsedForDriftCheckStatistics", js.undefined)
    
    inline def setCalculatedBaselineConstraints(value: String1024): Self = StObject.set(x, "CalculatedBaselineConstraints", value.asInstanceOf[js.Any])
    
    inline def setCalculatedBaselineConstraintsUndefined: Self = StObject.set(x, "CalculatedBaselineConstraints", js.undefined)
    
    inline def setCalculatedBaselineStatistics(value: String1024): Self = StObject.set(x, "CalculatedBaselineStatistics", value.asInstanceOf[js.Any])
    
    inline def setCalculatedBaselineStatisticsUndefined: Self = StObject.set(x, "CalculatedBaselineStatistics", js.undefined)
    
    inline def setCheckJobArn(value: String256): Self = StObject.set(x, "CheckJobArn", value.asInstanceOf[js.Any])
    
    inline def setCheckJobArnUndefined: Self = StObject.set(x, "CheckJobArn", js.undefined)
    
    inline def setCheckType(value: String256): Self = StObject.set(x, "CheckType", value.asInstanceOf[js.Any])
    
    inline def setCheckTypeUndefined: Self = StObject.set(x, "CheckType", js.undefined)
    
    inline def setModelPackageGroupName(value: String256): Self = StObject.set(x, "ModelPackageGroupName", value.asInstanceOf[js.Any])
    
    inline def setModelPackageGroupNameUndefined: Self = StObject.set(x, "ModelPackageGroupName", js.undefined)
    
    inline def setRegisterNewBaseline(value: Boolean): Self = StObject.set(x, "RegisterNewBaseline", value.asInstanceOf[js.Any])
    
    inline def setRegisterNewBaselineUndefined: Self = StObject.set(x, "RegisterNewBaseline", js.undefined)
    
    inline def setSkipCheck(value: Boolean): Self = StObject.set(x, "SkipCheck", value.asInstanceOf[js.Any])
    
    inline def setSkipCheckUndefined: Self = StObject.set(x, "SkipCheck", js.undefined)
    
    inline def setViolationReport(value: String1024): Self = StObject.set(x, "ViolationReport", value.asInstanceOf[js.Any])
    
    inline def setViolationReportUndefined: Self = StObject.set(x, "ViolationReport", js.undefined)
  }
}
