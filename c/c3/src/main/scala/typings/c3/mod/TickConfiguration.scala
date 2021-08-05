package typings.c3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TickConfiguration extends StObject {
  
  /**
    * The number of x axis ticks to show.
    * This option hides tick lines together with tick text. If this option is used on timeseries axis, the ticks position will be determined precisely and not nicely positioned (e.g. it will
    * have rough second value).
    */
  var count: js.UndefOr[Double] = js.undefined
  
  /**
    * Show x axis outer tick.
    */
  var outer: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Rotate x axis tick text. If you set negative value, it will rotate to opposite direction.
    */
  var rotate: js.UndefOr[Double] = js.undefined
  
  /**
    * Set the x values of ticks manually.
    * If this option is provided, the position of the ticks will be determined based on those values. This option works with timeseries data and the x values will be parsed accoding to the type
    * of the value and data.xFormat option.
    */
  var values: js.UndefOr[js.Array[Double | String]] = js.undefined
}
object TickConfiguration {
  
  inline def apply(): TickConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TickConfiguration]
  }
  
  extension [Self <: TickConfiguration](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setOuter(value: Boolean): Self = StObject.set(x, "outer", value.asInstanceOf[js.Any])
    
    inline def setOuterUndefined: Self = StObject.set(x, "outer", js.undefined)
    
    inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    inline def setValues(value: js.Array[Double | String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: (Double | String)*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
