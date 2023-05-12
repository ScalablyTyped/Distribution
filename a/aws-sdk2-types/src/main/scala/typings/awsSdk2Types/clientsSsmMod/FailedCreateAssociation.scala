package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailedCreateAssociation extends StObject {
  
  /**
    * The association.
    */
  var Entry: js.UndefOr[CreateAssociationBatchRequestEntry] = js.undefined
  
  /**
    * The source of the failure.
    */
  var Fault: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.Fault] = js.undefined
  
  /**
    * A description of the failure.
    */
  var Message: js.UndefOr[BatchErrorMessage] = js.undefined
}
object FailedCreateAssociation {
  
  inline def apply(): FailedCreateAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedCreateAssociation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FailedCreateAssociation] (val x: Self) extends AnyVal {
    
    inline def setEntry(value: CreateAssociationBatchRequestEntry): Self = StObject.set(x, "Entry", value.asInstanceOf[js.Any])
    
    inline def setEntryUndefined: Self = StObject.set(x, "Entry", js.undefined)
    
    inline def setFault(value: Fault): Self = StObject.set(x, "Fault", value.asInstanceOf[js.Any])
    
    inline def setFaultUndefined: Self = StObject.set(x, "Fault", js.undefined)
    
    inline def setMessage(value: BatchErrorMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
