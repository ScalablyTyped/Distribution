package typings.awsSdk.cognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRecordsResponse extends StObject {
  
  /**
    * A list of records that have been updated.
    */
  var Records: js.UndefOr[RecordList] = js.native
}
object UpdateRecordsResponse {
  
  @scala.inline
  def apply(): UpdateRecordsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRecordsResponse]
  }
  
  @scala.inline
  implicit class UpdateRecordsResponseMutableBuilder[Self <: UpdateRecordsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecords(value: RecordList): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsUndefined: Self = StObject.set(x, "Records", js.undefined)
    
    @scala.inline
    def setRecordsVarargs(value: Record*): Self = StObject.set(x, "Records", js.Array(value :_*))
  }
}
