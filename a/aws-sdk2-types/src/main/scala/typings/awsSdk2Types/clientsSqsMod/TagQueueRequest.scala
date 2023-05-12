package typings.awsSdk2Types.clientsSqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagQueueRequest extends StObject {
  
  /**
    * The URL of the queue.
    */
  var QueueUrl: String
  
  /**
    * The list of tags to be added to the specified queue.
    */
  var Tags: TagMap
}
object TagQueueRequest {
  
  inline def apply(QueueUrl: String, Tags: TagMap): TagQueueRequest = {
    val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagQueueRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagQueueRequest] (val x: Self) extends AnyVal {
    
    inline def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
  }
}
