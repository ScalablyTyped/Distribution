package typings.awsSdk.sqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteMessageBatchRequest extends StObject {
  
  /**
    * A list of receipt handles for the messages to be deleted.
    */
  var Entries: DeleteMessageBatchRequestEntryList = js.native
  
  /**
    * The URL of the Amazon SQS queue from which messages are deleted. Queue URLs and names are case-sensitive.
    */
  var QueueUrl: String = js.native
}
object DeleteMessageBatchRequest {
  
  @scala.inline
  def apply(Entries: DeleteMessageBatchRequestEntryList, QueueUrl: String): DeleteMessageBatchRequest = {
    val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMessageBatchRequest]
  }
  
  @scala.inline
  implicit class DeleteMessageBatchRequestMutableBuilder[Self <: DeleteMessageBatchRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: DeleteMessageBatchRequestEntryList): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesVarargs(value: DeleteMessageBatchRequestEntry*): Self = StObject.set(x, "Entries", js.Array(value :_*))
    
    @scala.inline
    def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
  }
}
