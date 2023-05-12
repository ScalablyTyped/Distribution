package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAssociationBatchRequest extends StObject {
  
  /**
    * One or more associations.
    */
  var Entries: CreateAssociationBatchRequestEntries
}
object CreateAssociationBatchRequest {
  
  inline def apply(Entries: CreateAssociationBatchRequestEntries): CreateAssociationBatchRequest = {
    val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssociationBatchRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAssociationBatchRequest] (val x: Self) extends AnyVal {
    
    inline def setEntries(value: CreateAssociationBatchRequestEntries): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: CreateAssociationBatchRequestEntry*): Self = StObject.set(x, "Entries", js.Array(value*))
  }
}
