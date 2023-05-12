package typings.awsSdkClientSqs.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetQueueUrlRequest extends StObject {
  
  /**
    * <p>The name of the queue whose URL must be fetched. Maximum 80 characters. Valid values: alphanumeric characters, hyphens (<code>-</code>), and underscores (<code>_</code>).</p>
    *          <p>Queue URLs and names are case-sensitive.</p>
    */
  var QueueName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The Amazon Web Services account ID of the account that created the queue.</p>
    */
  var QueueOwnerAWSAccountId: js.UndefOr[String] = js.undefined
}
object GetQueueUrlRequest {
  
  inline def apply(): GetQueueUrlRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetQueueUrlRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetQueueUrlRequest] (val x: Self) extends AnyVal {
    
    inline def setQueueName(value: String): Self = StObject.set(x, "QueueName", value.asInstanceOf[js.Any])
    
    inline def setQueueNameUndefined: Self = StObject.set(x, "QueueName", js.undefined)
    
    inline def setQueueOwnerAWSAccountId(value: String): Self = StObject.set(x, "QueueOwnerAWSAccountId", value.asInstanceOf[js.Any])
    
    inline def setQueueOwnerAWSAccountIdUndefined: Self = StObject.set(x, "QueueOwnerAWSAccountId", js.undefined)
  }
}
