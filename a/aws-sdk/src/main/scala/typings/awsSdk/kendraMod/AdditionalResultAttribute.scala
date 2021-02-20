package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdditionalResultAttribute extends StObject {
  
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
  implicit class AdditionalResultAttributeMutableBuilder[Self <: AdditionalResultAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: AdditionalResultAttributeValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueType(value: AdditionalResultAttributeValueType): Self = StObject.set(x, "ValueType", value.asInstanceOf[js.Any])
  }
}
