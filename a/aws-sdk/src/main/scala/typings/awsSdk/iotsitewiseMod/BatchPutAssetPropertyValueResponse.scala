package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchPutAssetPropertyValueResponse extends StObject {
  
  /**
    * A list of the errors (if any) associated with the batch put request. Each error entry contains the entryId of the entry that failed.
    */
  var errorEntries: BatchPutAssetPropertyErrorEntries
}
object BatchPutAssetPropertyValueResponse {
  
  inline def apply(errorEntries: BatchPutAssetPropertyErrorEntries): BatchPutAssetPropertyValueResponse = {
    val __obj = js.Dynamic.literal(errorEntries = errorEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPutAssetPropertyValueResponse]
  }
  
  extension [Self <: BatchPutAssetPropertyValueResponse](x: Self) {
    
    inline def setErrorEntries(value: BatchPutAssetPropertyErrorEntries): Self = StObject.set(x, "errorEntries", value.asInstanceOf[js.Any])
    
    inline def setErrorEntriesVarargs(value: BatchPutAssetPropertyErrorEntry*): Self = StObject.set(x, "errorEntries", js.Array(value :_*))
  }
}
