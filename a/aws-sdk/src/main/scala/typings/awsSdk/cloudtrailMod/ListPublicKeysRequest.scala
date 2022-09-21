package typings.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPublicKeysRequest extends StObject {
  
  /**
    * Optionally specifies, in UTC, the end of the time range to look up public keys for CloudTrail digest files. If not specified, the current time is used.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Reserved for future use.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Optionally specifies, in UTC, the start of the time range to look up public keys for CloudTrail digest files. If not specified, the current time is used, and the current public key is returned.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
}
object ListPublicKeysRequest {
  
  inline def apply(): ListPublicKeysRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPublicKeysRequest]
  }
  
  extension [Self <: ListPublicKeysRequest](x: Self) {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
