package typings.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceIdentifier extends StObject {
  
  /**
    * The ARN of a resource.
    */
  var ResourceArn: js.UndefOr[typings.awsSdk.resourcegroupsMod.ResourceArn] = js.undefined
  
  /**
    * The resource type of a resource, such as AWS::EC2::Instance.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.resourcegroupsMod.ResourceType] = js.undefined
}
object ResourceIdentifier {
  
  inline def apply(): ResourceIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceIdentifier]
  }
  
  extension [Self <: ResourceIdentifier](x: Self) {
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
