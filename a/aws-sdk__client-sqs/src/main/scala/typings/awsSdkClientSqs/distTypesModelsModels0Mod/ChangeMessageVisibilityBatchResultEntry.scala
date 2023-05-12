package typings.awsSdkClientSqs.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeMessageVisibilityBatchResultEntry extends StObject {
  
  /**
    * <p>Represents a message whose visibility timeout has been changed successfully.</p>
    */
  var Id: js.UndefOr[String] = js.undefined
}
object ChangeMessageVisibilityBatchResultEntry {
  
  inline def apply(): ChangeMessageVisibilityBatchResultEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeMessageVisibilityBatchResultEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeMessageVisibilityBatchResultEntry] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
