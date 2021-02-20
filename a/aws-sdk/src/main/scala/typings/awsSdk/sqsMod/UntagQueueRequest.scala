package typings.awsSdk.sqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UntagQueueRequest extends StObject {
  
  /**
    * The URL of the queue.
    */
  var QueueUrl: String = js.native
  
  /**
    * The list of tags to be removed from the specified queue.
    */
  var TagKeys: TagKeyList = js.native
}
object UntagQueueRequest {
  
  @scala.inline
  def apply(QueueUrl: String, TagKeys: TagKeyList): UntagQueueRequest = {
    val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagQueueRequest]
  }
  
  @scala.inline
  implicit class UntagQueueRequestMutableBuilder[Self <: UntagQueueRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeys(value: TagKeyList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value :_*))
  }
}
