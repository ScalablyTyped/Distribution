package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait chartPointAggregationInfoObject extends StObject {
  
  /**
    * Contains the length of the aggregation interval in axis units (numbers or dates). If the interval is set in pixels (using the aggregationGroupWidth property), it will be converted to axis units.
    */
  var aggregationInterval: js.UndefOr[Any] = js.undefined
  
  /**
    * Contains data objects that were aggregated into this point.
    */
  var data: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Contains the end value of the interval to which the point belongs.
    */
  var intervalEnd: js.UndefOr[Any] = js.undefined
  
  /**
    * Contains the start value of the interval to which the point belongs.
    */
  var intervalStart: js.UndefOr[Any] = js.undefined
}
object chartPointAggregationInfoObject {
  
  inline def apply(): chartPointAggregationInfoObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[chartPointAggregationInfoObject]
  }
  
  extension [Self <: chartPointAggregationInfoObject](x: Self) {
    
    inline def setAggregationInterval(value: Any): Self = StObject.set(x, "aggregationInterval", value.asInstanceOf[js.Any])
    
    inline def setAggregationIntervalUndefined: Self = StObject.set(x, "aggregationInterval", js.undefined)
    
    inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setIntervalEnd(value: Any): Self = StObject.set(x, "intervalEnd", value.asInstanceOf[js.Any])
    
    inline def setIntervalEndUndefined: Self = StObject.set(x, "intervalEnd", js.undefined)
    
    inline def setIntervalStart(value: Any): Self = StObject.set(x, "intervalStart", value.asInstanceOf[js.Any])
    
    inline def setIntervalStartUndefined: Self = StObject.set(x, "intervalStart", js.undefined)
  }
}
