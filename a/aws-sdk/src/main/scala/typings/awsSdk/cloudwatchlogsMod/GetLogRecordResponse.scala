package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLogRecordResponse extends StObject {
  
  /**
    * The requested log event, as a JSON string.
    */
  var logRecord: js.UndefOr[LogRecord] = js.undefined
}
object GetLogRecordResponse {
  
  @scala.inline
  def apply(): GetLogRecordResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLogRecordResponse]
  }
  
  @scala.inline
  implicit class GetLogRecordResponseMutableBuilder[Self <: GetLogRecordResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogRecord(value: LogRecord): Self = StObject.set(x, "logRecord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogRecordUndefined: Self = StObject.set(x, "logRecord", js.undefined)
  }
}
