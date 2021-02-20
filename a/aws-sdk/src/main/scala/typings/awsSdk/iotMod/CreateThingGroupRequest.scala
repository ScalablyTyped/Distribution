package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateThingGroupRequest extends StObject {
  
  /**
    * The name of the parent thing group.
    */
  var parentGroupName: js.UndefOr[ThingGroupName] = js.native
  
  /**
    * Metadata which can be used to manage the thing group.
    */
  var tags: js.UndefOr[TagList] = js.native
  
  /**
    * The thing group name to create.
    */
  var thingGroupName: ThingGroupName = js.native
  
  /**
    * The thing group properties.
    */
  var thingGroupProperties: js.UndefOr[ThingGroupProperties] = js.native
}
object CreateThingGroupRequest {
  
  @scala.inline
  def apply(thingGroupName: ThingGroupName): CreateThingGroupRequest = {
    val __obj = js.Dynamic.literal(thingGroupName = thingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateThingGroupRequest]
  }
  
  @scala.inline
  implicit class CreateThingGroupRequestMutableBuilder[Self <: CreateThingGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParentGroupName(value: ThingGroupName): Self = StObject.set(x, "parentGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentGroupNameUndefined: Self = StObject.set(x, "parentGroupName", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setThingGroupName(value: ThingGroupName): Self = StObject.set(x, "thingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingGroupProperties(value: ThingGroupProperties): Self = StObject.set(x, "thingGroupProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingGroupPropertiesUndefined: Self = StObject.set(x, "thingGroupProperties", js.undefined)
  }
}
