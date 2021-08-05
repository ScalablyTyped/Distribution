package typings.awsSdk.resourcegroupstaggingapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourcesInput extends StObject {
  
  /**
    * A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies a resource. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var ResourceARNList: typings.awsSdk.resourcegroupstaggingapiMod.ResourceARNList
  
  /**
    * A list of the tag keys that you want to remove from the specified resources.
    */
  var TagKeys: TagKeyListForUntag
}
object UntagResourcesInput {
  
  inline def apply(ResourceARNList: ResourceARNList, TagKeys: TagKeyListForUntag): UntagResourcesInput = {
    val __obj = js.Dynamic.literal(ResourceARNList = ResourceARNList.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourcesInput]
  }
  
  extension [Self <: UntagResourcesInput](x: Self) {
    
    inline def setResourceARNList(value: ResourceARNList): Self = StObject.set(x, "ResourceARNList", value.asInstanceOf[js.Any])
    
    inline def setResourceARNListVarargs(value: ResourceARN*): Self = StObject.set(x, "ResourceARNList", js.Array(value :_*))
    
    inline def setTagKeys(value: TagKeyListForUntag): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value :_*))
  }
}
