package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAssociationBatchRequest extends js.Object {
  
  /**
    * One or more associations.
    */
  var Entries: CreateAssociationBatchRequestEntries = js.native
}
object CreateAssociationBatchRequest {
  
  @scala.inline
  def apply(Entries: CreateAssociationBatchRequestEntries): CreateAssociationBatchRequest = {
    val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssociationBatchRequest]
  }
  
  @scala.inline
  implicit class CreateAssociationBatchRequestOps[Self <: CreateAssociationBatchRequest] (val x: Self) extends AnyVal {
    
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
    def setEntriesVarargs(value: CreateAssociationBatchRequestEntry*): Self = this.set("Entries", js.Array(value :_*))
    
    @scala.inline
    def setEntries(value: CreateAssociationBatchRequestEntries): Self = this.set("Entries", value.asInstanceOf[js.Any])
  }
}
