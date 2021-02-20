package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UntagLogGroupRequest extends StObject {
  
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName = js.native
  
  /**
    * The tag keys. The corresponding tags are removed from the log group.
    */
  var tags: TagList = js.native
}
object UntagLogGroupRequest {
  
  @scala.inline
  def apply(logGroupName: LogGroupName, tags: TagList): UntagLogGroupRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagLogGroupRequest]
  }
  
  @scala.inline
  implicit class UntagLogGroupRequestMutableBuilder[Self <: UntagLogGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: TagKey*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
