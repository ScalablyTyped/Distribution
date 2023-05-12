package typings.awsSdkClientSqs.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurgeQueueRequest extends StObject {
  
  /**
    * <p>The URL of the queue from which the <code>PurgeQueue</code> action deletes messages.</p>
    *          <p>Queue URLs and names are case-sensitive.</p>
    */
  var QueueUrl: js.UndefOr[String] = js.undefined
}
object PurgeQueueRequest {
  
  inline def apply(): PurgeQueueRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurgeQueueRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PurgeQueueRequest] (val x: Self) extends AnyVal {
    
    inline def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
    
    inline def setQueueUrlUndefined: Self = StObject.set(x, "QueueUrl", js.undefined)
  }
}
