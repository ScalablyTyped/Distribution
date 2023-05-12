package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancellationReason extends StObject {
  
  /**
    * <p>Status code for the result of the cancelled transaction.</p>
    */
  var Code: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Item in the request which caused the transaction to get cancelled.</p>
    */
  var Item: js.UndefOr[Record[String, AttributeValue]] = js.undefined
  
  /**
    * <p>Cancellation reason message description.</p>
    */
  var Message: js.UndefOr[String] = js.undefined
}
object CancellationReason {
  
  inline def apply(): CancellationReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancellationReason]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancellationReason] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setItem(value: Record[String, AttributeValue]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
