package typings.awsSdk.sqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagQueueRequest extends StObject {
  
  /**
    * The URL of the queue.
    */
  var QueueUrl: String = js.native
  
  /**
    * The list of tags to be added to the specified queue.
    */
  var Tags: TagMap = js.native
}
object TagQueueRequest {
  
  @scala.inline
  def apply(QueueUrl: String, Tags: TagMap): TagQueueRequest = {
    val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagQueueRequest]
  }
  
  @scala.inline
  implicit class TagQueueRequestMutableBuilder[Self <: TagQueueRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
  }
}
