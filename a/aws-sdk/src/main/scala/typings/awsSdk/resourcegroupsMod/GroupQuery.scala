package typings.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupQuery extends StObject {
  
  /**
    * The name of the resource group that is associated with the specified resource query.
    */
  var GroupName: typings.awsSdk.resourcegroupsMod.GroupName = js.native
  
  /**
    * The resource query that determines which AWS resources are members of the associated resource group.
    */
  var ResourceQuery: typings.awsSdk.resourcegroupsMod.ResourceQuery = js.native
}
object GroupQuery {
  
  @scala.inline
  def apply(GroupName: GroupName, ResourceQuery: ResourceQuery): GroupQuery = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any], ResourceQuery = ResourceQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupQuery]
  }
  
  @scala.inline
  implicit class GroupQueryMutableBuilder[Self <: GroupQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupName(value: GroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceQuery(value: ResourceQuery): Self = StObject.set(x, "ResourceQuery", value.asInstanceOf[js.Any])
  }
}
