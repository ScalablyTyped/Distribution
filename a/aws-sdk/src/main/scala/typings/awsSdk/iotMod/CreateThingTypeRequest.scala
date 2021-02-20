package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateThingTypeRequest extends StObject {
  
  /**
    * Metadata which can be used to manage the thing type.
    */
  var tags: js.UndefOr[TagList] = js.native
  
  /**
    * The name of the thing type.
    */
  var thingTypeName: ThingTypeName = js.native
  
  /**
    * The ThingTypeProperties for the thing type to create. It contains information about the new thing type including a description, and a list of searchable thing attribute names.
    */
  var thingTypeProperties: js.UndefOr[ThingTypeProperties] = js.native
}
object CreateThingTypeRequest {
  
  @scala.inline
  def apply(thingTypeName: ThingTypeName): CreateThingTypeRequest = {
    val __obj = js.Dynamic.literal(thingTypeName = thingTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateThingTypeRequest]
  }
  
  @scala.inline
  implicit class CreateThingTypeRequestMutableBuilder[Self <: CreateThingTypeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setThingTypeName(value: ThingTypeName): Self = StObject.set(x, "thingTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingTypeProperties(value: ThingTypeProperties): Self = StObject.set(x, "thingTypeProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingTypePropertiesUndefined: Self = StObject.set(x, "thingTypeProperties", js.undefined)
  }
}
