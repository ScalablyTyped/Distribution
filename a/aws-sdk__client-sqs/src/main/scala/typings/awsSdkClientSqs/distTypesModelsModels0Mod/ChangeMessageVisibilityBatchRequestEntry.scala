package typings.awsSdkClientSqs.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeMessageVisibilityBatchRequestEntry extends StObject {
  
  /**
    * <p>An identifier for this particular receipt handle used to communicate the result.</p>
    *          <note>
    *             <p>The <code>Id</code>s of a batch request need to be unique within a request.</p>
    *             <p>This identifier can have up to 80 characters. The following characters are accepted: alphanumeric characters, hyphens(-), and underscores (_).</p>
    *          </note>
    */
  var Id: js.UndefOr[String] = js.undefined
  
  /**
    * <p>A receipt handle.</p>
    */
  var ReceiptHandle: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The new value (in seconds) for the message's visibility timeout.</p>
    */
  var VisibilityTimeout: js.UndefOr[Double] = js.undefined
}
object ChangeMessageVisibilityBatchRequestEntry {
  
  inline def apply(): ChangeMessageVisibilityBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeMessageVisibilityBatchRequestEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeMessageVisibilityBatchRequestEntry] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setReceiptHandle(value: String): Self = StObject.set(x, "ReceiptHandle", value.asInstanceOf[js.Any])
    
    inline def setReceiptHandleUndefined: Self = StObject.set(x, "ReceiptHandle", js.undefined)
    
    inline def setVisibilityTimeout(value: Double): Self = StObject.set(x, "VisibilityTimeout", value.asInstanceOf[js.Any])
    
    inline def setVisibilityTimeoutUndefined: Self = StObject.set(x, "VisibilityTimeout", js.undefined)
  }
}
