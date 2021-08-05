package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueueInfo extends StObject {
  
  /**
    * The ID of the ongoing ingestion. The queued ingestion is waiting for the ongoing ingestion to complete.
    */
  var QueuedIngestion: java.lang.String
  
  /**
    * The ID of the queued ingestion.
    */
  var WaitingOnIngestion: java.lang.String
}
object QueueInfo {
  
  inline def apply(QueuedIngestion: java.lang.String, WaitingOnIngestion: java.lang.String): QueueInfo = {
    val __obj = js.Dynamic.literal(QueuedIngestion = QueuedIngestion.asInstanceOf[js.Any], WaitingOnIngestion = WaitingOnIngestion.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueInfo]
  }
  
  extension [Self <: QueueInfo](x: Self) {
    
    inline def setQueuedIngestion(value: java.lang.String): Self = StObject.set(x, "QueuedIngestion", value.asInstanceOf[js.Any])
    
    inline def setWaitingOnIngestion(value: java.lang.String): Self = StObject.set(x, "WaitingOnIngestion", value.asInstanceOf[js.Any])
  }
}
