package typings.awsSdkClientSqs.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMessageBatchResultEntry extends StObject {
  
  /**
    * <p>Represents a successfully deleted message.</p>
    */
  var Id: js.UndefOr[String] = js.undefined
}
object DeleteMessageBatchResultEntry {
  
  inline def apply(): DeleteMessageBatchResultEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteMessageBatchResultEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteMessageBatchResultEntry] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
