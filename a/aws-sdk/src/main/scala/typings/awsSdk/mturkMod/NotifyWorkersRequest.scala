package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotifyWorkersRequest extends StObject {
  
  /**
    * The text of the email message to send. Can include up to 4,096 characters
    */
  var MessageText: String
  
  /**
    * The subject line of the email message to send. Can include up to 200 characters.
    */
  var Subject: String
  
  /**
    * A list of Worker IDs you wish to notify. You can notify upto 100 Workers at a time.
    */
  var WorkerIds: CustomerIdList
}
object NotifyWorkersRequest {
  
  @scala.inline
  def apply(MessageText: String, Subject: String, WorkerIds: CustomerIdList): NotifyWorkersRequest = {
    val __obj = js.Dynamic.literal(MessageText = MessageText.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], WorkerIds = WorkerIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyWorkersRequest]
  }
  
  @scala.inline
  implicit class NotifyWorkersRequestMutableBuilder[Self <: NotifyWorkersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageText(value: String): Self = StObject.set(x, "MessageText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerIds(value: CustomerIdList): Self = StObject.set(x, "WorkerIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerIdsVarargs(value: CustomerId*): Self = StObject.set(x, "WorkerIds", js.Array(value :_*))
  }
}
