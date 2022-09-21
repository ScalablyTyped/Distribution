package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamingDataPreviewOptions extends StObject {
  
  /**
    * The polling time in milliseconds.
    */
  var PollingTime: js.UndefOr[typings.awsSdk.glueMod.PollingTime] = js.undefined
  
  /**
    * The limit to the number of records polled.
    */
  var RecordPollingLimit: js.UndefOr[PositiveLong] = js.undefined
}
object StreamingDataPreviewOptions {
  
  inline def apply(): StreamingDataPreviewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamingDataPreviewOptions]
  }
  
  extension [Self <: StreamingDataPreviewOptions](x: Self) {
    
    inline def setPollingTime(value: PollingTime): Self = StObject.set(x, "PollingTime", value.asInstanceOf[js.Any])
    
    inline def setPollingTimeUndefined: Self = StObject.set(x, "PollingTime", js.undefined)
    
    inline def setRecordPollingLimit(value: PositiveLong): Self = StObject.set(x, "RecordPollingLimit", value.asInstanceOf[js.Any])
    
    inline def setRecordPollingLimitUndefined: Self = StObject.set(x, "RecordPollingLimit", js.undefined)
  }
}
