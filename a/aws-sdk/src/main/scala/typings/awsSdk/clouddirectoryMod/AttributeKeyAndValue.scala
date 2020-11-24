package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeKeyAndValue extends js.Object {
  
  /**
    * The key of the attribute.
    */
  var Key: AttributeKey = js.native
  
  /**
    * The value of the attribute.
    */
  var Value: TypedAttributeValue = js.native
}
object AttributeKeyAndValue {
  
  @scala.inline
  def apply(Key: AttributeKey, Value: TypedAttributeValue): AttributeKeyAndValue = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeKeyAndValue]
  }
  
  @scala.inline
  implicit class AttributeKeyAndValueOps[Self <: AttributeKeyAndValue] (val x: Self) extends AnyVal {
    
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
    def setKey(value: AttributeKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: TypedAttributeValue): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
}
