package typings.awsSdk.servicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeGroup extends StObject {
  
  /**
    * The Amazon resource name (ARN) that specifies the attribute group across services.
    */
  var arn: js.UndefOr[AttributeGroupArn] = js.undefined
  
  /**
    * The ISO-8601 formatted timestamp of the moment the attribute group was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The description of the attribute group that the user provides.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The globally unique attribute group identifier of the attribute group.
    */
  var id: js.UndefOr[AttributeGroupId] = js.undefined
  
  /**
    * The ISO-8601 formatted timestamp of the moment the attribute group was last updated. This time is the same as the creationTime for a newly created attribute group.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The name of the attribute group.
    */
  var name: js.UndefOr[Name] = js.undefined
  
  /**
    * Key-value pairs you can use to associate with the attribute group.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object AttributeGroup {
  
  @scala.inline
  def apply(): AttributeGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeGroup]
  }
  
  @scala.inline
  implicit class AttributeGroupMutableBuilder[Self <: AttributeGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: AttributeGroupArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: AttributeGroupId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLastUpdateTime(value: Timestamp): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
