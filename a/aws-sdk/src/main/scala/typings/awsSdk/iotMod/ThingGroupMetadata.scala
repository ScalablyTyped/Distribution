package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThingGroupMetadata extends StObject {
  
  /**
    * The UNIX timestamp of when the thing group was created.
    */
  var creationDate: js.UndefOr[CreationDate] = js.undefined
  
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
  
  @scala.inline
  def apply(): ThingGroupMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingGroupMetadata]
  }
  
  @scala.inline
  implicit class ThingGroupMetadataMutableBuilder[Self <: ThingGroupMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: CreationDate): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    @scala.inline
    def setParentGroupName(value: ThingGroupName): Self = StObject.set(x, "parentGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentGroupNameUndefined: Self = StObject.set(x, "parentGroupName", js.undefined)
    
    @scala.inline
    def setRootToParentThingGroups(value: ThingGroupNameAndArnList): Self = StObject.set(x, "rootToParentThingGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootToParentThingGroupsUndefined: Self = StObject.set(x, "rootToParentThingGroups", js.undefined)
    
    @scala.inline
    def setRootToParentThingGroupsVarargs(value: GroupNameAndArn*): Self = StObject.set(x, "rootToParentThingGroups", js.Array(value :_*))
  }
}
