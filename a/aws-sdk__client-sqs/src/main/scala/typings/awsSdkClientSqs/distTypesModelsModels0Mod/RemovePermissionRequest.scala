package typings.awsSdkClientSqs.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemovePermissionRequest extends StObject {
  
  /**
    * <p>The identification of the permission to remove. This is the label added using the <code>
    *                <a>AddPermission</a>
    *             </code> action.</p>
    */
  var Label: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The URL of the Amazon SQS queue from which permissions are removed.</p>
    *          <p>Queue URLs and names are case-sensitive.</p>
    */
  var QueueUrl: js.UndefOr[String] = js.undefined
}
object RemovePermissionRequest {
  
  inline def apply(): RemovePermissionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemovePermissionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemovePermissionRequest] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
    
    inline def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
    
    inline def setQueueUrlUndefined: Self = StObject.set(x, "QueueUrl", js.undefined)
  }
}
