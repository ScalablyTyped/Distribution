package typings.awsSdk.sqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetQueueUrlRequest extends StObject {
  
  /**
    * The name of the queue whose URL must be fetched. Maximum 80 characters. Valid values: alphanumeric characters, hyphens (-), and underscores (_). Queue URLs and names are case-sensitive.
    */
  var QueueName: String
  
  /**
    * The Amazon Web Services account ID of the account that created the queue.
    */
  var QueueOwnerAWSAccountId: js.UndefOr[String] = js.undefined
}
object GetQueueUrlRequest {
  
  inline def apply(QueueName: String): GetQueueUrlRequest = {
    val __obj = js.Dynamic.literal(QueueName = QueueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueueUrlRequest]
  }
  
  extension [Self <: GetQueueUrlRequest](x: Self) {
    
    inline def setQueueName(value: String): Self = StObject.set(x, "QueueName", value.asInstanceOf[js.Any])
    
    inline def setQueueOwnerAWSAccountId(value: String): Self = StObject.set(x, "QueueOwnerAWSAccountId", value.asInstanceOf[js.Any])
    
    inline def setQueueOwnerAWSAccountIdUndefined: Self = StObject.set(x, "QueueOwnerAWSAccountId", js.undefined)
  }
}
