package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregatedValue extends StObject {
  
  /**
    * The quality of the aggregated data.
    */
  var quality: js.UndefOr[Quality] = js.undefined
  
  /**
    * The date the aggregating computations occurred, in Unix epoch time.
    */
  var timestamp: Timestamp
  
  /**
    * The value of the aggregates.
    */
  var value: Aggregates
}
object AggregatedValue {
  
  @scala.inline
  def apply(timestamp: Timestamp, value: Aggregates): AggregatedValue = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregatedValue]
  }
  
  @scala.inline
  implicit class AggregatedValueMutableBuilder[Self <: AggregatedValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuality(value: Quality): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Timestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Aggregates): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
