package typings.awsSdkClientSqsNode.typesBatchResultErrorEntryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchResultErrorEntry extends js.Object {
  
  /**
    * <p>An error code representing why the action failed on this entry.</p>
    */
  var Code: String = js.native
  
  /**
    * <p>The <code>Id</code> of an entry in a batch request.</p>
    */
  var Id: String = js.native
  
  /**
    * <p>A message explaining why the action failed on this entry.</p>
    */
  var Message: js.UndefOr[String] = js.native
  
  /**
    * <p>Specifies whether the error happened due to the producer.</p>
    */
  var SenderFault: Boolean = js.native
}
object BatchResultErrorEntry {
  
  @scala.inline
  def apply(Code: String, Id: String, SenderFault: Boolean): BatchResultErrorEntry = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], SenderFault = SenderFault.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchResultErrorEntry]
  }
  
  @scala.inline
  implicit class BatchResultErrorEntryOps[Self <: BatchResultErrorEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCode(value: String): Self = this.set("Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderFault(value: Boolean): Self = this.set("SenderFault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
  }
}
