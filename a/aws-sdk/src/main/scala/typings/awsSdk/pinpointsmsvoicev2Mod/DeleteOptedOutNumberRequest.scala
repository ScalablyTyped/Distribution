package typings.awsSdk.pinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteOptedOutNumberRequest extends StObject {
  
  /**
    * The OptOutListName or OptOutListArn to remove the phone number from.
    */
  var OptOutListName: OptOutListNameOrArn
  
  /**
    * The phone number, in E.164 format, to remove from the OptOutList.
    */
  var OptedOutNumber: PhoneNumber
}
object DeleteOptedOutNumberRequest {
  
  inline def apply(OptOutListName: OptOutListNameOrArn, OptedOutNumber: PhoneNumber): DeleteOptedOutNumberRequest = {
    val __obj = js.Dynamic.literal(OptOutListName = OptOutListName.asInstanceOf[js.Any], OptedOutNumber = OptedOutNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOptedOutNumberRequest]
  }
  
  extension [Self <: DeleteOptedOutNumberRequest](x: Self) {
    
    inline def setOptOutListName(value: OptOutListNameOrArn): Self = StObject.set(x, "OptOutListName", value.asInstanceOf[js.Any])
    
    inline def setOptedOutNumber(value: PhoneNumber): Self = StObject.set(x, "OptedOutNumber", value.asInstanceOf[js.Any])
  }
}
