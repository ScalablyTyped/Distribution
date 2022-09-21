package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThingGroupMetadata extends StObject {
  
  /**
    * The UNIX timestamp of when the thing group was created.
    */
  var creationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The parent thing group name.
    */
  var parentGroupName: js.UndefOr[ThingGroupName] = js.undefined
  
  /**
    * The root parent thing group.
    */
  var rootToParentThingGroups: js.UndefOr[ThingGroupNameAndArnList] = js.undefined
}
object ThingGroupMetadata {
  
  inline def apply(): ThingGroupMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingGroupMetadata]
  }
  
  extension [Self <: ThingGroupMetadata](x: Self) {
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setParentGroupName(value: ThingGroupName): Self = StObject.set(x, "parentGroupName", value.asInstanceOf[js.Any])
    
    inline def setParentGroupNameUndefined: Self = StObject.set(x, "parentGroupName", js.undefined)
    
    inline def setRootToParentThingGroups(value: ThingGroupNameAndArnList): Self = StObject.set(x, "rootToParentThingGroups", value.asInstanceOf[js.Any])
    
    inline def setRootToParentThingGroupsUndefined: Self = StObject.set(x, "rootToParentThingGroups", js.undefined)
    
    inline def setRootToParentThingGroupsVarargs(value: GroupNameAndArn*): Self = StObject.set(x, "rootToParentThingGroups", js.Array(value*))
  }
}
