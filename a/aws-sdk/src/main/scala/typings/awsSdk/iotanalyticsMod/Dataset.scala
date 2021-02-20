package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dataset extends StObject {
  
  /**
    * The DatasetAction objects that automatically create the data set contents.
    */
  var actions: js.UndefOr[DatasetActions] = js.native
  
  /**
    * The ARN of the data set.
    */
  var arn: js.UndefOr[DatasetArn] = js.native
  
  /**
    * When dataset contents are created they are delivered to destinations specified here.
    */
  var contentDeliveryRules: js.UndefOr[DatasetContentDeliveryRules] = js.native
  
  /**
    * When the data set was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The last time the data set was updated.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * A list of data rules that send notifications to Amazon CloudWatch, when data arrives late. To specify lateDataRules, the dataset must use a DeltaTimer filter.
    */
  var lateDataRules: js.UndefOr[LateDataRules] = js.native
  
  /**
    * The name of the data set.
    */
  var name: js.UndefOr[DatasetName] = js.native
  
  /**
    * Optional. How long, in days, message data is kept for the data set.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.native
  
  /**
    * The status of the data set.
    */
  var status: js.UndefOr[DatasetStatus] = js.native
  
  /**
    * The DatasetTrigger objects that specify when the data set is automatically updated.
    */
  var triggers: js.UndefOr[DatasetTriggers] = js.native
  
  /**
    * Optional. How many versions of dataset contents are kept. If not specified or set to null, only the latest version plus the latest succeeded version (if they are different) are kept for the time period specified by the retentionPeriod parameter. For more information, see Keeping Multiple Versions of AWS IoT Analytics Data Sets in the AWS IoT Analytics User Guide.
    */
  var versioningConfiguration: js.UndefOr[VersioningConfiguration] = js.native
}
object Dataset {
  
  @scala.inline
  def apply(): Dataset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dataset]
  }
  
  @scala.inline
  implicit class DatasetMutableBuilder[Self <: Dataset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: DatasetActions): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: DatasetAction*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setArn(value: DatasetArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setContentDeliveryRules(value: DatasetContentDeliveryRules): Self = StObject.set(x, "contentDeliveryRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentDeliveryRulesUndefined: Self = StObject.set(x, "contentDeliveryRules", js.undefined)
    
    @scala.inline
    def setContentDeliveryRulesVarargs(value: DatasetContentDeliveryRule*): Self = StObject.set(x, "contentDeliveryRules", js.Array(value :_*))
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setLastUpdateTime(value: Timestamp): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    @scala.inline
    def setLateDataRules(value: LateDataRules): Self = StObject.set(x, "lateDataRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLateDataRulesUndefined: Self = StObject.set(x, "lateDataRules", js.undefined)
    
    @scala.inline
    def setLateDataRulesVarargs(value: LateDataRule*): Self = StObject.set(x, "lateDataRules", js.Array(value :_*))
    
    @scala.inline
    def setName(value: DatasetName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRetentionPeriod(value: RetentionPeriod): Self = StObject.set(x, "retentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionPeriodUndefined: Self = StObject.set(x, "retentionPeriod", js.undefined)
    
    @scala.inline
    def setStatus(value: DatasetStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTriggers(value: DatasetTriggers): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggersUndefined: Self = StObject.set(x, "triggers", js.undefined)
    
    @scala.inline
    def setTriggersVarargs(value: DatasetTrigger*): Self = StObject.set(x, "triggers", js.Array(value :_*))
    
    @scala.inline
    def setVersioningConfiguration(value: VersioningConfiguration): Self = StObject.set(x, "versioningConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersioningConfigurationUndefined: Self = StObject.set(x, "versioningConfiguration", js.undefined)
  }
}
