package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetTagsForResourceRequest extends StObject {
  
  /**
    * The ARN of the assessment template that you want to set tags to.
    */
  var resourceArn: Arn
  
  /**
    * A collection of key and value pairs that you want to set to the assessment template.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object SetTagsForResourceRequest {
  
  inline def apply(resourceArn: Arn): SetTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTagsForResourceRequest]
  }
  
  extension [Self <: SetTagsForResourceRequest](x: Self) {
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
