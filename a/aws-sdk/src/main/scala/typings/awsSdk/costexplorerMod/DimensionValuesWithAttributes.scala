package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DimensionValuesWithAttributes extends StObject {
  
  /**
    * The attribute that applies to a specific Dimension.
    */
  var Attributes: js.UndefOr[typings.awsSdk.costexplorerMod.Attributes] = js.native
  
  /**
    * The value of a dimension with a specific attribute.
    */
  var Value: js.UndefOr[typings.awsSdk.costexplorerMod.Value] = js.native
}
object DimensionValuesWithAttributes {
  
  @scala.inline
  def apply(): DimensionValuesWithAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionValuesWithAttributes]
  }
  
  @scala.inline
  implicit class DimensionValuesWithAttributesMutableBuilder[Self <: DimensionValuesWithAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: Attributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setValue(value: Value): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
