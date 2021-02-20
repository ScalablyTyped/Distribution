package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueueInfo extends StObject {
  
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
  implicit class QueueInfoMutableBuilder[Self <: QueueInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueuedIngestion(value: java.lang.String): Self = StObject.set(x, "QueuedIngestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitingOnIngestion(value: java.lang.String): Self = StObject.set(x, "WaitingOnIngestion", value.asInstanceOf[js.Any])
  }
}
