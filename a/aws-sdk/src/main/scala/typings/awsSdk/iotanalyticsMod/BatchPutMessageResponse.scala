package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchPutMessageResponse extends StObject {
  
  /**
    * A list of any errors encountered when sending the messages to the channel.
    */
  var batchPutMessageErrorEntries: js.UndefOr[BatchPutMessageErrorEntries] = js.native
}
object BatchPutMessageResponse {
  
  @scala.inline
  def apply(): BatchPutMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchPutMessageResponse]
  }
  
  @scala.inline
  implicit class BatchPutMessageResponseMutableBuilder[Self <: BatchPutMessageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchPutMessageErrorEntries(value: BatchPutMessageErrorEntries): Self = StObject.set(x, "batchPutMessageErrorEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchPutMessageErrorEntriesUndefined: Self = StObject.set(x, "batchPutMessageErrorEntries", js.undefined)
    
    @scala.inline
    def setBatchPutMessageErrorEntriesVarargs(value: BatchPutMessageErrorEntry*): Self = StObject.set(x, "batchPutMessageErrorEntries", js.Array(value :_*))
  }
}
