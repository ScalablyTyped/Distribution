package typings.awsSdk.lookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAlertRequest extends StObject {
  
  /**
    * Action that will be triggered when there is an alert.
    */
  var Action: js.UndefOr[typings.awsSdk.lookoutmetricsMod.Action] = js.undefined
  
  /**
    * The ARN of the alert to update.
    */
  var AlertArn: Arn
  
  /**
    * A description of the alert.
    */
  var AlertDescription: js.UndefOr[typings.awsSdk.lookoutmetricsMod.AlertDescription] = js.undefined
  
  /**
    * The configuration of the alert filters, containing MetricList and DimensionFilterList.
    */
  var AlertFilters: js.UndefOr[typings.awsSdk.lookoutmetricsMod.AlertFilters] = js.undefined
  
  /**
    * An integer from 0 to 100 specifying the alert sensitivity threshold.
    */
  var AlertSensitivityThreshold: js.UndefOr[SensitivityThreshold] = js.undefined
}
object UpdateAlertRequest {
  
  inline def apply(AlertArn: Arn): UpdateAlertRequest = {
    val __obj = js.Dynamic.literal(AlertArn = AlertArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAlertRequest]
  }
  
  extension [Self <: UpdateAlertRequest](x: Self) {
    
    inline def setAction(value: Action): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    inline def setAlertArn(value: Arn): Self = StObject.set(x, "AlertArn", value.asInstanceOf[js.Any])
    
    inline def setAlertDescription(value: AlertDescription): Self = StObject.set(x, "AlertDescription", value.asInstanceOf[js.Any])
    
    inline def setAlertDescriptionUndefined: Self = StObject.set(x, "AlertDescription", js.undefined)
    
    inline def setAlertFilters(value: AlertFilters): Self = StObject.set(x, "AlertFilters", value.asInstanceOf[js.Any])
    
    inline def setAlertFiltersUndefined: Self = StObject.set(x, "AlertFilters", js.undefined)
    
    inline def setAlertSensitivityThreshold(value: SensitivityThreshold): Self = StObject.set(x, "AlertSensitivityThreshold", value.asInstanceOf[js.Any])
    
    inline def setAlertSensitivityThresholdUndefined: Self = StObject.set(x, "AlertSensitivityThreshold", js.undefined)
  }
}
