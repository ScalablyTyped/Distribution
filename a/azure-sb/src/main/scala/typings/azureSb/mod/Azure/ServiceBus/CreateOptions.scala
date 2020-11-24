package typings.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*
  * Options interfaces
  */
@js.native
trait CreateOptions extends js.Object {
  
  var DefaultMessageTimeToLive: String = js.native
  
  var DuplicateDetectionHistoryTimeWindow: String = js.native
  
  var EnablePartitioning: Boolean = js.native
  
  var MaxSizeInMegabytes: Double = js.native
  
  var RequiresDuplicateDetection: Boolean = js.native
}
object CreateOptions {
  
  @scala.inline
  def apply(
    DefaultMessageTimeToLive: String,
    DuplicateDetectionHistoryTimeWindow: String,
    EnablePartitioning: Boolean,
    MaxSizeInMegabytes: Double,
    RequiresDuplicateDetection: Boolean
  ): CreateOptions = {
    val __obj = js.Dynamic.literal(DefaultMessageTimeToLive = DefaultMessageTimeToLive.asInstanceOf[js.Any], DuplicateDetectionHistoryTimeWindow = DuplicateDetectionHistoryTimeWindow.asInstanceOf[js.Any], EnablePartitioning = EnablePartitioning.asInstanceOf[js.Any], MaxSizeInMegabytes = MaxSizeInMegabytes.asInstanceOf[js.Any], RequiresDuplicateDetection = RequiresDuplicateDetection.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOptions]
  }
  
  @scala.inline
  implicit class CreateOptionsOps[Self <: CreateOptions] (val x: Self) extends AnyVal {
    
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
    def setDuplicateDetectionHistoryTimeWindow(value: String): Self = this.set("DuplicateDetectionHistoryTimeWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePartitioning(value: Boolean): Self = this.set("EnablePartitioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSizeInMegabytes(value: Double): Self = this.set("MaxSizeInMegabytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiresDuplicateDetection(value: Boolean): Self = this.set("RequiresDuplicateDetection", value.asInstanceOf[js.Any])
  }
}
