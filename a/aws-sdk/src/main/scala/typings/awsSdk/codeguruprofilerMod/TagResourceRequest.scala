package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceRequest extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the resource that the tags are added to. 
    */
  var resourceArn: ProfilingGroupArn
  
  /**
    *  The list of tags that are added to the specified resource. 
    */
  var tags: TagsMap
}
object TagResourceRequest {
  
  @scala.inline
  def apply(resourceArn: ProfilingGroupArn, tags: TagsMap): TagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
  
  @scala.inline
  implicit class TagResourceRequestMutableBuilder[Self <: TagResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: ProfilingGroupArn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
  }
}
