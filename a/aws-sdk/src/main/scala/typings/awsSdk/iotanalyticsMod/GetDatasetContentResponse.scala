package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDatasetContentResponse extends StObject {
  
  /**
    * A list of DatasetEntry objects.
    */
  var entries: js.UndefOr[DatasetEntries] = js.native
  
  /**
    * The status of the data set content.
    */
  var status: js.UndefOr[DatasetContentStatus] = js.native
  
  /**
    * The time when the request was made.
    */
  var timestamp: js.UndefOr[Timestamp] = js.native
}
object GetDatasetContentResponse {
  
  @scala.inline
  def apply(): GetDatasetContentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDatasetContentResponse]
  }
  
  @scala.inline
  implicit class GetDatasetContentResponseMutableBuilder[Self <: GetDatasetContentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: DatasetEntries): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: DatasetEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: DatasetContentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Timestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
