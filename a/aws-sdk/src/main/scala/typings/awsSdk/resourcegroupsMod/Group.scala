package typings.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Group extends StObject {
  
  /**
    * The description of the resource group.
    */
  var Description: js.UndefOr[typings.awsSdk.resourcegroupsMod.Description] = js.undefined
  
  /**
    * The ARN of the resource group.
    */
  var GroupArn: typings.awsSdk.resourcegroupsMod.GroupArn
  
  /**
    * The name of the resource group.
    */
  var Name: GroupName
}
object Group {
  
  inline def apply(GroupArn: GroupArn, Name: GroupName): Group = {
    val __obj = js.Dynamic.literal(GroupArn = GroupArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
  
  extension [Self <: Group](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setGroupArn(value: GroupArn): Self = StObject.set(x, "GroupArn", value.asInstanceOf[js.Any])
    
    inline def setName(value: GroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
