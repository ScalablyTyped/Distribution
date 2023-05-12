package typings.awsSdkClientSqs.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchResultErrorEntry extends StObject {
  
  /**
    * <p>An error code representing why the action failed on this entry.</p>
    */
  var Code: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The <code>Id</code> of an entry in a batch request.</p>
    */
  var Id: js.UndefOr[String] = js.undefined
  
  /**
    * <p>A message explaining why the action failed on this entry.</p>
    */
  var Message: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Specifies whether the error happened due to the caller of the batch API action.</p>
    */
  var SenderFault: js.UndefOr[Boolean] = js.undefined
}
object BatchResultErrorEntry {
  
  inline def apply(): BatchResultErrorEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchResultErrorEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchResultErrorEntry] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setSenderFault(value: Boolean): Self = StObject.set(x, "SenderFault", value.asInstanceOf[js.Any])
    
    inline def setSenderFaultUndefined: Self = StObject.set(x, "SenderFault", js.undefined)
  }
}
