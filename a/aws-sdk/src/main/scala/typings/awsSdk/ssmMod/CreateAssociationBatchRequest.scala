package typings.awsSdk.ssmMod

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
  
  @scala.inline
  def apply(Entries: CreateAssociationBatchRequestEntries): CreateAssociationBatchRequest = {
    val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssociationBatchRequest]
  }
  
  @scala.inline
  implicit class CreateAssociationBatchRequestMutableBuilder[Self <: CreateAssociationBatchRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: CreateAssociationBatchRequestEntries): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesVarargs(value: CreateAssociationBatchRequestEntry*): Self = StObject.set(x, "Entries", js.Array(value :_*))
  }
}
