package typings.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<azure-sb.azure-sb.Azure.ServiceBus.ICreateTopicIfNotExistsOptions> */
@js.native
trait CreateTopicIfNotExistsOptions extends js.Object {
  
  var DefaultMessageTimeToLive: js.UndefOr[String] = js.native
  
  var DuplicateDetectionHistoryTimeWindow: js.UndefOr[String] = js.native
  
  var EnableBatchedOperations: js.UndefOr[Boolean] = js.native
  
  var EnableDeadLetteringOnFilterEvaluationExceptions: js.UndefOr[Boolean] = js.native
  
  var EnableDeadLetteringOnMessageExpiration: js.UndefOr[Boolean] = js.native
  
  var EnablePartitioning: js.UndefOr[Boolean] = js.native
  
  var MaxCorrelationFiltersPerTopic: js.UndefOr[Double] = js.native
  
  var MaxSizeInMegabytes: js.UndefOr[Double] = js.native
  
  var MaxSqlFiltersPerTopic: js.UndefOr[Double] = js.native
  
  var MaxSubscriptionsPerTopic: js.UndefOr[Double] = js.native
  
  var RequiresDuplicateDetection: js.UndefOr[Boolean] = js.native
  
  var SizeInBytes: js.UndefOr[Boolean] = js.native
  
  var SupportOrdering: js.UndefOr[Boolean] = js.native
}
object CreateTopicIfNotExistsOptions {
  
  @scala.inline
  def apply(): CreateTopicIfNotExistsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTopicIfNotExistsOptions]
  }
  
  @scala.inline
  implicit class CreateTopicIfNotExistsOptionsOps[Self <: CreateTopicIfNotExistsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefaultMessageTimeToLive(value: String): Self = this.set("DefaultMessageTimeToLive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultMessageTimeToLive: Self = this.set("DefaultMessageTimeToLive", js.undefined)
    
    @scala.inline
    def setDuplicateDetectionHistoryTimeWindow(value: String): Self = this.set("DuplicateDetectionHistoryTimeWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuplicateDetectionHistoryTimeWindow: Self = this.set("DuplicateDetectionHistoryTimeWindow", js.undefined)
    
    @scala.inline
    def setEnableBatchedOperations(value: Boolean): Self = this.set("EnableBatchedOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableBatchedOperations: Self = this.set("EnableBatchedOperations", js.undefined)
    
    @scala.inline
    def setEnableDeadLetteringOnFilterEvaluationExceptions(value: Boolean): Self = this.set("EnableDeadLetteringOnFilterEvaluationExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDeadLetteringOnFilterEvaluationExceptions: Self = this.set("EnableDeadLetteringOnFilterEvaluationExceptions", js.undefined)
    
    @scala.inline
    def setEnableDeadLetteringOnMessageExpiration(value: Boolean): Self = this.set("EnableDeadLetteringOnMessageExpiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDeadLetteringOnMessageExpiration: Self = this.set("EnableDeadLetteringOnMessageExpiration", js.undefined)
    
    @scala.inline
    def setEnablePartitioning(value: Boolean): Self = this.set("EnablePartitioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePartitioning: Self = this.set("EnablePartitioning", js.undefined)
    
    @scala.inline
    def setMaxCorrelationFiltersPerTopic(value: Double): Self = this.set("MaxCorrelationFiltersPerTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxCorrelationFiltersPerTopic: Self = this.set("MaxCorrelationFiltersPerTopic", js.undefined)
    
    @scala.inline
    def setMaxSizeInMegabytes(value: Double): Self = this.set("MaxSizeInMegabytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSizeInMegabytes: Self = this.set("MaxSizeInMegabytes", js.undefined)
    
    @scala.inline
    def setMaxSqlFiltersPerTopic(value: Double): Self = this.set("MaxSqlFiltersPerTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSqlFiltersPerTopic: Self = this.set("MaxSqlFiltersPerTopic", js.undefined)
    
    @scala.inline
    def setMaxSubscriptionsPerTopic(value: Double): Self = this.set("MaxSubscriptionsPerTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSubscriptionsPerTopic: Self = this.set("MaxSubscriptionsPerTopic", js.undefined)
    
    @scala.inline
    def setRequiresDuplicateDetection(value: Boolean): Self = this.set("RequiresDuplicateDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiresDuplicateDetection: Self = this.set("RequiresDuplicateDetection", js.undefined)
    
    @scala.inline
    def setSizeInBytes(value: Boolean): Self = this.set("SizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeInBytes: Self = this.set("SizeInBytes", js.undefined)
    
    @scala.inline
    def setSupportOrdering(value: Boolean): Self = this.set("SupportOrdering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportOrdering: Self = this.set("SupportOrdering", js.undefined)
  }
}
