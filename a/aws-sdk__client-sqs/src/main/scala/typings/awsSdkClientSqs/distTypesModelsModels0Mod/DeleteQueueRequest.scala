package typings.awsSdkClientSqs.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteQueueRequest extends StObject {
  
  /**
    * <p>The URL of the Amazon SQS queue to delete.</p>
    *          <p>Queue URLs and names are case-sensitive.</p>
    */
  var QueueUrl: js.UndefOr[String] = js.undefined
}
object DeleteQueueRequest {
  
  inline def apply(): DeleteQueueRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteQueueRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteQueueRequest] (val x: Self) extends AnyVal {
    
    inline def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
    
    inline def setQueueUrlUndefined: Self = StObject.set(x, "QueueUrl", js.undefined)
  }
}
