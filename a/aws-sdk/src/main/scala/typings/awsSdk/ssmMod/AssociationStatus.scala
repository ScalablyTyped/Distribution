package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociationStatus extends StObject {
  
  /**
    * A user-defined string.
    */
  var AdditionalInfo: js.UndefOr[StatusAdditionalInfo] = js.undefined
  
  /**
    * The date when the status changed.
    */
  var Date: DateTime
  
  /**
    * The reason for the status.
    */
  var Message: StatusMessage
  
  /**
    * The status.
    */
  var Name: AssociationStatusName
}
object AssociationStatus {
  
  inline def apply(Date: DateTime, Message: StatusMessage, Name: AssociationStatusName): AssociationStatus = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociationStatus]
  }
  
  extension [Self <: AssociationStatus](x: Self) {
    
    inline def setAdditionalInfo(value: StatusAdditionalInfo): Self = StObject.set(x, "AdditionalInfo", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoUndefined: Self = StObject.set(x, "AdditionalInfo", js.undefined)
    
    inline def setDate(value: DateTime): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: StatusMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setName(value: AssociationStatusName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
