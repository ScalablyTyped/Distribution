package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceCount extends StObject {
  
  /**
    * The number of resources.
    */
  var count: js.UndefOr[Long] = js.undefined
  
  /**
    * The resource type (for example, "AWS::EC2::Instance").
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
}
object ResourceCount {
  
  inline def apply(): ResourceCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceCount]
  }
  
  extension [Self <: ResourceCount](x: Self) {
    
    inline def setCount(value: Long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
