package typings.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGroupQueryInput extends StObject {
  
  /**
    * The name or the ARN of the resource group to query.
    */
  var Group: js.UndefOr[GroupString] = js.undefined
  
  /**
    * Don't use this parameter. Use Group instead.
    */
  var GroupName: js.UndefOr[typings.awsSdk.resourcegroupsMod.GroupName] = js.undefined
  
  /**
    * The resource query to determine which AWS resources are members of this resource group.
    */
  var ResourceQuery: typings.awsSdk.resourcegroupsMod.ResourceQuery
}
object UpdateGroupQueryInput {
  
  inline def apply(ResourceQuery: ResourceQuery): UpdateGroupQueryInput = {
    val __obj = js.Dynamic.literal(ResourceQuery = ResourceQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGroupQueryInput]
  }
  
  extension [Self <: UpdateGroupQueryInput](x: Self) {
    
    inline def setGroup(value: GroupString): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setGroupName(value: GroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    inline def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
    
    inline def setResourceQuery(value: ResourceQuery): Self = StObject.set(x, "ResourceQuery", value.asInstanceOf[js.Any])
  }
}
