package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferData extends js.Object {
  
  /**
    * The date the transfer was accepted.
    */
  var acceptDate: js.UndefOr[DateType] = js.native
  
  /**
    * The date the transfer was rejected.
    */
  var rejectDate: js.UndefOr[DateType] = js.native
  
  /**
    * The reason why the transfer was rejected.
    */
  var rejectReason: js.UndefOr[Message] = js.native
  
  /**
    * The date the transfer took place.
    */
  var transferDate: js.UndefOr[DateType] = js.native
  
  /**
    * The transfer message.
    */
  var transferMessage: js.UndefOr[Message] = js.native
}
object TransferData {
  
  @scala.inline
  def apply(): TransferData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferData]
  }
  
  @scala.inline
  implicit class TransferDataOps[Self <: TransferData] (val x: Self) extends AnyVal {
    
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
    def setAcceptDate(value: DateType): Self = this.set("acceptDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptDate: Self = this.set("acceptDate", js.undefined)
    
    @scala.inline
    def setRejectDate(value: DateType): Self = this.set("rejectDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejectDate: Self = this.set("rejectDate", js.undefined)
    
    @scala.inline
    def setRejectReason(value: Message): Self = this.set("rejectReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejectReason: Self = this.set("rejectReason", js.undefined)
    
    @scala.inline
    def setTransferDate(value: DateType): Self = this.set("transferDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransferDate: Self = this.set("transferDate", js.undefined)
    
    @scala.inline
    def setTransferMessage(value: Message): Self = this.set("transferMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransferMessage: Self = this.set("transferMessage", js.undefined)
  }
}
