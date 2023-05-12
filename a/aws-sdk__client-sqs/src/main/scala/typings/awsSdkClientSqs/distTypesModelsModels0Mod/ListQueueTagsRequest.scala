package typings.awsSdkClientSqs.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListQueueTagsRequest extends StObject {
  
  /**
    * <p>The URL of the queue.</p>
    */
  var QueueUrl: js.UndefOr[String] = js.undefined
}
object ListQueueTagsRequest {
  
  inline def apply(): ListQueueTagsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQueueTagsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListQueueTagsRequest] (val x: Self) extends AnyVal {
    
    inline def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
    
    inline def setQueueUrlUndefined: Self = StObject.set(x, "QueueUrl", js.undefined)
  }
}
