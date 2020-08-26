package typings.azureSb.queueresultMod.Azure.ServiceBus.Results

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueProperties extends js.Object {
  var DeadLetteringOnMessageExpiration: String = js.native
  var DefaultMessageTimeToLive: String = js.native
  var DuplicateDetectionHistoryTimeWindow: String = js.native
  var EnableBatchedOperations: Boolean = js.native
  var EnablePartitioning: Boolean = js.native
  var LockDuration: String = js.native
  var MaxDeliveryCount: Double = js.native
  var MaxSizeInMegabytes: Double = js.native
  var MessageCount: Double = js.native
  var RequiresDuplicateDetection: Boolean = js.native
  var RequiresSession: Boolean = js.native
  var SizeInBytes: Double = js.native
}

object QueueProperties {
  @scala.inline
  def apply(
    DeadLetteringOnMessageExpiration: String,
    DefaultMessageTimeToLive: String,
    DuplicateDetectionHistoryTimeWindow: String,
    EnableBatchedOperations: Boolean,
    EnablePartitioning: Boolean,
    LockDuration: String,
    MaxDeliveryCount: Double,
    MaxSizeInMegabytes: Double,
    MessageCount: Double,
    RequiresDuplicateDetection: Boolean,
    RequiresSession: Boolean,
    SizeInBytes: Double
  ): QueueProperties = {
    val __obj = js.Dynamic.literal(DeadLetteringOnMessageExpiration = DeadLetteringOnMessageExpiration.asInstanceOf[js.Any], DefaultMessageTimeToLive = DefaultMessageTimeToLive.asInstanceOf[js.Any], DuplicateDetectionHistoryTimeWindow = DuplicateDetectionHistoryTimeWindow.asInstanceOf[js.Any], EnableBatchedOperations = EnableBatchedOperations.asInstanceOf[js.Any], EnablePartitioning = EnablePartitioning.asInstanceOf[js.Any], LockDuration = LockDuration.asInstanceOf[js.Any], MaxDeliveryCount = MaxDeliveryCount.asInstanceOf[js.Any], MaxSizeInMegabytes = MaxSizeInMegabytes.asInstanceOf[js.Any], MessageCount = MessageCount.asInstanceOf[js.Any], RequiresDuplicateDetection = RequiresDuplicateDetection.asInstanceOf[js.Any], RequiresSession = RequiresSession.asInstanceOf[js.Any], SizeInBytes = SizeInBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueProperties]
  }
  @scala.inline
  implicit class QueuePropertiesOps[Self <: QueueProperties] (val x: Self) extends AnyVal {
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
    def setDeadLetteringOnMessageExpiration(value: String): Self = this.set("DeadLetteringOnMessageExpiration", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultMessageTimeToLive(value: String): Self = this.set("DefaultMessageTimeToLive", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuplicateDetectionHistoryTimeWindow(value: String): Self = this.set("DuplicateDetectionHistoryTimeWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableBatchedOperations(value: Boolean): Self = this.set("EnableBatchedOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnablePartitioning(value: Boolean): Self = this.set("EnablePartitioning", value.asInstanceOf[js.Any])
    @scala.inline
    def setLockDuration(value: String): Self = this.set("LockDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxDeliveryCount(value: Double): Self = this.set("MaxDeliveryCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxSizeInMegabytes(value: Double): Self = this.set("MaxSizeInMegabytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageCount(value: Double): Self = this.set("MessageCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequiresDuplicateDetection(value: Boolean): Self = this.set("RequiresDuplicateDetection", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequiresSession(value: Boolean): Self = this.set("RequiresSession", value.asInstanceOf[js.Any])
    @scala.inline
    def setSizeInBytes(value: Double): Self = this.set("SizeInBytes", value.asInstanceOf[js.Any])
  }
  
}

