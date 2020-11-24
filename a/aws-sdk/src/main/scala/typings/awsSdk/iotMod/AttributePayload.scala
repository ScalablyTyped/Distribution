package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributePayload extends js.Object {
  
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
  implicit class AttributePayloadOps[Self <: AttributePayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttributes(value: Attributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setMerge(value: Flag): Self = this.set("merge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerge: Self = this.set("merge", js.undefined)
  }
}
