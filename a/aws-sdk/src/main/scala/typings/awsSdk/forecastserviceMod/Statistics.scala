package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Statistics extends StObject {
  
  /**
    * For a numeric field, the average value in the field.
    */
  var Avg: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of values in the field.
    */
  var Count: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of distinct values in the field.
    */
  var CountDistinct: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of NAN (not a number) values in the field.
    */
  var CountNan: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of null values in the field.
    */
  var CountNull: js.UndefOr[Integer] = js.undefined
  
  /**
    * For a numeric field, the maximum value in the field.
    */
  var Max: js.UndefOr[String] = js.undefined
  
  /**
    * For a numeric field, the minimum value in the field.
    */
  var Min: js.UndefOr[String] = js.undefined
  
  /**
    * For a numeric field, the standard deviation.
    */
  var Stddev: js.UndefOr[Double] = js.undefined
}
object Statistics {
  
  @scala.inline
  def apply(): Statistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Statistics]
  }
  
  @scala.inline
  implicit class StatisticsMutableBuilder[Self <: Statistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvg(value: Double): Self = StObject.set(x, "Avg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvgUndefined: Self = StObject.set(x, "Avg", js.undefined)
    
    @scala.inline
    def setCount(value: Integer): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountDistinct(value: Integer): Self = StObject.set(x, "CountDistinct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountDistinctUndefined: Self = StObject.set(x, "CountDistinct", js.undefined)
    
    @scala.inline
    def setCountNan(value: Integer): Self = StObject.set(x, "CountNan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountNanUndefined: Self = StObject.set(x, "CountNan", js.undefined)
    
    @scala.inline
    def setCountNull(value: Integer): Self = StObject.set(x, "CountNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountNullUndefined: Self = StObject.set(x, "CountNull", js.undefined)
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    @scala.inline
    def setMax(value: String): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "Max", js.undefined)
    
    @scala.inline
    def setMin(value: String): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "Min", js.undefined)
    
    @scala.inline
    def setStddev(value: Double): Self = StObject.set(x, "Stddev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStddevUndefined: Self = StObject.set(x, "Stddev", js.undefined)
  }
}
