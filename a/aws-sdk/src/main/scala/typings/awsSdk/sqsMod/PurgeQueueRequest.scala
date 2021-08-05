package typings.awsSdk.sqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurgeQueueRequest extends StObject {
  
  /**
    * The URL of the queue from which the PurgeQueue action deletes messages. Queue URLs and names are case-sensitive.
    */
  var QueueUrl: String
}
object PurgeQueueRequest {
  
  inline def apply(QueueUrl: String): PurgeQueueRequest = {
    val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurgeQueueRequest]
  }
  
  extension [Self <: PurgeQueueRequest](x: Self) {
    
    inline def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
  }
}
