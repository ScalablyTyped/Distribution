package typings.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGroupOutput extends StObject {
  
  /**
    * The description of the resource group.
    */
  var Group: js.UndefOr[typings.awsSdk.resourcegroupsMod.Group] = js.undefined
  
  /**
    * The service configuration associated with the resource group. AWS Resource Groups supports adding service configurations for the following resource group types:    AWS::EC2::CapacityReservationPool - Amazon EC2 capacity reservation pools. For more information, see Working with capacity reservation groups in the EC2 Users Guide.  
    */
  var GroupConfiguration: js.UndefOr[typings.awsSdk.resourcegroupsMod.GroupConfiguration] = js.undefined
  
  /**
    * The resource query associated with the group.
    */
  var ResourceQuery: js.UndefOr[typings.awsSdk.resourcegroupsMod.ResourceQuery] = js.undefined
  
  /**
    * The tags associated with the group.
    */
  var Tags: js.UndefOr[typings.awsSdk.resourcegroupsMod.Tags] = js.undefined
}
object CreateGroupOutput {
  
  inline def apply(): CreateGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGroupOutput]
  }
  
  extension [Self <: CreateGroupOutput](x: Self) {
    
    inline def setGroup(value: Group): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setGroupConfiguration(value: GroupConfiguration): Self = StObject.set(x, "GroupConfiguration", value.asInstanceOf[js.Any])
    
    inline def setGroupConfigurationUndefined: Self = StObject.set(x, "GroupConfiguration", js.undefined)
    
    inline def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
    
    inline def setResourceQuery(value: ResourceQuery): Self = StObject.set(x, "ResourceQuery", value.asInstanceOf[js.Any])
    
    inline def setResourceQueryUndefined: Self = StObject.set(x, "ResourceQuery", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
