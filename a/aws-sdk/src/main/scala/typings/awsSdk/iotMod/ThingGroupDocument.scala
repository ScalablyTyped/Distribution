package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThingGroupDocument extends StObject {
  
  /**
    * The thing group attributes.
    */
  var attributes: js.UndefOr[Attributes] = js.undefined
  
  /**
    * Parent group names.
    */
  var parentGroupNames: js.UndefOr[ThingGroupNameList] = js.undefined
  
  /**
    * The thing group description.
    */
  var thingGroupDescription: js.UndefOr[ThingGroupDescription] = js.undefined
  
  /**
    * The thing group ID.
    */
  var thingGroupId: js.UndefOr[ThingGroupId] = js.undefined
  
  /**
    * The thing group name.
    */
  var thingGroupName: js.UndefOr[ThingGroupName] = js.undefined
}
object ThingGroupDocument {
  
  @scala.inline
  def apply(): ThingGroupDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingGroupDocument]
  }
  
  @scala.inline
  implicit class ThingGroupDocumentMutableBuilder[Self <: ThingGroupDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setParentGroupNames(value: ThingGroupNameList): Self = StObject.set(x, "parentGroupNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentGroupNamesUndefined: Self = StObject.set(x, "parentGroupNames", js.undefined)
    
    @scala.inline
    def setParentGroupNamesVarargs(value: ThingGroupName*): Self = StObject.set(x, "parentGroupNames", js.Array(value :_*))
    
    @scala.inline
    def setThingGroupDescription(value: ThingGroupDescription): Self = StObject.set(x, "thingGroupDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingGroupDescriptionUndefined: Self = StObject.set(x, "thingGroupDescription", js.undefined)
    
    @scala.inline
    def setThingGroupId(value: ThingGroupId): Self = StObject.set(x, "thingGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingGroupIdUndefined: Self = StObject.set(x, "thingGroupId", js.undefined)
    
    @scala.inline
    def setThingGroupName(value: ThingGroupName): Self = StObject.set(x, "thingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingGroupNameUndefined: Self = StObject.set(x, "thingGroupName", js.undefined)
  }
}
