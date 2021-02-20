package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotationValue extends StObject {
  
  /**
    * Value for a Boolean annotation.
    */
  var BooleanValue: js.UndefOr[NullableBoolean] = js.native
  
  /**
    * Value for a Number annotation.
    */
  var NumberValue: js.UndefOr[NullableDouble] = js.native
  
  /**
    * Value for a String annotation.
    */
  var StringValue: js.UndefOr[String] = js.native
}
object AnnotationValue {
  
  @scala.inline
  def apply(): AnnotationValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationValue]
  }
  
  @scala.inline
  implicit class AnnotationValueMutableBuilder[Self <: AnnotationValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBooleanValue(value: NullableBoolean): Self = StObject.set(x, "BooleanValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBooleanValueUndefined: Self = StObject.set(x, "BooleanValue", js.undefined)
    
    @scala.inline
    def setNumberValue(value: NullableDouble): Self = StObject.set(x, "NumberValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberValueUndefined: Self = StObject.set(x, "NumberValue", js.undefined)
    
    @scala.inline
    def setStringValue(value: String): Self = StObject.set(x, "StringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValueUndefined: Self = StObject.set(x, "StringValue", js.undefined)
  }
}
