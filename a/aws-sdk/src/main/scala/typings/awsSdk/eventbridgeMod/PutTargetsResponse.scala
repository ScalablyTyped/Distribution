package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutTargetsResponse extends StObject {
  
  /**
    * The failed target entries.
    */
  var FailedEntries: js.UndefOr[PutTargetsResultEntryList] = js.undefined
  
  /**
    * The number of failed entries.
    */
  var FailedEntryCount: js.UndefOr[Integer] = js.undefined
}
object PutTargetsResponse {
  
  inline def apply(): PutTargetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutTargetsResponse]
  }
  
  extension [Self <: PutTargetsResponse](x: Self) {
    
    inline def setFailedEntries(value: PutTargetsResultEntryList): Self = StObject.set(x, "FailedEntries", value.asInstanceOf[js.Any])
    
    inline def setFailedEntriesUndefined: Self = StObject.set(x, "FailedEntries", js.undefined)
    
    inline def setFailedEntriesVarargs(value: PutTargetsResultEntry*): Self = StObject.set(x, "FailedEntries", js.Array(value :_*))
    
    inline def setFailedEntryCount(value: Integer): Self = StObject.set(x, "FailedEntryCount", value.asInstanceOf[js.Any])
    
    inline def setFailedEntryCountUndefined: Self = StObject.set(x, "FailedEntryCount", js.undefined)
  }
}
