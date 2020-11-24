package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeNameAndValue extends js.Object {
  
  /**
    * The attribute name of the typed link.
    */
  var AttributeName: typings.awsSdk.clouddirectoryMod.AttributeName = js.native
  
  /**
    * The value for the typed link.
    */
  var Value: TypedAttributeValue = js.native
}
object AttributeNameAndValue {
  
  @scala.inline
  def apply(AttributeName: AttributeName, Value: TypedAttributeValue): AttributeNameAndValue = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeNameAndValue]
  }
  
  @scala.inline
  implicit class AttributeNameAndValueOps[Self <: AttributeNameAndValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttributeName(value: AttributeName): Self = this.set("AttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: TypedAttributeValue): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
}
