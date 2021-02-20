package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailedCreateAssociation extends StObject {
  
  /**
    * The association.
    */
  var Entry: js.UndefOr[CreateAssociationBatchRequestEntry] = js.native
  
  /**
    * The source of the failure.
    */
  var Fault: js.UndefOr[typings.awsSdk.ssmMod.Fault] = js.native
  
  /**
    * A description of the failure.
    */
  var Message: js.UndefOr[BatchErrorMessage] = js.native
}
object FailedCreateAssociation {
  
  @scala.inline
  def apply(): FailedCreateAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedCreateAssociation]
  }
  
  @scala.inline
  implicit class FailedCreateAssociationMutableBuilder[Self <: FailedCreateAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntry(value: CreateAssociationBatchRequestEntry): Self = StObject.set(x, "Entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryUndefined: Self = StObject.set(x, "Entry", js.undefined)
    
    @scala.inline
    def setFault(value: Fault): Self = StObject.set(x, "Fault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaultUndefined: Self = StObject.set(x, "Fault", js.undefined)
    
    @scala.inline
    def setMessage(value: BatchErrorMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
