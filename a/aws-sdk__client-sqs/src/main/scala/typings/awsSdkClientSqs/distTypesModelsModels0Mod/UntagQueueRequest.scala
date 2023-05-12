package typings.awsSdkClientSqs.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagQueueRequest extends StObject {
  
  /**
    * <p>The URL of the queue.</p>
    */
  var QueueUrl: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The list of tags to be removed from the specified queue.</p>
    */
  var TagKeys: js.UndefOr[js.Array[String]] = js.undefined
}
object UntagQueueRequest {
  
  inline def apply(): UntagQueueRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UntagQueueRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UntagQueueRequest] (val x: Self) extends AnyVal {
    
    inline def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
    
    inline def setQueueUrlUndefined: Self = StObject.set(x, "QueueUrl", js.undefined)
    
    inline def setTagKeys(value: js.Array[String]): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysUndefined: Self = StObject.set(x, "TagKeys", js.undefined)
    
    inline def setTagKeysVarargs(value: String*): Self = StObject.set(x, "TagKeys", js.Array(value*))
  }
}
