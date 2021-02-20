package typings.awsSdk.sqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListQueueTagsRequest extends StObject {
  
  /**
    * The URL of the queue.
    */
  var QueueUrl: String = js.native
}
object ListQueueTagsRequest {
  
  @scala.inline
  def apply(QueueUrl: String): ListQueueTagsRequest = {
    val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListQueueTagsRequest]
  }
  
  @scala.inline
  implicit class ListQueueTagsRequestMutableBuilder[Self <: ListQueueTagsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
  }
}
