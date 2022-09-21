package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateValue
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The aggregate sum of the interval read values. If positive then it means net consumption, if negative it means net export
    */
  var aggregateValue: Double
  
  /**
    * Array of reads with each element indicating the read for the interval specified by readIntervalLength beginning at midnight of readStartDate (for example 00:00 to 00:30 would be the first reading in a 30 minute Interval)
    */
  var intervalReads: js.Array[Value]
  
  /**
    * Read interval length in minutes
    */
  var readIntervalLength: Double
}
object AggregateValue {
  
  inline def apply(aggregateValue: Double, intervalReads: js.Array[Value], readIntervalLength: Double): AggregateValue = {
    val __obj = js.Dynamic.literal(aggregateValue = aggregateValue.asInstanceOf[js.Any], intervalReads = intervalReads.asInstanceOf[js.Any], readIntervalLength = readIntervalLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateValue]
  }
  
  extension [Self <: AggregateValue](x: Self) {
    
    inline def setAggregateValue(value: Double): Self = StObject.set(x, "aggregateValue", value.asInstanceOf[js.Any])
    
    inline def setIntervalReads(value: js.Array[Value]): Self = StObject.set(x, "intervalReads", value.asInstanceOf[js.Any])
    
    inline def setIntervalReadsVarargs(value: Value*): Self = StObject.set(x, "intervalReads", js.Array(value*))
    
    inline def setReadIntervalLength(value: Double): Self = StObject.set(x, "readIntervalLength", value.asInstanceOf[js.Any])
  }
}
