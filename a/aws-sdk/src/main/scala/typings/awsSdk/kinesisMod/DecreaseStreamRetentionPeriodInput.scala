package typings.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecreaseStreamRetentionPeriodInput extends StObject {
  
  /**
    * The new retention period of the stream, in hours. Must be less than the current retention period.
    */
  var RetentionPeriodHours: typings.awsSdk.kinesisMod.RetentionPeriodHours
  
  /**
    * The name of the stream to modify.
    */
  var StreamName: typings.awsSdk.kinesisMod.StreamName
}
object DecreaseStreamRetentionPeriodInput {
  
  inline def apply(RetentionPeriodHours: RetentionPeriodHours, StreamName: StreamName): DecreaseStreamRetentionPeriodInput = {
    val __obj = js.Dynamic.literal(RetentionPeriodHours = RetentionPeriodHours.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecreaseStreamRetentionPeriodInput]
  }
  
  extension [Self <: DecreaseStreamRetentionPeriodInput](x: Self) {
    
    inline def setRetentionPeriodHours(value: RetentionPeriodHours): Self = StObject.set(x, "RetentionPeriodHours", value.asInstanceOf[js.Any])
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
  }
}
