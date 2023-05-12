package typings.awsSdkClientSqs.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMessageBatchRequestEntry extends StObject {
  
  /**
    * <p>An identifier for this particular receipt handle. This is used to communicate the result.</p>
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
}
object DeleteMessageBatchRequestEntry {
  
  inline def apply(): DeleteMessageBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteMessageBatchRequestEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteMessageBatchRequestEntry] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setReceiptHandle(value: String): Self = StObject.set(x, "ReceiptHandle", value.asInstanceOf[js.Any])
    
    inline def setReceiptHandleUndefined: Self = StObject.set(x, "ReceiptHandle", js.undefined)
  }
}
