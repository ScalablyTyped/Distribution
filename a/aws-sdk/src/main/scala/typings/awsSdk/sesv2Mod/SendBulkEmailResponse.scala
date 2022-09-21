package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendBulkEmailResponse extends StObject {
  
  /**
    * One object per intended recipient. Check each response object and retry any messages with a failure status.
    */
  var BulkEmailEntryResults: BulkEmailEntryResultList
}
object SendBulkEmailResponse {
  
  inline def apply(BulkEmailEntryResults: BulkEmailEntryResultList): SendBulkEmailResponse = {
    val __obj = js.Dynamic.literal(BulkEmailEntryResults = BulkEmailEntryResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendBulkEmailResponse]
  }
  
  extension [Self <: SendBulkEmailResponse](x: Self) {
    
    inline def setBulkEmailEntryResults(value: BulkEmailEntryResultList): Self = StObject.set(x, "BulkEmailEntryResults", value.asInstanceOf[js.Any])
    
    inline def setBulkEmailEntryResultsVarargs(value: BulkEmailEntryResult*): Self = StObject.set(x, "BulkEmailEntryResults", js.Array(value*))
  }
}
