package typings.awsSdk.lookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAlertRequest extends StObject {
  
  /**
    * Action that will be triggered when there is an alert.
    */
  var Action: typings.awsSdk.lookoutmetricsMod.Action
  
  /**
    * A description of the alert.
    */
  var AlertDescription: js.UndefOr[typings.awsSdk.lookoutmetricsMod.AlertDescription] = js.undefined
  
  /**
    * The configuration of the alert filters, containing MetricList and DimensionFilterList.
    */
  var AlertFilters: js.UndefOr[typings.awsSdk.lookoutmetricsMod.AlertFilters] = js.undefined
  
  /**
    * The name of the alert.
    */
  var AlertName: typings.awsSdk.lookoutmetricsMod.AlertName
  
  /**
    * An integer from 0 to 100 specifying the alert sensitivity threshold.
    */
  var AlertSensitivityThreshold: js.UndefOr[SensitivityThreshold] = js.undefined
  
  /**
    * The ARN of the detector to which the alert is attached.
    */
  var AnomalyDetectorArn: Arn
  
  /**
    * A list of tags to apply to the alert.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateAlertRequest {
  
  inline def apply(Action: Action, AlertName: AlertName, AnomalyDetectorArn: Arn): CreateAlertRequest = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], AlertName = AlertName.asInstanceOf[js.Any], AnomalyDetectorArn = AnomalyDetectorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAlertRequest]
  }
  
  extension [Self <: CreateAlertRequest](x: Self) {
    
    inline def setAction(value: Action): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setAlertDescription(value: AlertDescription): Self = StObject.set(x, "AlertDescription", value.asInstanceOf[js.Any])
    
    inline def setAlertDescriptionUndefined: Self = StObject.set(x, "AlertDescription", js.undefined)
    
    inline def setAlertFilters(value: AlertFilters): Self = StObject.set(x, "AlertFilters", value.asInstanceOf[js.Any])
    
    inline def setAlertFiltersUndefined: Self = StObject.set(x, "AlertFilters", js.undefined)
    
    inline def setAlertName(value: AlertName): Self = StObject.set(x, "AlertName", value.asInstanceOf[js.Any])
    
    inline def setAlertSensitivityThreshold(value: SensitivityThreshold): Self = StObject.set(x, "AlertSensitivityThreshold", value.asInstanceOf[js.Any])
    
    inline def setAlertSensitivityThresholdUndefined: Self = StObject.set(x, "AlertSensitivityThreshold", js.undefined)
    
    inline def setAnomalyDetectorArn(value: Arn): Self = StObject.set(x, "AnomalyDetectorArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
