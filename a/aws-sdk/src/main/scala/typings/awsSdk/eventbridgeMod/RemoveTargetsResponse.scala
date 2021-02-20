package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveTargetsResponse extends StObject {
  
  /**
    * The failed target entries.
    */
  var FailedEntries: js.UndefOr[RemoveTargetsResultEntryList] = js.native
  
  /**
    * The number of failed entries.
    */
  var FailedEntryCount: js.UndefOr[Integer] = js.native
}
object RemoveTargetsResponse {
  
  @scala.inline
  def apply(): RemoveTargetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveTargetsResponse]
  }
  
  @scala.inline
  implicit class RemoveTargetsResponseMutableBuilder[Self <: RemoveTargetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedEntries(value: RemoveTargetsResultEntryList): Self = StObject.set(x, "FailedEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedEntriesUndefined: Self = StObject.set(x, "FailedEntries", js.undefined)
    
    @scala.inline
    def setFailedEntriesVarargs(value: RemoveTargetsResultEntry*): Self = StObject.set(x, "FailedEntries", js.Array(value :_*))
    
    @scala.inline
    def setFailedEntryCount(value: Integer): Self = StObject.set(x, "FailedEntryCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedEntryCountUndefined: Self = StObject.set(x, "FailedEntryCount", js.undefined)
  }
}
