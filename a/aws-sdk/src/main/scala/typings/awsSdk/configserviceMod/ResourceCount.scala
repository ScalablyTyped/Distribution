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
  
  @scala.inline
  def apply(): ResourceCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceCount]
  }
  
  @scala.inline
  implicit class ResourceCountMutableBuilder[Self <: ResourceCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
