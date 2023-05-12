package typings.awsSdk.clientsTimestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchLoadProgressReport extends StObject {
  
  /**
    * 
    */
  var BytesMetered: js.UndefOr[Long] = js.undefined
  
  /**
    * 
    */
  var FileFailures: js.UndefOr[Long] = js.undefined
  
  /**
    * 
    */
  var ParseFailures: js.UndefOr[Long] = js.undefined
  
  /**
    * 
    */
  var RecordIngestionFailures: js.UndefOr[Long] = js.undefined
  
  /**
    * 
    */
  var RecordsIngested: js.UndefOr[Long] = js.undefined
  
  /**
    * 
    */
  var RecordsProcessed: js.UndefOr[Long] = js.undefined
}
object BatchLoadProgressReport {
  
  inline def apply(): BatchLoadProgressReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchLoadProgressReport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchLoadProgressReport] (val x: Self) extends AnyVal {
    
    inline def setBytesMetered(value: Long): Self = StObject.set(x, "BytesMetered", value.asInstanceOf[js.Any])
    
    inline def setBytesMeteredUndefined: Self = StObject.set(x, "BytesMetered", js.undefined)
    
    inline def setFileFailures(value: Long): Self = StObject.set(x, "FileFailures", value.asInstanceOf[js.Any])
    
    inline def setFileFailuresUndefined: Self = StObject.set(x, "FileFailures", js.undefined)
    
    inline def setParseFailures(value: Long): Self = StObject.set(x, "ParseFailures", value.asInstanceOf[js.Any])
    
    inline def setParseFailuresUndefined: Self = StObject.set(x, "ParseFailures", js.undefined)
    
    inline def setRecordIngestionFailures(value: Long): Self = StObject.set(x, "RecordIngestionFailures", value.asInstanceOf[js.Any])
    
    inline def setRecordIngestionFailuresUndefined: Self = StObject.set(x, "RecordIngestionFailures", js.undefined)
    
    inline def setRecordsIngested(value: Long): Self = StObject.set(x, "RecordsIngested", value.asInstanceOf[js.Any])
    
    inline def setRecordsIngestedUndefined: Self = StObject.set(x, "RecordsIngested", js.undefined)
    
    inline def setRecordsProcessed(value: Long): Self = StObject.set(x, "RecordsProcessed", value.asInstanceOf[js.Any])
    
    inline def setRecordsProcessedUndefined: Self = StObject.set(x, "RecordsProcessed", js.undefined)
  }
}
