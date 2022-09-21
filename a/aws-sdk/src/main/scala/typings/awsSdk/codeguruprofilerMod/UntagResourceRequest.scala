package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceRequest extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the resource that contains the tags to remove. 
    */
  var resourceArn: ProfilingGroupArn
  
  /**
    *  A list of tag keys. Existing tags of resources with keys in this list are removed from the specified resource. 
    */
  var tagKeys: TagKeys
}
object UntagResourceRequest {
  
  inline def apply(resourceArn: ProfilingGroupArn, tagKeys: TagKeys): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], tagKeys = tagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
  
  extension [Self <: UntagResourceRequest](x: Self) {
    
    inline def setResourceArn(value: ProfilingGroupArn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: TagKeys): Self = StObject.set(x, "tagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: String*): Self = StObject.set(x, "tagKeys", js.Array(value*))
  }
}
