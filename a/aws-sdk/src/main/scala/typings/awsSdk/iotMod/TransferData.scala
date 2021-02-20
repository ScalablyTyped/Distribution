package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferData extends StObject {
  
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
  implicit class TransferDataMutableBuilder[Self <: TransferData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptDate(value: DateType): Self = StObject.set(x, "acceptDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptDateUndefined: Self = StObject.set(x, "acceptDate", js.undefined)
    
    @scala.inline
    def setRejectDate(value: DateType): Self = StObject.set(x, "rejectDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectDateUndefined: Self = StObject.set(x, "rejectDate", js.undefined)
    
    @scala.inline
    def setRejectReason(value: Message): Self = StObject.set(x, "rejectReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectReasonUndefined: Self = StObject.set(x, "rejectReason", js.undefined)
    
    @scala.inline
    def setTransferDate(value: DateType): Self = StObject.set(x, "transferDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferDateUndefined: Self = StObject.set(x, "transferDate", js.undefined)
    
    @scala.inline
    def setTransferMessage(value: Message): Self = StObject.set(x, "transferMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferMessageUndefined: Self = StObject.set(x, "transferMessage", js.undefined)
  }
}
