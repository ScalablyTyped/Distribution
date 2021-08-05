package typings.awsSdk.sqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeMessageVisibilityBatchResultEntry extends StObject {
  
  /**
    * Represents a message whose visibility timeout has been changed successfully.
    */
  var Id: String
}
object ChangeMessageVisibilityBatchResultEntry {
  
  inline def apply(Id: String): ChangeMessageVisibilityBatchResultEntry = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeMessageVisibilityBatchResultEntry]
  }
  
  extension [Self <: ChangeMessageVisibilityBatchResultEntry](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
