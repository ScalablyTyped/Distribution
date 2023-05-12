package typings.awsSdkClientSqs.distTypesModelsModels0Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagQueueRequest extends StObject {
  
  /**
    * <p>The URL of the queue.</p>
    */
  var QueueUrl: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The list of tags to be added to the specified queue.</p>
    */
  var Tags: js.UndefOr[Record[String, String]] = js.undefined
}
object TagQueueRequest {
  
  inline def apply(): TagQueueRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagQueueRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagQueueRequest] (val x: Self) extends AnyVal {
    
    inline def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
    
    inline def setQueueUrlUndefined: Self = StObject.set(x, "QueueUrl", js.undefined)
    
    inline def setTags(value: Record[String, String]): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
