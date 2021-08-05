package typings.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRecordsInput extends StObject {
  
  /**
    * The records associated with the request.
    */
  var Records: PutRecordsRequestEntryList
  
  /**
    * The stream name associated with the request.
    */
  var StreamName: typings.awsSdk.kinesisMod.StreamName
}
object PutRecordsInput {
  
  inline def apply(Records: PutRecordsRequestEntryList, StreamName: StreamName): PutRecordsInput = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRecordsInput]
  }
  
  extension [Self <: PutRecordsInput](x: Self) {
    
    inline def setRecords(value: PutRecordsRequestEntryList): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
    
    inline def setRecordsVarargs(value: PutRecordsRequestEntry*): Self = StObject.set(x, "Records", js.Array(value :_*))
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
  }
}
