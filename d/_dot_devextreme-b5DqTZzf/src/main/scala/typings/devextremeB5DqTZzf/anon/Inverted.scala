package typings.devextremeB5DqTZzf.anon

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.continuous
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.datetime
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.logarithmic
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.numeric
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.string_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inverted extends StObject {
  
  /**
    * Indicates whether or not the chart&apos;s value axis must be inverted.
    */
  var inverted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the value to be raised to a power when generating ticks for a logarithmic value axis.
    */
  var logarithmBase: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the maximum value of the chart&apos;s value axis.
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the minimum value of the chart&apos;s value axis.
    */
  var min: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the type of the value axis.
    */
  var `type`: js.UndefOr[continuous | logarithmic] = js.undefined
  
  /**
    * Specifies the desired type of axis values.
    */
  var valueType: js.UndefOr[datetime | numeric | string_] = js.undefined
}
object Inverted {
  
  inline def apply(): Inverted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Inverted]
  }
  
  extension [Self <: Inverted](x: Self) {
    
    inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
    
    inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
    
    inline def setLogarithmBase(value: Double): Self = StObject.set(x, "logarithmBase", value.asInstanceOf[js.Any])
    
    inline def setLogarithmBaseUndefined: Self = StObject.set(x, "logarithmBase", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setType(value: continuous | logarithmic): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValueType(value: datetime | numeric | string_): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    
    inline def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
  }
}
