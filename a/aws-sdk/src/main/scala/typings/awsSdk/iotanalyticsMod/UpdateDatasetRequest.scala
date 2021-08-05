package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDatasetRequest extends StObject {
  
  /**
    * A list of DatasetAction objects.
    */
  var actions: DatasetActions
  
  /**
    * When dataset contents are created, they are delivered to destinations specified here.
    */
  var contentDeliveryRules: js.UndefOr[DatasetContentDeliveryRules] = js.undefined
  
  /**
    * The name of the data set to update.
    */
  var datasetName: DatasetName
  
  /**
    * A list of data rules that send notifications to Amazon CloudWatch, when data arrives late. To specify lateDataRules, the dataset must use a DeltaTimer filter.
    */
  var lateDataRules: js.UndefOr[LateDataRules] = js.undefined
  
  /**
    * How long, in days, dataset contents are kept for the dataset.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
  
  /**
    * A list of DatasetTrigger objects. The list can be empty or can contain up to five DatasetTrigger objects.
    */
  var triggers: js.UndefOr[DatasetTriggers] = js.undefined
  
  /**
    * Optional. How many versions of dataset contents are kept. If not specified or set to null, only the latest version plus the latest succeeded version (if they are different) are kept for the time period specified by the retentionPeriod parameter. For more information, see Keeping Multiple Versions of AWS IoT Analytics Data Sets in the AWS IoT Analytics User Guide.
    */
  var versioningConfiguration: js.UndefOr[VersioningConfiguration] = js.undefined
}
object UpdateDatasetRequest {
  
  inline def apply(actions: DatasetActions, datasetName: DatasetName): UpdateDatasetRequest = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], datasetName = datasetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDatasetRequest]
  }
  
  extension [Self <: UpdateDatasetRequest](x: Self) {
    
    inline def setActions(value: DatasetActions): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: DatasetAction*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    inline def setContentDeliveryRules(value: DatasetContentDeliveryRules): Self = StObject.set(x, "contentDeliveryRules", value.asInstanceOf[js.Any])
    
    inline def setContentDeliveryRulesUndefined: Self = StObject.set(x, "contentDeliveryRules", js.undefined)
    
    inline def setContentDeliveryRulesVarargs(value: DatasetContentDeliveryRule*): Self = StObject.set(x, "contentDeliveryRules", js.Array(value :_*))
    
    inline def setDatasetName(value: DatasetName): Self = StObject.set(x, "datasetName", value.asInstanceOf[js.Any])
    
    inline def setLateDataRules(value: LateDataRules): Self = StObject.set(x, "lateDataRules", value.asInstanceOf[js.Any])
    
    inline def setLateDataRulesUndefined: Self = StObject.set(x, "lateDataRules", js.undefined)
    
    inline def setLateDataRulesVarargs(value: LateDataRule*): Self = StObject.set(x, "lateDataRules", js.Array(value :_*))
    
    inline def setRetentionPeriod(value: RetentionPeriod): Self = StObject.set(x, "retentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setRetentionPeriodUndefined: Self = StObject.set(x, "retentionPeriod", js.undefined)
    
    inline def setTriggers(value: DatasetTriggers): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
    
    inline def setTriggersUndefined: Self = StObject.set(x, "triggers", js.undefined)
    
    inline def setTriggersVarargs(value: DatasetTrigger*): Self = StObject.set(x, "triggers", js.Array(value :_*))
    
    inline def setVersioningConfiguration(value: VersioningConfiguration): Self = StObject.set(x, "versioningConfiguration", value.asInstanceOf[js.Any])
    
    inline def setVersioningConfigurationUndefined: Self = StObject.set(x, "versioningConfiguration", js.undefined)
  }
}
