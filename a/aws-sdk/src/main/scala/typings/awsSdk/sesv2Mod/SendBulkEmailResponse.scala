package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendBulkEmailResponse extends StObject {
  
  var BulkEmailEntryResults: BulkEmailEntryResultList = js.native
}
object SendBulkEmailResponse {
  
  @scala.inline
  def apply(BulkEmailEntryResults: BulkEmailEntryResultList): SendBulkEmailResponse = {
    val __obj = js.Dynamic.literal(BulkEmailEntryResults = BulkEmailEntryResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendBulkEmailResponse]
  }
  
  @scala.inline
  implicit class SendBulkEmailResponseMutableBuilder[Self <: SendBulkEmailResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBulkEmailEntryResults(value: BulkEmailEntryResultList): Self = StObject.set(x, "BulkEmailEntryResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulkEmailEntryResultsVarargs(value: BulkEmailEntryResult*): Self = StObject.set(x, "BulkEmailEntryResults", js.Array(value :_*))
  }
}
