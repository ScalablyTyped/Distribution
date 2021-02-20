package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutTargetsResponse extends StObject {
  
  /**
    * The failed target entries.
    */
  var FailedEntries: js.UndefOr[PutTargetsResultEntryList] = js.native
  
  /**
    * The number of failed entries.
    */
  var FailedEntryCount: js.UndefOr[Integer] = js.native
}
object PutTargetsResponse {
  
  @scala.inline
  def apply(): PutTargetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutTargetsResponse]
  }
  
  @scala.inline
  implicit class PutTargetsResponseMutableBuilder[Self <: PutTargetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedEntries(value: PutTargetsResultEntryList): Self = StObject.set(x, "FailedEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedEntriesUndefined: Self = StObject.set(x, "FailedEntries", js.undefined)
    
    @scala.inline
    def setFailedEntriesVarargs(value: PutTargetsResultEntry*): Self = StObject.set(x, "FailedEntries", js.Array(value :_*))
    
    @scala.inline
    def setFailedEntryCount(value: Integer): Self = StObject.set(x, "FailedEntryCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedEntryCountUndefined: Self = StObject.set(x, "FailedEntryCount", js.undefined)
  }
}
