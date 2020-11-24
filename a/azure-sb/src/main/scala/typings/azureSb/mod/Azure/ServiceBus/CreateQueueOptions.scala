package typings.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<azure-sb.azure-sb.Azure.ServiceBus.IQueueOptions> */
@js.native
trait CreateQueueOptions extends js.Object {
  
  var AutoDeleteOnIdle: js.UndefOr[String] = js.native
  
  var DeadLetteringOnMessageExpiration: js.UndefOr[Boolean] = js.native
  
  var DefaultMessageTimeToLive: js.UndefOr[String] = js.native
  
  var DuplicateDetectionHistoryTimeWindow: js.UndefOr[String] = js.native
  
  var EnablePartitioning: js.UndefOr[Boolean] = js.native
  
  var LockDuration: js.UndefOr[String] = js.native
  
  var MaxSizeInMegabytes: js.UndefOr[Double] = js.native
  
  var RequiresDuplicateDetection: js.UndefOr[Boolean] = js.native
  
  var RequiresSession: js.UndefOr[Boolean] = js.native
}
object CreateQueueOptions {
  
  @scala.inline
  def apply(): CreateQueueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateQueueOptions]
  }
  
  @scala.inline
  implicit class CreateQueueOptionsOps[Self <: CreateQueueOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoDeleteOnIdle(value: String): Self = this.set("AutoDeleteOnIdle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoDeleteOnIdle: Self = this.set("AutoDeleteOnIdle", js.undefined)
    
    @scala.inline
    def setDeadLetteringOnMessageExpiration(value: Boolean): Self = this.set("DeadLetteringOnMessageExpiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeadLetteringOnMessageExpiration: Self = this.set("DeadLetteringOnMessageExpiration", js.undefined)
    
    @scala.inline
    def setDefaultMessageTimeToLive(value: String): Self = this.set("DefaultMessageTimeToLive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultMessageTimeToLive: Self = this.set("DefaultMessageTimeToLive", js.undefined)
    
    @scala.inline
    def setDuplicateDetectionHistoryTimeWindow(value: String): Self = this.set("DuplicateDetectionHistoryTimeWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuplicateDetectionHistoryTimeWindow: Self = this.set("DuplicateDetectionHistoryTimeWindow", js.undefined)
    
    @scala.inline
    def setEnablePartitioning(value: Boolean): Self = this.set("EnablePartitioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePartitioning: Self = this.set("EnablePartitioning", js.undefined)
    
    @scala.inline
    def setLockDuration(value: String): Self = this.set("LockDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockDuration: Self = this.set("LockDuration", js.undefined)
    
    @scala.inline
    def setMaxSizeInMegabytes(value: Double): Self = this.set("MaxSizeInMegabytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSizeInMegabytes: Self = this.set("MaxSizeInMegabytes", js.undefined)
    
    @scala.inline
    def setRequiresDuplicateDetection(value: Boolean): Self = this.set("RequiresDuplicateDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiresDuplicateDetection: Self = this.set("RequiresDuplicateDetection", js.undefined)
    
    @scala.inline
    def setRequiresSession(value: Boolean): Self = this.set("RequiresSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiresSession: Self = this.set("RequiresSession", js.undefined)
  }
}
