package typings.azureCoreHttp.serializerMod

import typings.azureCoreHttp.azureCoreHttpBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapperConstraints extends StObject {
  
  /**
    * The value should be less than the `ExclusiveMaximum` value.
    */
  var ExclusiveMaximum: js.UndefOr[Double] = js.undefined
  
  /**
    * The value should be greater than the `InclusiveMinimum` value.
    */
  var ExclusiveMinimum: js.UndefOr[Double] = js.undefined
  
  /**
    * The value should be less than or equal to the `InclusiveMaximum` value.
    */
  var InclusiveMaximum: js.UndefOr[Double] = js.undefined
  
  /**
    * The value should be greater than or equal to the `InclusiveMinimum` value.
    */
  var InclusiveMinimum: js.UndefOr[Double] = js.undefined
  
  /**
    * The value must contain fewer items than the MaxItems value.
    */
  var MaxItems: js.UndefOr[Double] = js.undefined
  
  /**
    * The length should be smaller than the `MaxLength`.
    */
  var MaxLength: js.UndefOr[Double] = js.undefined
  
  /**
    * The value must contain more items than the `MinItems` value.
    */
  var MinItems: js.UndefOr[Double] = js.undefined
  
  /**
    * The length should be bigger than the `MinLength`.
    */
  var MinLength: js.UndefOr[Double] = js.undefined
  
  /**
    * The value should be exactly divisible by the `MultipleOf` value.
    */
  var MultipleOf: js.UndefOr[Double] = js.undefined
  
  /**
    * The value must match the pattern.
    */
  var Pattern: js.UndefOr[js.RegExp] = js.undefined
  
  /**
    * The value must contain only unique items.
    */
  var UniqueItems: js.UndefOr[`true`] = js.undefined
}
object MapperConstraints {
  
  inline def apply(): MapperConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapperConstraints]
  }
  
  extension [Self <: MapperConstraints](x: Self) {
    
    inline def setExclusiveMaximum(value: Double): Self = StObject.set(x, "ExclusiveMaximum", value.asInstanceOf[js.Any])
    
    inline def setExclusiveMaximumUndefined: Self = StObject.set(x, "ExclusiveMaximum", js.undefined)
    
    inline def setExclusiveMinimum(value: Double): Self = StObject.set(x, "ExclusiveMinimum", value.asInstanceOf[js.Any])
    
    inline def setExclusiveMinimumUndefined: Self = StObject.set(x, "ExclusiveMinimum", js.undefined)
    
    inline def setInclusiveMaximum(value: Double): Self = StObject.set(x, "InclusiveMaximum", value.asInstanceOf[js.Any])
    
    inline def setInclusiveMaximumUndefined: Self = StObject.set(x, "InclusiveMaximum", js.undefined)
    
    inline def setInclusiveMinimum(value: Double): Self = StObject.set(x, "InclusiveMinimum", value.asInstanceOf[js.Any])
    
    inline def setInclusiveMinimumUndefined: Self = StObject.set(x, "InclusiveMinimum", js.undefined)
    
    inline def setMaxItems(value: Double): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "MaxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "MaxLength", js.undefined)
    
    inline def setMinItems(value: Double): Self = StObject.set(x, "MinItems", value.asInstanceOf[js.Any])
    
    inline def setMinItemsUndefined: Self = StObject.set(x, "MinItems", js.undefined)
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "MinLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "MinLength", js.undefined)
    
    inline def setMultipleOf(value: Double): Self = StObject.set(x, "MultipleOf", value.asInstanceOf[js.Any])
    
    inline def setMultipleOfUndefined: Self = StObject.set(x, "MultipleOf", js.undefined)
    
    inline def setPattern(value: js.RegExp): Self = StObject.set(x, "Pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "Pattern", js.undefined)
    
    inline def setUniqueItems(value: `true`): Self = StObject.set(x, "UniqueItems", value.asInstanceOf[js.Any])
    
    inline def setUniqueItemsUndefined: Self = StObject.set(x, "UniqueItems", js.undefined)
  }
}
