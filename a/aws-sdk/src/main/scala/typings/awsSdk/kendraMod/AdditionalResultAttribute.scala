package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdditionalResultAttribute extends js.Object {
  
  /**
    * The key that identifies the attribute.
    */
  var Key: String = js.native
  
  /**
    * An object that contains the attribute value.
    */
  var Value: AdditionalResultAttributeValue = js.native
  
  /**
    * The data type of the Value property.
    */
  var ValueType: AdditionalResultAttributeValueType = js.native
}
object AdditionalResultAttribute {
  
  @scala.inline
  def apply(Key: String, Value: AdditionalResultAttributeValue, ValueType: AdditionalResultAttributeValueType): AdditionalResultAttribute = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], ValueType = ValueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalResultAttribute]
  }
  
  @scala.inline
  implicit class AdditionalResultAttributeOps[Self <: AdditionalResultAttribute] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: AdditionalResultAttributeValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueType(value: AdditionalResultAttributeValueType): Self = this.set("ValueType", value.asInstanceOf[js.Any])
  }
}
