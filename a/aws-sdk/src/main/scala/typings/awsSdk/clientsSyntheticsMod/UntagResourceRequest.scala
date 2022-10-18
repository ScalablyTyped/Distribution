package typings.awsSdk.clientsSyntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceRequest extends StObject {
  
  /**
    * The ARN of the canary or group that you're removing tags from. The ARN format of a canary is arn:aws:synthetics:Region:account-id:canary:canary-name . The ARN format of a group is arn:aws:synthetics:Region:account-id:group:group-name  
    */
  var ResourceArn: typings.awsSdk.clientsSyntheticsMod.ResourceArn
  
  /**
    * The list of tag keys to remove from the resource.
    */
  var TagKeys: TagKeyList
}
object UntagResourceRequest {
  
  inline def apply(ResourceArn: ResourceArn, TagKeys: TagKeyList): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
  
  extension [Self <: UntagResourceRequest](x: Self) {
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: TagKeyList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value*))
  }
}
