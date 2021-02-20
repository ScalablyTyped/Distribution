package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypedAttributeValueRange extends StObject {
  
  /**
    * The inclusive or exclusive range end.
    */
  var EndMode: RangeMode = js.native
  
  /**
    * The attribute value to terminate the range at.
    */
  var EndValue: js.UndefOr[TypedAttributeValue] = js.native
  
  /**
    * The inclusive or exclusive range start.
    */
  var StartMode: RangeMode = js.native
  
  /**
    * The value to start the range at.
    */
  var StartValue: js.UndefOr[TypedAttributeValue] = js.native
}
object TypedAttributeValueRange {
  
  @scala.inline
  def apply(EndMode: RangeMode, StartMode: RangeMode): TypedAttributeValueRange = {
    val __obj = js.Dynamic.literal(EndMode = EndMode.asInstanceOf[js.Any], StartMode = StartMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedAttributeValueRange]
  }
  
  @scala.inline
  implicit class TypedAttributeValueRangeMutableBuilder[Self <: TypedAttributeValueRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndMode(value: RangeMode): Self = StObject.set(x, "EndMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndValue(value: TypedAttributeValue): Self = StObject.set(x, "EndValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndValueUndefined: Self = StObject.set(x, "EndValue", js.undefined)
    
    @scala.inline
    def setStartMode(value: RangeMode): Self = StObject.set(x, "StartMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartValue(value: TypedAttributeValue): Self = StObject.set(x, "StartValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartValueUndefined: Self = StObject.set(x, "StartValue", js.undefined)
  }
}
