package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailedCreateAssociation extends js.Object {
  
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
  implicit class FailedCreateAssociationOps[Self <: FailedCreateAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEntry(value: CreateAssociationBatchRequestEntry): Self = this.set("Entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntry: Self = this.set("Entry", js.undefined)
    
    @scala.inline
    def setFault(value: Fault): Self = this.set("Fault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFault: Self = this.set("Fault", js.undefined)
    
    @scala.inline
    def setMessage(value: BatchErrorMessage): Self = this.set("Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
  }
}
