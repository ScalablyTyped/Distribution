package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLogRecordRequest extends StObject {
  
  /**
    * The pointer corresponding to the log event record you want to retrieve. You get this from the response of a GetQueryResults operation. In that response, the value of the @ptr field for a log event is the value to use as logRecordPointer to retrieve that complete log event record.
    */
  var logRecordPointer: LogRecordPointer
}
object GetLogRecordRequest {
  
  inline def apply(logRecordPointer: LogRecordPointer): GetLogRecordRequest = {
    val __obj = js.Dynamic.literal(logRecordPointer = logRecordPointer.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLogRecordRequest]
  }
  
  extension [Self <: GetLogRecordRequest](x: Self) {
    
    inline def setLogRecordPointer(value: LogRecordPointer): Self = StObject.set(x, "logRecordPointer", value.asInstanceOf[js.Any])
  }
}
