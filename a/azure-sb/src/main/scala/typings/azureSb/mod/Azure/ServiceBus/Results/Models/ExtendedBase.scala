package typings.azureSb.mod.Azure.ServiceBus.Results.Models

import typings.azureSb.anon.Author
import typings.azureSb.mod.Azure.ServiceBus.DateString
import typings.azureSb.mod.Azure.ServiceBus.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtendedBase extends Base {
  
  var AuthorizationRules: String = js.native
  
  var AutoDeleteOnIdle: String = js.native
  
  var DefaultMessageTimeToLive: String = js.native
  
  var DuplicateDetectionHistoryTimeWindow: Duration = js.native
  
  var EnableBatchedOperations: String = js.native
  
  var EnableExpress: String = js.native
  
  var EnablePartitioning: String = js.native
  
  var EntityAvailabilityStatus: String = js.native
  
  var IsAnonymousAccessible: String = js.native
  
  var MaxSizeInMegabytes: String = js.native
  
  var RequiresDuplicateDetection: String = js.native
  
  var SizeInBytes: String = js.native
  
  var Status: EntityStatus = js.native
  
  var UpdatedAt: DateString = js.native
}
object ExtendedBase {
  
  @scala.inline
  def apply(
    AuthorizationRules: String,
    AutoDeleteOnIdle: String,
    CreatedAt: DateString,
    DefaultMessageTimeToLive: String,
    DuplicateDetectionHistoryTimeWindow: Duration,
    EnableBatchedOperations: String,
    EnableExpress: String,
    EnablePartitioning: String,
    EntityAvailabilityStatus: String,
    IsAnonymousAccessible: String,
    MaxSizeInMegabytes: String,
    RequiresDuplicateDetection: String,
    SizeInBytes: String,
    Status: EntityStatus,
    UpdatedAt: DateString,
    _underscore: Author
  ): ExtendedBase = {
    val __obj = js.Dynamic.literal(AuthorizationRules = AuthorizationRules.asInstanceOf[js.Any], AutoDeleteOnIdle = AutoDeleteOnIdle.asInstanceOf[js.Any], CreatedAt = CreatedAt.asInstanceOf[js.Any], DefaultMessageTimeToLive = DefaultMessageTimeToLive.asInstanceOf[js.Any], DuplicateDetectionHistoryTimeWindow = DuplicateDetectionHistoryTimeWindow.asInstanceOf[js.Any], EnableBatchedOperations = EnableBatchedOperations.asInstanceOf[js.Any], EnableExpress = EnableExpress.asInstanceOf[js.Any], EnablePartitioning = EnablePartitioning.asInstanceOf[js.Any], EntityAvailabilityStatus = EntityAvailabilityStatus.asInstanceOf[js.Any], IsAnonymousAccessible = IsAnonymousAccessible.asInstanceOf[js.Any], MaxSizeInMegabytes = MaxSizeInMegabytes.asInstanceOf[js.Any], RequiresDuplicateDetection = RequiresDuplicateDetection.asInstanceOf[js.Any], SizeInBytes = SizeInBytes.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any])
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedBase]
  }
  
  @scala.inline
  implicit class ExtendedBaseOps[Self <: ExtendedBase] (val x: Self) extends AnyVal {
    
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
    def setAuthorizationRules(value: String): Self = this.set("AuthorizationRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoDeleteOnIdle(value: String): Self = this.set("AutoDeleteOnIdle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultMessageTimeToLive(value: String): Self = this.set("DefaultMessageTimeToLive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplicateDetectionHistoryTimeWindow(value: Duration): Self = this.set("DuplicateDetectionHistoryTimeWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableBatchedOperations(value: String): Self = this.set("EnableBatchedOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableExpress(value: String): Self = this.set("EnableExpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePartitioning(value: String): Self = this.set("EnablePartitioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityAvailabilityStatus(value: String): Self = this.set("EntityAvailabilityStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAnonymousAccessible(value: String): Self = this.set("IsAnonymousAccessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSizeInMegabytes(value: String): Self = this.set("MaxSizeInMegabytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiresDuplicateDetection(value: String): Self = this.set("RequiresDuplicateDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeInBytes(value: String): Self = this.set("SizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: EntityStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAt(value: DateString): Self = this.set("UpdatedAt", value.asInstanceOf[js.Any])
  }
}
