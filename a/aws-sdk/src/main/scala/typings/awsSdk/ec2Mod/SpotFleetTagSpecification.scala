package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpotFleetTagSpecification extends StObject {
  
  /**
    * The type of resource. Currently, the only resource type that is supported is instance. To tag the Spot Fleet request on creation, use the TagSpecifications parameter in  SpotFleetRequestConfigData .
    */
  var ResourceType: js.UndefOr[typings.awsSdk.ec2Mod.ResourceType] = js.undefined
  
  /**
    * The tags.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object SpotFleetTagSpecification {
  
  inline def apply(): SpotFleetTagSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotFleetTagSpecification]
  }
  
  extension [Self <: SpotFleetTagSpecification](x: Self) {
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
