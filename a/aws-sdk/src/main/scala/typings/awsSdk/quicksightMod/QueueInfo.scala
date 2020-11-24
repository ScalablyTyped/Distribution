package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueueInfo extends js.Object {
  
  /**
    * The ID of the ongoing ingestion. The queued ingestion is waiting for the ongoing ingestion to complete.
    */
  var QueuedIngestion: java.lang.String = js.native
  
  /**
    * The ID of the queued ingestion.
    */
  var WaitingOnIngestion: java.lang.String = js.native
}
object QueueInfo {
  
  @scala.inline
  def apply(QueuedIngestion: java.lang.String, WaitingOnIngestion: java.lang.String): QueueInfo = {
    val __obj = js.Dynamic.literal(QueuedIngestion = QueuedIngestion.asInstanceOf[js.Any], WaitingOnIngestion = WaitingOnIngestion.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueInfo]
  }
  
  @scala.inline
  implicit class QueueInfoOps[Self <: QueueInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setQueuedIngestion(value: java.lang.String): Self = this.set("QueuedIngestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitingOnIngestion(value: java.lang.String): Self = this.set("WaitingOnIngestion", value.asInstanceOf[js.Any])
  }
}
