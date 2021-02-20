package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributePayload extends StObject {
  
  /**
    * A JSON string containing up to three key-value pair in JSON format. For example:  {\"attributes\":{\"string1\":\"string2\"}} 
    */
  var attributes: js.UndefOr[Attributes] = js.native
  
  /**
    * Specifies whether the list of attributes provided in the AttributePayload is merged with the attributes stored in the registry, instead of overwriting them. To remove an attribute, call UpdateThing with an empty attribute value.  The merge attribute is only valid when calling UpdateThing or UpdateThingGroup. 
    */
  var merge: js.UndefOr[Flag] = js.native
}
object AttributePayload {
  
  @scala.inline
  def apply(): AttributePayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributePayload]
  }
  
  @scala.inline
  implicit class AttributePayloadMutableBuilder[Self <: AttributePayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setMerge(value: Flag): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
  }
}
