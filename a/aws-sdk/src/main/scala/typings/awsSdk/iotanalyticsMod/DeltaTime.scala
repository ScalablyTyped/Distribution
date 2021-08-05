package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeltaTime extends StObject {
  
  /**
    * The number of seconds of estimated in-flight lag time of message data. When you create dataset contents using message data from a specified timeframe, some message data might still be in flight when processing begins, and so do not arrive in time to be processed. Use this field to make allowances for the in flight time of your message data, so that data not processed from a previous timeframe is included with the next timeframe. Otherwise, missed message data would be excluded from processing during the next timeframe too, because its timestamp places it within the previous timeframe.
    */
  var offsetSeconds: OffsetSeconds
  
  /**
    * An expression by which the time of the message data might be determined. This can be the name of a timestamp field or a SQL expression that is used to derive the time the message data was generated.
    */
  var timeExpression: TimeExpression
}
object DeltaTime {
  
  inline def apply(offsetSeconds: OffsetSeconds, timeExpression: TimeExpression): DeltaTime = {
    val __obj = js.Dynamic.literal(offsetSeconds = offsetSeconds.asInstanceOf[js.Any], timeExpression = timeExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeltaTime]
  }
  
  extension [Self <: DeltaTime](x: Self) {
    
    inline def setOffsetSeconds(value: OffsetSeconds): Self = StObject.set(x, "offsetSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeExpression(value: TimeExpression): Self = StObject.set(x, "timeExpression", value.asInstanceOf[js.Any])
  }
}
