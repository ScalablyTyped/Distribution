package typings.awsSdk.sqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeMessageVisibilityBatchRequest extends StObject {
  
  /**
    * A list of receipt handles of the messages for which the visibility timeout must be changed.
    */
  var Entries: ChangeMessageVisibilityBatchRequestEntryList
  
  /**
    * The URL of the Amazon SQS queue whose messages' visibility is changed. Queue URLs and names are case-sensitive.
    */
  var QueueUrl: String
}
object ChangeMessageVisibilityBatchRequest {
  
  @scala.inline
  def apply(Entries: ChangeMessageVisibilityBatchRequestEntryList, QueueUrl: String): ChangeMessageVisibilityBatchRequest = {
    val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeMessageVisibilityBatchRequest]
  }
  
  @scala.inline
  implicit class ChangeMessageVisibilityBatchRequestMutableBuilder[Self <: ChangeMessageVisibilityBatchRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: ChangeMessageVisibilityBatchRequestEntryList): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesVarargs(value: ChangeMessageVisibilityBatchRequestEntry*): Self = StObject.set(x, "Entries", js.Array(value :_*))
    
    @scala.inline
    def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
  }
}
