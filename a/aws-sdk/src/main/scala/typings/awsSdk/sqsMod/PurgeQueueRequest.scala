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
  
  @scala.inline
  def apply(QueueUrl: String): PurgeQueueRequest = {
    val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurgeQueueRequest]
  }
  
  @scala.inline
  implicit class PurgeQueueRequestMutableBuilder[Self <: PurgeQueueRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
  }
}
