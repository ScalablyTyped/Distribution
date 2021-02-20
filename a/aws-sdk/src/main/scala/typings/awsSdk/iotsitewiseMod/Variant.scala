package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Variant extends StObject {
  
  /**
    * Asset property data of type Boolean (true or false).
    */
  var booleanValue: js.UndefOr[PropertyValueBooleanValue] = js.native
  
  /**
    * Asset property data of type double (floating point number).
    */
  var doubleValue: js.UndefOr[PropertyValueDoubleValue] = js.native
  
  /**
    * Asset property data of type integer (whole number).
    */
  var integerValue: js.UndefOr[PropertyValueIntegerValue] = js.native
  
  /**
    * Asset property data of type string (sequence of characters).
    */
  var stringValue: js.UndefOr[PropertyValueStringValue] = js.native
}
object Variant {
  
  @scala.inline
  def apply(): Variant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Variant]
  }
  
  @scala.inline
  implicit class VariantMutableBuilder[Self <: Variant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBooleanValue(value: PropertyValueBooleanValue): Self = StObject.set(x, "booleanValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBooleanValueUndefined: Self = StObject.set(x, "booleanValue", js.undefined)
    
    @scala.inline
    def setDoubleValue(value: PropertyValueDoubleValue): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleValueUndefined: Self = StObject.set(x, "doubleValue", js.undefined)
    
    @scala.inline
    def setIntegerValue(value: PropertyValueIntegerValue): Self = StObject.set(x, "integerValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegerValueUndefined: Self = StObject.set(x, "integerValue", js.undefined)
    
    @scala.inline
    def setStringValue(value: PropertyValueStringValue): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
