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
  
  inline def apply(Timestamp: ISOTimestamp, Value: Double): DataPoint = {
    val __obj = js.Dynamic.literal(Timestamp = Timestamp.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPoint]
  }
  
  extension [Self <: DataPoint](x: Self) {
    
    inline def setTimestamp(value: ISOTimestamp): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
