package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource. For a list of supported resources, see ResourceTag. 
    */
  var ResourceArn: Arn
  
  /**
    * A list of tag keys associated with tags that need to be removed from the resource. If you specify a tag key that doesn't exist, it's ignored. Although the maximum number of array members is 200, user-tag maximum is 50. The remaining are reserved for Amazon Web Services use. 
    */
  var ResourceTagKeys: ResourceTagKeyList
}
object UntagResourceRequest {
  
  inline def apply(ResourceArn: Arn, ResourceTagKeys: ResourceTagKeyList): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], ResourceTagKeys = ResourceTagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
  
  extension [Self <: UntagResourceRequest](x: Self) {
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceTagKeys(value: ResourceTagKeyList): Self = StObject.set(x, "ResourceTagKeys", value.asInstanceOf[js.Any])
    
    inline def setResourceTagKeysVarargs(value: ResourceTagKey*): Self = StObject.set(x, "ResourceTagKeys", js.Array(value*))
  }
}
