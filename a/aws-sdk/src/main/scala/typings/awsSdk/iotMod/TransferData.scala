package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferData extends StObject {
  
  /**
    * The date the transfer was accepted.
    */
  var acceptDate: js.UndefOr[DateType] = js.undefined
  
  /**
    * The date the transfer was rejected.
    */
  var rejectDate: js.UndefOr[DateType] = js.undefined
  
  /**
    * The reason why the transfer was rejected.
    */
  var rejectReason: js.UndefOr[Message] = js.undefined
  
  /**
    * The date the transfer took place.
    */
  var transferDate: js.UndefOr[DateType] = js.undefined
  
  /**
    * The transfer message.
    */
  var transferMessage: js.UndefOr[Message] = js.undefined
}
object TransferData {
  
  inline def apply(): TransferData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferData]
  }
  
  extension [Self <: TransferData](x: Self) {
    
    inline def setAcceptDate(value: DateType): Self = StObject.set(x, "acceptDate", value.asInstanceOf[js.Any])
    
    inline def setAcceptDateUndefined: Self = StObject.set(x, "acceptDate", js.undefined)
    
    inline def setRejectDate(value: DateType): Self = StObject.set(x, "rejectDate", value.asInstanceOf[js.Any])
    
    inline def setRejectDateUndefined: Self = StObject.set(x, "rejectDate", js.undefined)
    
    inline def setRejectReason(value: Message): Self = StObject.set(x, "rejectReason", value.asInstanceOf[js.Any])
    
    inline def setRejectReasonUndefined: Self = StObject.set(x, "rejectReason", js.undefined)
    
    inline def setTransferDate(value: DateType): Self = StObject.set(x, "transferDate", value.asInstanceOf[js.Any])
    
    inline def setTransferDateUndefined: Self = StObject.set(x, "transferDate", js.undefined)
    
    inline def setTransferMessage(value: Message): Self = StObject.set(x, "transferMessage", value.asInstanceOf[js.Any])
    
    inline def setTransferMessageUndefined: Self = StObject.set(x, "transferMessage", js.undefined)
  }
}
