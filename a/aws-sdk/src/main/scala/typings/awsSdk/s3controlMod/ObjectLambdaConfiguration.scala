package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectLambdaConfiguration extends StObject {
  
  /**
    * A container for allowed features. Valid inputs are GetObject-Range and GetObject-PartNumber.
    */
  var AllowedFeatures: js.UndefOr[ObjectLambdaAllowedFeaturesList] = js.undefined
  
  /**
    * A container for whether the CloudWatch metrics configuration is enabled.
    */
  var CloudWatchMetricsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Standard access point associated with the Object Lambda Access Point.
    */
  var SupportingAccessPoint: ObjectLambdaSupportingAccessPointArn
  
  /**
    * A container for transformation configurations for an Object Lambda Access Point.
    */
  var TransformationConfigurations: ObjectLambdaTransformationConfigurationsList
}
object ObjectLambdaConfiguration {
  
  inline def apply(
    SupportingAccessPoint: ObjectLambdaSupportingAccessPointArn,
    TransformationConfigurations: ObjectLambdaTransformationConfigurationsList
  ): ObjectLambdaConfiguration = {
    val __obj = js.Dynamic.literal(SupportingAccessPoint = SupportingAccessPoint.asInstanceOf[js.Any], TransformationConfigurations = TransformationConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectLambdaConfiguration]
  }
  
  extension [Self <: ObjectLambdaConfiguration](x: Self) {
    
    inline def setAllowedFeatures(value: ObjectLambdaAllowedFeaturesList): Self = StObject.set(x, "AllowedFeatures", value.asInstanceOf[js.Any])
    
    inline def setAllowedFeaturesUndefined: Self = StObject.set(x, "AllowedFeatures", js.undefined)
    
    inline def setAllowedFeaturesVarargs(value: ObjectLambdaAllowedFeature*): Self = StObject.set(x, "AllowedFeatures", js.Array(value*))
    
    inline def setCloudWatchMetricsEnabled(value: Boolean): Self = StObject.set(x, "CloudWatchMetricsEnabled", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchMetricsEnabledUndefined: Self = StObject.set(x, "CloudWatchMetricsEnabled", js.undefined)
    
    inline def setSupportingAccessPoint(value: ObjectLambdaSupportingAccessPointArn): Self = StObject.set(x, "SupportingAccessPoint", value.asInstanceOf[js.Any])
    
    inline def setTransformationConfigurations(value: ObjectLambdaTransformationConfigurationsList): Self = StObject.set(x, "TransformationConfigurations", value.asInstanceOf[js.Any])
    
    inline def setTransformationConfigurationsVarargs(value: ObjectLambdaTransformationConfiguration*): Self = StObject.set(x, "TransformationConfigurations", js.Array(value*))
  }
}
