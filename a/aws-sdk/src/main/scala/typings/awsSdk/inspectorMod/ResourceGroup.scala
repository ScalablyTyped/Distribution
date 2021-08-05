package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceGroup extends StObject {
  
  /**
    * The ARN of the resource group.
    */
  var arn: Arn
  
  /**
    * The time at which resource group is created.
    */
  var createdAt: Timestamp
  
  /**
    * The tags (key and value pairs) of the resource group. This data type property is used in the CreateResourceGroup action.
    */
  var tags: ResourceGroupTags
}
object ResourceGroup {
  
  inline def apply(arn: Arn, createdAt: Timestamp, tags: ResourceGroupTags): ResourceGroup = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceGroup]
  }
  
  extension [Self <: ResourceGroup](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: Timestamp): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setTags(value: ResourceGroupTags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: ResourceGroupTag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
