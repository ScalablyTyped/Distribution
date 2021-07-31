package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchPutAssetPropertyValueRequest extends StObject {
  
  /**
    * The list of asset property value entries for the batch put request. You can specify up to 10 entries per request.
    */
  var entries: PutAssetPropertyValueEntries
}
object BatchPutAssetPropertyValueRequest {
  
  @scala.inline
  def apply(entries: PutAssetPropertyValueEntries): BatchPutAssetPropertyValueRequest = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPutAssetPropertyValueRequest]
  }
  
  @scala.inline
  implicit class BatchPutAssetPropertyValueRequestMutableBuilder[Self <: BatchPutAssetPropertyValueRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: PutAssetPropertyValueEntries): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesVarargs(value: PutAssetPropertyValueEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
  }
}
