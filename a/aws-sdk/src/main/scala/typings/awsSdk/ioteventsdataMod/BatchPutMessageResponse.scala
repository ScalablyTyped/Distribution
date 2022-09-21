package typings.awsSdk.ioteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchPutMessageResponse extends StObject {
  
  /**
    * A list of any errors encountered when sending the messages.
    */
  var BatchPutMessageErrorEntries: js.UndefOr[typings.awsSdk.ioteventsdataMod.BatchPutMessageErrorEntries] = js.undefined
}
object BatchPutMessageResponse {
  
  inline def apply(): BatchPutMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchPutMessageResponse]
  }
  
  extension [Self <: BatchPutMessageResponse](x: Self) {
    
    inline def setBatchPutMessageErrorEntries(value: BatchPutMessageErrorEntries): Self = StObject.set(x, "BatchPutMessageErrorEntries", value.asInstanceOf[js.Any])
    
    inline def setBatchPutMessageErrorEntriesUndefined: Self = StObject.set(x, "BatchPutMessageErrorEntries", js.undefined)
    
    inline def setBatchPutMessageErrorEntriesVarargs(value: BatchPutMessageErrorEntry*): Self = StObject.set(x, "BatchPutMessageErrorEntries", js.Array(value*))
  }
}
