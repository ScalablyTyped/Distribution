package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddThingsToThingGroupParams extends StObject {
  
  /**
    * Specifies if this mitigation action can move the things that triggered the mitigation action even if they are part of one or more dynamic things groups.
    */
  var overrideDynamicGroups: js.UndefOr[OverrideDynamicGroups] = js.undefined
  
  /**
    * The list of groups to which you want to add the things that triggered the mitigation action. You can add a thing to a maximum of 10 groups, but you cannot add a thing to more than one group in the same hierarchy.
    */
  var thingGroupNames: ThingGroupNames
}
object AddThingsToThingGroupParams {
  
  inline def apply(thingGroupNames: ThingGroupNames): AddThingsToThingGroupParams = {
    val __obj = js.Dynamic.literal(thingGroupNames = thingGroupNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddThingsToThingGroupParams]
  }
  
  extension [Self <: AddThingsToThingGroupParams](x: Self) {
    
    inline def setOverrideDynamicGroups(value: OverrideDynamicGroups): Self = StObject.set(x, "overrideDynamicGroups", value.asInstanceOf[js.Any])
    
    inline def setOverrideDynamicGroupsUndefined: Self = StObject.set(x, "overrideDynamicGroups", js.undefined)
    
    inline def setThingGroupNames(value: ThingGroupNames): Self = StObject.set(x, "thingGroupNames", value.asInstanceOf[js.Any])
    
    inline def setThingGroupNamesVarargs(value: ThingGroupName*): Self = StObject.set(x, "thingGroupNames", js.Array(value :_*))
  }
}
