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
    * Array of Interval read values. If positive then it means consumption, if negative it means export. Required when interval-reads query parameter equals FULL or  MIN_30.<br>Each read value indicates the read for the interval specified by readIntervalLength beginning at midnight of readStartDate (for example 00:00 to 00:30 would be the first reading in a 30 minute Interval)
    */
  var intervalReads: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /**
    * Read interval length in minutes. Required when interval-reads query parameter equals FULL or MIN_30
    */
  var readIntervalLength: js.UndefOr[Double | Null] = js.undefined
  
  /**
    *  Specifies quality of reads that are not ACTUAL.  For read indices that are not specified, quality is assumed to be ACTUAL. If not present, all quality of all reads are assumed to be actual. Required when interval-reads query parameter equals FULL or MIN_30
    */
  var readQualities: js.UndefOr[EndInterval | Null] = js.undefined
}
object AggregateValue {
  
  inline def apply(aggregateValue: Double): AggregateValue = {
    val __obj = js.Dynamic.literal(aggregateValue = aggregateValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregateValue] (val x: Self) extends AnyVal {
    
    inline def setAggregateValue(value: Double): Self = StObject.set(x, "aggregateValue", value.asInstanceOf[js.Any])
    
    inline def setIntervalReads(value: js.Array[Double]): Self = StObject.set(x, "intervalReads", value.asInstanceOf[js.Any])
    
    inline def setIntervalReadsNull: Self = StObject.set(x, "intervalReads", null)
    
    inline def setIntervalReadsUndefined: Self = StObject.set(x, "intervalReads", js.undefined)
    
    inline def setIntervalReadsVarargs(value: Double*): Self = StObject.set(x, "intervalReads", js.Array(value*))
    
    inline def setReadIntervalLength(value: Double): Self = StObject.set(x, "readIntervalLength", value.asInstanceOf[js.Any])
    
    inline def setReadIntervalLengthNull: Self = StObject.set(x, "readIntervalLength", null)
    
    inline def setReadIntervalLengthUndefined: Self = StObject.set(x, "readIntervalLength", js.undefined)
    
    inline def setReadQualities(value: EndInterval): Self = StObject.set(x, "readQualities", value.asInstanceOf[js.Any])
    
    inline def setReadQualitiesNull: Self = StObject.set(x, "readQualities", null)
    
    inline def setReadQualitiesUndefined: Self = StObject.set(x, "readQualities", js.undefined)
  }
}
