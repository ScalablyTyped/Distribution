package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypedAttributeValue extends StObject {
  
  /**
    * A binary data value.
    */
  var BinaryValue: js.UndefOr[BinaryAttributeValue] = js.native
  
  /**
    * A Boolean data value.
    */
  var BooleanValue: js.UndefOr[BooleanAttributeValue] = js.native
  
  /**
    * A date and time value.
    */
  var DatetimeValue: js.UndefOr[DatetimeAttributeValue] = js.native
  
  /**
    * A number data value.
    */
  var NumberValue: js.UndefOr[NumberAttributeValue] = js.native
  
  /**
    * A string data value.
    */
  var StringValue: js.UndefOr[StringAttributeValue] = js.native
}
object TypedAttributeValue {
  
  @scala.inline
  def apply(): TypedAttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypedAttributeValue]
  }
  
  @scala.inline
  implicit class TypedAttributeValueMutableBuilder[Self <: TypedAttributeValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinaryValue(value: BinaryAttributeValue): Self = StObject.set(x, "BinaryValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryValueUndefined: Self = StObject.set(x, "BinaryValue", js.undefined)
    
    @scala.inline
    def setBooleanValue(value: BooleanAttributeValue): Self = StObject.set(x, "BooleanValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBooleanValueUndefined: Self = StObject.set(x, "BooleanValue", js.undefined)
    
    @scala.inline
    def setDatetimeValue(value: DatetimeAttributeValue): Self = StObject.set(x, "DatetimeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatetimeValueUndefined: Self = StObject.set(x, "DatetimeValue", js.undefined)
    
    @scala.inline
    def setNumberValue(value: NumberAttributeValue): Self = StObject.set(x, "NumberValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberValueUndefined: Self = StObject.set(x, "NumberValue", js.undefined)
    
    @scala.inline
    def setStringValue(value: StringAttributeValue): Self = StObject.set(x, "StringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValueUndefined: Self = StObject.set(x, "StringValue", js.undefined)
  }
}
