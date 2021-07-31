package typings.awsSdk.piMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataPoint extends StObject {
  
  /**
    * The time, in epoch format, associated with a particular Value.
    */
  var Timestamp: ISOTimestamp
  
  /**
    * The actual value associated with a particular Timestamp.
    */
  var Value: Double
}
object DataPoint {
  
  @scala.inline
  def apply(Timestamp: ISOTimestamp, Value: Double): DataPoint = {
    val __obj = js.Dynamic.literal(Timestamp = Timestamp.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPoint]
  }
  
  @scala.inline
  implicit class DataPointMutableBuilder[Self <: DataPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimestamp(value: ISOTimestamp): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
