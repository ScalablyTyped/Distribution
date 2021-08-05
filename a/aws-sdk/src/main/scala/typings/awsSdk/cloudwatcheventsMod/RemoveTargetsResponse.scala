package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveTargetsResponse extends StObject {
  
  /**
    * The failed target entries.
    */
  var FailedEntries: js.UndefOr[RemoveTargetsResultEntryList] = js.undefined
  
  /**
    * The number of failed entries.
    */
  var FailedEntryCount: js.UndefOr[Integer] = js.undefined
}
object RemoveTargetsResponse {
  
  inline def apply(): RemoveTargetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveTargetsResponse]
  }
  
  extension [Self <: RemoveTargetsResponse](x: Self) {
    
    inline def setFailedEntries(value: RemoveTargetsResultEntryList): Self = StObject.set(x, "FailedEntries", value.asInstanceOf[js.Any])
    
    inline def setFailedEntriesUndefined: Self = StObject.set(x, "FailedEntries", js.undefined)
    
    inline def setFailedEntriesVarargs(value: RemoveTargetsResultEntry*): Self = StObject.set(x, "FailedEntries", js.Array(value :_*))
    
    inline def setFailedEntryCount(value: Integer): Self = StObject.set(x, "FailedEntryCount", value.asInstanceOf[js.Any])
    
    inline def setFailedEntryCountUndefined: Self = StObject.set(x, "FailedEntryCount", js.undefined)
  }
}
