package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketStatisticsRequest extends StObject {
  
  /**
    * The unique identifier for the Amazon Web Services account.
    */
  var accountId: js.UndefOr[string] = js.undefined
}
object GetBucketStatisticsRequest {
  
  inline def apply(): GetBucketStatisticsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketStatisticsRequest]
  }
  
  extension [Self <: GetBucketStatisticsRequest](x: Self) {
    
    inline def setAccountId(value: string): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
  }
}
